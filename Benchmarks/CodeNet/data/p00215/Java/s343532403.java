
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	/** ゲームごとのマップのリスト */
	private static List<String[][]> mapList = new ArrayList<String[][]>();

	/** スタート地点を表す文字 */
	private static final String START = "S";

	public static void main(String[] args) throws IOException {

		// 入力値の読み込み
		setMapOnGames();

		for (String[][] map : mapList) {

			// 各属性が座標のどこにいるかを求める
			Map<String, List<String>> attributeMap = getAttributeMap(map);

			// すべての属性がそろっていない場合は、"NA"を出力
			if (attributeMap.keySet().size() != 7) {
				System.out.println("NA");
				continue;
			}

			// 移動数が最小となるスタート時の属性と移動数を求める
			String minAttribute = null;
			int minMoveCount = Integer.MAX_VALUE;
			for (int i = 1; i <= 5; i++) {
				String startAttribute = String.valueOf(i);
				int totalMoveCount = calcTotalMoveCount(attributeMap,
						attributeMap.get(START).get(0), String.valueOf(i), 1);

				if (totalMoveCount < minMoveCount) {
					minAttribute = startAttribute;
					minMoveCount = totalMoveCount;
				}
			}
			System.out.println(minAttribute + " " + minMoveCount);
		}
	}

	/**
	 * <p>
	 * 入力値を取得し、Gameクラスにセットする
	 * </p>
	 *
	 * @throws IOException
	 */
	private static void setMapOnGames() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {

			// 空のマップを作成する
			String[] mapSize = line.split(" ");
			int sizeX = Integer.parseInt(mapSize[0]);
			int sizeY = Integer.parseInt(mapSize[1]);
			String[][] map = new String[sizeY][sizeX];

			// マップの情報をセットする
			for (String[] xMap : map) {
				String xLine = br.readLine();
				for (int i = 0; i < sizeX; i++) {
					xMap[i] = String.valueOf(xLine.charAt(i));
				}
			}

			mapList.add(map);
		}
	}

	private static Map<String, List<String>> getAttributeMap(String[][] map) {

		Map<String, List<String>> attributeMap = new HashMap<String, List<String>>();
		;

		// マップから、各属性が存在する座標を取り出し、属性存在Mapに退避する
		int y = 0;
		for (String[] xMap : map) {
			int x = 0;
			for (String str : xMap) {
				if (!".".equals(str)) {
					if (!attributeMap.containsKey(str)) {
						attributeMap.put(str, new ArrayList<String>());
					}
					attributeMap.get(str).add(x + "," + y);
				}
				x++;
			}
			y++;
		}

		return attributeMap;

	}

	private static int calcMoveCount(String from, String to) {

		// 移動元の座標を取得
		String[] fromPoint = from.split(",");
		int fromPointX = Integer.parseInt(fromPoint[0]);
		int fromPointY = Integer.parseInt(fromPoint[1]);

		// 移動先の座標を取得
		String[] toPoint = to.split(",");
		int toPointX = Integer.parseInt(toPoint[0]);
		int toPointY = Integer.parseInt(toPoint[1]);

		// 絶対値で計算
		return Math.abs(fromPointX - toPointX)
				+ Math.abs(fromPointY - toPointY);
	}

	private static int calcTotalMoveCount(
			Map<String, List<String>> attributeMap, String coordinates,
			String lastAttribute, int creatures) {

		int totalMoveCount = Integer.MAX_VALUE;

		if (creatures == 5) {

			// パチモンが5匹集まっていたら、ゴールへの移動数を足して返す
			totalMoveCount = calcMoveCount(coordinates, attributeMap.get("G")
					.get(0));

		} else {

			// このターンで獲得できる属性を取得
			String attribute = getNextAttribute(lastAttribute);

			// 次の属性の座標を取得し、再帰的に探索
			for (String nextCoordinates : attributeMap.get(attribute)) {
				int tmpMoveCount = calcMoveCount(coordinates, nextCoordinates)
						+ calcTotalMoveCount(attributeMap, nextCoordinates,
								attribute, creatures + 1);
				if (tmpMoveCount < totalMoveCount) {
					totalMoveCount = tmpMoveCount;
				}
			}
		}

		return totalMoveCount;
	}

	private static String getNextAttribute(String attribute) {
		int nextNumber = Integer.parseInt(attribute) + 1;
		if (nextNumber == 6) {
			nextNumber = 1;
		}
		return String.valueOf(nextNumber);
	}
}
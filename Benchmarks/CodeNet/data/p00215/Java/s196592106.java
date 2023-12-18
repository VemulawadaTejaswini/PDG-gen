import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	/** 半角空白 */
	static final String WHITE_SPACE = " ";

	/** マップサイズ_X */
	static int mapSizeX = 0;

	/** マップサイズ_Y */
	static int mapSizeY = 0;

	/** 総ノード数 */
	static int maxNode = 0;

	/** パチモンのリスト */
	static List<Point> pachimonList = new ArrayList<Point>();

	/** ノードに訪れたかどうかを格納する */
	static boolean[] visited = new boolean[5003];

	/** 各ノードへのコスト */
	static int[] cost = new int[5003];

	/** 初期パチモン属性 */
	static int pachimonType = 0;

	/** 各パチモン属性の数 */
	static int[] typeNum = new int[7];

	static Comparator<Point> comparator = new Comparator<Point>() {
		@Override
		public int compare(Point o1, Point o2) {
			if (o1.x == 0)
				return -1;
			if (o1.x == 6)
				return 1;
			if (o2.x == 0)
				return 1;
			if (o2.x == 6)
				return -1;

			int c1 = o1.x >= pachimonType ? o1.x : o1.x + 6;
			int c2 = o2.x >= pachimonType ? o2.x : o2.x + 6;
			if (c1 != c2)
				return c1 - c2;
			else
				return o1.y - o2.y;
		}
	};

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String[] mapSizeLine = new String[2];
		Point output = createPos(0, Integer.MAX_VALUE);
		while (true) {
			mapSizeLine = br.readLine().split(WHITE_SPACE);
			mapSizeX = Integer.parseInt(mapSizeLine[0]);
			mapSizeY = Integer.parseInt(mapSizeLine[1]);
			if (mapSizeX == 0 && mapSizeY == 0)
				break;

			readMap(br);
			output.x = 0;
			output.y = Integer.MAX_VALUE;
			if (maxNode > 5) {
				for (int type = 1; type <= 5; type++) {
					// 最初に選んだパチモンのルートのうち、最短経路を検索
					pachimonType = type;
					Collections.sort(pachimonList, comparator);
					int cost = searchRoute(type);
					if (cost < output.y && cost > 0) {
						output.x = type;
						output.y = cost;
					}
				}
			}

			// 結果を出力
			if (output.y == Integer.MAX_VALUE) {
				System.out.println("NA");
			} else {
				System.out.println(output.x + WHITE_SPACE + output.y);
			}
		}
	}

	/**
	 * マップ一つ分を読み込む
	 * @param scanner スキャナー
	 * @throws IOException
	 */
	private static void readMap(BufferedReader br) throws IOException {
		// マップ情報の初期化
		pachimonList.removeAll(pachimonList);
		maxNode = 0;

		for (int i = 0; i < mapSizeY; i++) {
			for (int j = 0; j < mapSizeX; j++) {
				int val = convertInt(br.read());
				if (val < 9) {
					// 各パチモンの数を計算
					pachimonList.add(createPos(val, calcIndex(j, i)));
					typeNum[val]++;
				}
			}
			// 改行を読み飛ばす
			br.readLine();
		}
		maxNode = pachimonList.size();
	}

	/**
	 * アスキーコードからint型に変換する
	 * @param target 対象コード
	 * @return 変換後の値
	 */
	private static int convertInt(int target) {
		if (target == 83)
			return 0;
		if (target == 71)
			return 6;
		if (target >= 49 && target <= 53)
			return target - 48;
		return 9;
	}

	/**
	 * Xにスタート、ゴール、パチモンの属性を設定<br>
	 * スタート:0、ゴール:6、パチモンの属性:1?5<br>
	 * Yにマップのインデックスを格納
	 * @param type スタート、ゴール、パチモンの属性
	 * @param index マップのインデックス
	 * @return
	 */
	private static Point createPos(int type, int index) {
		return new Point(type, index);
	}

	/**
	 * 現在パチモンから、次に捕まえられるパチモンの属性を取得
	 * @param currentType 最初に選んだパチモンの属性
	 * @return 最初に捕まえるパチモンの属性
	 */
	private static int getNextType(int currentType) {
		if (currentType == 5)
			return 1;
		return currentType + 1;
	}

	/**
	 * 最初に選んだパチモンから、最後に捕まえるパチモンの属性を取得
	 * @param firstType 最初に選んだパチモンの属性
	 * @return 最後に捕まえるパチモンの属性
	 */
	private static int getEndType(int firstType) {
		if (firstType == 1)
			return 5;
		return firstType - 1;
	}

	/**
	 * 隣接行列に設定されたスタートからゴールまでの<br>
	 * 最短経路のコストを求める
	 * @param adjacent 隣接行列
	 * @return 最短経路のコスト
	 */
	private static int searchRoute(int firstType) {

		for (int i = 1; i < maxNode; i++) {
			cost[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}

		// スタート地点までのコストは0
		cost[0] = 0;
		for (int node = 0; node < maxNode; node++) {
			// 探索が完了したノードはフラグをたてる
			visited[node] = true;
			for (int j = node; j < maxNode; j++) {
				if (isLinked(node, j, firstType) && !visited[j]) {
					int nextNodeCost = cost[node] + clucCost(pachimonList.get(node), pachimonList.get(j));
					// 今までの距離よりも小さければ最短距離として記憶
					if (nextNodeCost < cost[j]) {
						cost[j] = nextNodeCost;
					}
				}
			}
		}
		return cost[maxNode - 1];
	}

	/**
	 * 現在のノードと対象のノードが接続しているかどうかを判別
	 * @param node 現在のノード
	 * @param target 対象のノード
	 * @return 判別結果
	 */
	private static boolean isLinked(int node, int target, int firstType) {
		int currentType = pachimonList.get(node).x;
		int targetType = pachimonList.get(target).x;
		// 初期パチモンと同じ属性は捕まえる必要がないため、接続していない
		if (currentType == firstType)
			return false;
		// 対象が初期パチモンと同じ属性の場合、接続していない
		if (targetType == firstType)
			return false;
		// ノードがゴールの場合、接続しているノードはいない
		if (currentType == maxNode)
			return false;

		// ノードがスタート("0")の場合、対象ノードが初期パチモンの属性の次なら接続している。
		if (currentType == 0)
			return targetType == getNextType(firstType);

		// 現在のノードの属性が最後に捕まえるパチモンの場合、ゴールのみ接続
		if (currentType == getEndType(firstType))
			return targetType == 6;

		return getNextType(currentType) == targetType;
	}

	/**
	 * スタートのマスから、ゴールまでのコストを計算する。
	 * @param sx スタートのX座標
	 * @param sy スタートのY座標
	 * @param gx ゴールのX座標
	 * @param gy ゴールのY座標
	 * @param nextType 次に捕まえるパチモン属性
	 */
	private static int clucCost(Point from, Point to) {
		int fx = from.y / mapSizeY;
		int fy = from.y % mapSizeY;
		int tx = to.y / mapSizeY;
		int ty = to.y % mapSizeY;
		return Math.abs(tx - fx) + Math.abs(ty - fy);
	}

	/**
	 * X座標とY座標を受け取って、配列のインデックスを返却する。
	 *
	 * @param x X座標
	 * @param y Y座標
	 * @return
	 */
	private static int calcIndex(int x, int y) {
		return x * mapSizeY + y;
	}
}
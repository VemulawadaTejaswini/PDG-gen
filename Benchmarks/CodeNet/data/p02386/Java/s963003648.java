import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int diceCount = Integer.parseInt(br.readLine());

		List<Dice> diceList = new ArrayList<Dice>();
		for (int i = 0; i < diceCount; i++) {
			String[] line = br.readLine().split(" ");
			int[] data = new int[line.length];
			for (int d = 0; d < data.length; d++) {
				data[d] = Integer.parseInt(line[d]);
			}
			Dice dice = new Dice(data);
			diceList.add(dice);
		}

		boolean result;
		for (int d1 = 0; d1 < diceList.size() - 1; d1++) {
			for (int d2 = d1 + 1; d2 < diceList.size(); d2++) {

				if (!hasSameNumber(diceList.get(d1)) && !hasSameNumber(diceList.get(d2))) {
					result = isSameDice1(diceList.get(d1), diceList.get(d2));
				} else {
					result = isSameDice2(diceList.get(d1), diceList.get(d2));
				}

				if (result) {
					System.out.println("No");
					return;
				}

			}
		}
		System.out.println("Yes");
	}

	public static boolean hasSameNumber(Dice d) {
		int[] a = d.getInitData();

		HashMap<Integer, String> temp = new HashMap<Integer, String>();
		for (int i = 0; i < a.length; i++) {
			if (temp.containsKey(a[i])) {
				return true;
			} else {
				temp.put(a[i], "");
			}
		}
		return false;
	}

	public static boolean isSameDice1(Dice d1, Dice d2) {
		String[] topPosList = d2.getPosList(d1.getData("top"));
		for (int i = 0; i < topPosList.length; i++) {
			d2.moveToTop(topPosList[i]);

			String[] frontPosList = d2.getPosList(d1.getData("front"));
			for (int j = 0; j < frontPosList.length; j++) {
				d2.spinToFront(frontPosList[j]);

				if (d1.getAllData().equals(d2.getAllData())) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean isSameDice2(Dice d1, Dice d2) {
		String[] allPosList = {"top", "bottom", "left", "right", "front", "back"};

		for (int p = 0; p < allPosList.length; p++) {
			d1.moveToTop(allPosList[p]);
			String[] topPosList = d2.getPosList(d1.getData("top"));
			for (int i = 0; i < topPosList.length; i++) {
				d2.moveToTop(topPosList[i]);

				String[] frontPosList = d2.getPosList(d1.getData("front"));
				for (int j = 0; j < frontPosList.length; j++) {
					d2.spinToFront(frontPosList[j]);

					if (d1.getAllData().equals(d2.getAllData())) {
						return true;
					}
				}
			}
		}
		return false;
	}
}

class Dice {
	HashMap<String, Integer> pos;
	private int[] d;
	Dice(int[] data) {
		this.d = data;
		pos = new HashMap<String, Integer>();
		pos.put("top"   , data[1 - 1]);
		pos.put("bottom", data[6 - 1]);
		pos.put("left"  , data[4 - 1]);
		pos.put("right" , data[3 - 1]);
		pos.put("front" , data[2 - 1]);
		pos.put("back"  , data[5 - 1]);
	}

	public int[] getInitData() {
		return this.d;
	}

	public String[] getPosList(int data) {
		List<String> posList = new ArrayList<String>();
		Iterator<HashMap.Entry<String, Integer>> ite = pos.entrySet().iterator();
		while(ite.hasNext()) {
            Map.Entry<String, Integer> entry = ite.next();

			if (data == entry.getValue()) {
				posList.add(entry.getKey());
			}
		}

		return posList.toArray(new String[posList.size()]);
	}

	public void moveToTop(String currentPos) {
		switch (currentPos) {
		case "top":
			break;

		case "bottom":
			roll('S');
			roll('S');
			break;

		case "left":
			roll('E');
			break;

		case "right":
			roll('W');
			break;

		case "front":
			roll('N');
			break;

		case "back":
			roll('S');
			break;
		}
	}

	public void spinToFront(String currentPos) {
		switch (currentPos) {
		case "front":
			break;

		case "bottom":
			break;

		case "right":
			spin('R');
			break;

		case "left":
			spin('L');
			break;

		case "back":
			spin('L');
			spin('L');
			break;
		}
	}

	public void roll(char m) {
		int temp = -1;
		switch (m) {
		case 'N':
			temp = pos.get("top");
			pos.put("top"   , pos.get("front"));
			pos.put("front" , pos.get("bottom"));
			pos.put("bottom", pos.get("back"));
			pos.put("back"  , temp);

			break;

		case 'E':
			temp = pos.get("top");
			pos.put("top"    , pos.get("left"));
			pos.put("left"   , pos.get("bottom"));
			pos.put("bottom" , pos.get("right"));
			pos.put("right"  , temp);

			break;

		case 'W':
			temp = pos.get("top");
			pos.put("top"    , pos.get("right"));
			pos.put("right"  , pos.get("bottom"));
			pos.put("bottom" , pos.get("left"));
			pos.put("left"   , temp);

			break;

		case 'S':
			temp = pos.get("top");
			pos.put("top"    , pos.get("back"));
			pos.put("back"   , pos.get("bottom"));
			pos.put("bottom" , pos.get("front"));
			pos.put("front"  , temp);

			break;
		}
	}

	public void spin(char t) {
		int temp = -1;
		switch (t) {
		case 'L':
			temp = pos.get("front");
			pos.put("front" , pos.get("left"));
			pos.put("left"  , pos.get("back"));
			pos.put("back"  , pos.get("right"));
			pos.put("right" , temp);

			break;

		case 'R':
			temp = pos.get("front");
			pos.put("front" , pos.get("right"));
			pos.put("right" , pos.get("back"));
			pos.put("back"  , pos.get("left"));
			pos.put("left"  , temp);

			break;
		}
	}

	public int getData(String p) {
		return pos.get(p);
	}

	public String getAllData() {
		StringBuilder sb = new StringBuilder();
		sb.append(pos.get("top")).append(" ");
		sb.append(pos.get("bottom")).append(" ");
		sb.append(pos.get("left")).append(" ");
		sb.append(pos.get("right")).append(" ");
		sb.append(pos.get("front")).append(" ");
		sb.append(pos.get("back"));

		return sb.toString();
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        int[] data = new int[line.length];
        for (int i = 0; i < data.length; i++) {
        	data[i] = Integer.parseInt(line[i]);
		}
        Dice dice1 = new Dice(data);


        line = br.readLine().split(" ");

        data = new int[line.length];
        for (int i = 0; i < data.length; i++) {
        	data[i] = Integer.parseInt(line[i]);
		}
        Dice dice2 = new Dice(data);


        dice2.moveToTop(dice1.getData("top"));
        dice2.moveToFront(dice1.getData("front"));

        if (dice1.getData("right") == dice2.getData("right")) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }

    }
}

class Dice {
	HashMap<String, Integer> pos;
	Dice(int[] data) {
		pos = new HashMap<String, Integer>();
		pos.put("top"   , data[1 - 1]);
		pos.put("bottom", data[6 - 1]);
		pos.put("left"  , data[4 - 1]);
		pos.put("right" , data[3 - 1]);
		pos.put("front" , data[2 - 1]);
		pos.put("back"  , data[5 - 1]);
	}

	public void moveToFront(int frontData) {
		String currentPos = "";
		Iterator<HashMap.Entry<String, Integer>> ite = pos.entrySet().iterator();
		while(ite.hasNext()) {
            Map.Entry<String, Integer> entry = ite.next();

			if (frontData == entry.getValue()) {
				currentPos = entry.getKey();
				break;
			}
		}

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

	public void moveToTop(int topData) {
		String currentPos = "";
		Iterator<HashMap.Entry<String, Integer>> ite = pos.entrySet().iterator();
		while(ite.hasNext()) {
            Map.Entry<String, Integer> entry = ite.next();

			if (topData == entry.getValue()) {
				currentPos = entry.getKey();
				break;
			}
		}

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
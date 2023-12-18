import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, Integer> dropingMap = new HashMap<String, Integer>();
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				dropingMap.put(String.valueOf(x).concat(String.valueOf(y)), 0);
			}
		}

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] s = sc.next().split(",");
			int dx = Integer.parseInt(s[0]);
			int dy = Integer.parseInt(s[1]);
			int d = Integer.parseInt(s[2]);

			if (d == 1) {
				dropMin(dx, dy, dropingMap);
			} else if (d == 2) {

				dropMid(dx, dy, dropingMap);

			} else {
				dropMax(dx, dy, dropingMap);
			}
		}
		checkMax(dropingMap);

	}

	private static void checkMax(Map<String, Integer> dropingMap) {

		int maxVal = 0;
		int coutZero = 0;
		for (Iterator dropMap = dropingMap.entrySet().iterator(); dropMap.hasNext();) {
			Map.Entry entry = (Map.Entry) dropMap.next();
			String key = (String) entry.getKey();
			int value = (Integer) entry.getValue();

			if (maxVal < value) {
				maxVal = value;
			}
			if (value == 0) {
				coutZero++;
			}
		}
		System.out.println(maxVal);
		System.out.println(coutZero);

	}

	//String　の1桁をx 2桁をy
	private static void dropMin(int x, int y, Map<String, Integer> dropMapData) {

		for (Iterator dropMap = dropMapData.entrySet().iterator(); dropMap.hasNext();) {
			Map.Entry entry = (Map.Entry) dropMap.next();
			String key = (String) entry.getKey();
			refreshMap(x, y, entry, key);

			//十字
			refreshMap(x, y + 1, entry, key);
			refreshMap(x, y - 1, entry, key);
			refreshMap(x + 1, y, entry, key);
			refreshMap(x - 1, y, entry, key);
		}

	}

	//String　の1桁をx 2桁をy
	private static void dropMid(int x, int y, Map<String, Integer> dropMapData) {

		for (Iterator dropMap = dropMapData.entrySet().iterator(); dropMap.hasNext();) {
			Map.Entry entry = (Map.Entry) dropMap.next();
			String key = (String) entry.getKey();
			refreshMap(x, y, entry, key);

			//十字+ななめ
			refreshMap(x, y + 1, entry, key);
			refreshMap(x, y - 1, entry, key);
			refreshMap(x + 1, y, entry, key);
			refreshMap(x - 1, y, entry, key);
			refreshMap(x + 1, y + 1, entry, key);
			refreshMap(x - 1, y - 1, entry, key);
			refreshMap(x + 1, y - 1, entry, key);
			refreshMap(x - 1, y + 1, entry, key);
		}

	}

	//String　の1桁をx 2桁をy
	private static void dropMax(int x, int y, Map<String, Integer> dropMapData) {

		for (Iterator dropMap = dropMapData.entrySet().iterator(); dropMap.hasNext();) {
			Map.Entry entry = (Map.Entry) dropMap.next();
			String key = (String) entry.getKey();
			refreshMap(x, y, entry, key);

			//十字+ななめ
			refreshMap(x, y + 1, entry, key);
			refreshMap(x, y - 1, entry, key);
			refreshMap(x + 1, y, entry, key);
			refreshMap(x - 1, y, entry, key);

			refreshMap(x, y + 2, entry, key);
			refreshMap(x, y - 2, entry, key);
			refreshMap(x + 2, y, entry, key);
			refreshMap(x - 2, y, entry, key);

			refreshMap(x + 1, y + 1, entry, key);
			refreshMap(x - 1, y - 1, entry, key);
			refreshMap(x + 1, y - 1, entry, key);
			refreshMap(x - 1, y + 1, entry, key);
		}

	}

	private static void refreshMap(int x, int y, Map.Entry entry, String key) {

		if (x > 9 || y > 9) {
			return;
		}

		if (key.equals((String.valueOf(x)).concat(String.valueOf(y)))) {
			entry.setValue((Integer) entry.getValue() + 1);
		}
	}
}
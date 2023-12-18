import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main{
	static HashMap<Integer, Integer> map = null;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> array = new ArrayList<String>();

		try {
			String str = null;
			while ((str = br.readLine()) != null) {
				array.add(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String[] data = array.get(0).split(" ");
		int N = Integer.parseInt(data[0]);
		int count = Integer.parseInt(data[1]);
		map = new HashMap<Integer, Integer>();

		for (int i = 1; i <= N; i++) {
			map.put(i, 0);
		}
		int maxNumber = 1;
		for (int i = 1; i <= count; i++) {
			data = array.get(i).split(" ");
			int id = Integer.parseInt(data[0]);
			int fishes = Integer.parseInt(data[1]);
			map.put(id, fishes + map.get(id));
			maxNumber = searchTop(fishes, id, maxNumber);
			System.out.println(maxNumber + " " + map.get(maxNumber));
		}
	}

	private static int searchTop(int fishes, int id, int maxNumber) {
		if (id == maxNumber) {
			if (fishes < 0) {
				for (int j : map.keySet()) {
					if (map.get(j) > map.get(maxNumber)
							|| (map.get(j) == map.get(maxNumber) && j < maxNumber)) {
						maxNumber = j;
					}
				}
			}
		} else if (map.get(id) > map.get(maxNumber)
				|| ((map.get(id) == map.get(maxNumber) && id < maxNumber))) {
			maxNumber = id;
		}
		return maxNumber;
	}

}
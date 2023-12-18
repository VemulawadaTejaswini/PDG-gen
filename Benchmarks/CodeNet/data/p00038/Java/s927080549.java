import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			ArrayList<Integer> cardsArray = new ArrayList<Integer>();
			HashMap<Integer, Integer> cardsHash = new HashMap<Integer, Integer>();

			// 手札読み込み
			for (String s : line.split(",")) {
				int i = Integer.parseInt(s);
				//
				cardsArray.add(i);
				//
				if (cardsHash.containsKey(i)) {
					cardsHash.put(i, cardsHash.get(i) + 1);
				} else {
					cardsHash.put(i, 1);
				}
			}
			// 役判定
			if (isFourCard(cardsHash)) {
				System.out.println("four card");
			} else if (isFullHouse(cardsHash)) {
				System.out.println("full house");
			} else if (isStraight(cardsArray)) {
				System.out.println("straight");
			} else if (isThreeCard(cardsHash)) {
				System.out.println("three card");
			} else if (isTwoPair(cardsHash)) {
				System.out.println("two pair");
			} else if (isOnePair(cardsHash)) {
				System.out.println("one pair");
			} else {
				System.out.println("null");
			}
		}
	}

	public static boolean isFourCard(HashMap<Integer, Integer> cards) {
		if (cards.containsValue(4))
			return true;
		return false;
	}

	public static boolean isFullHouse(HashMap<Integer, Integer> cards) {
		if (cards.containsValue(3) && cards.containsValue(2))
			return true;
		return false;
	}

	public static boolean isStraight(ArrayList<Integer> cards) {
		Integer[] temp = cards.toArray(new Integer[] {});
		Arrays.sort(temp);

		boolean result = true;

		for (int i = 0; i < 4; i++) {
			if (temp[i + 1] - temp[i] == 1)
				result &= true;
			else
				result = false;
		}

		if (temp[0] == 1 && temp[1] == 10 && temp[2] == 11 && temp[3] == 12
				&& temp[4] == 13)
			result = true;

		return result;
	}

	public static boolean isThreeCard(HashMap<Integer, Integer> cards) {
		if (cards.containsValue(3))
			return true;
		return false;
	}

	public static boolean isTwoPair(HashMap<Integer, Integer> cards) {
		int count = 0;
		for (Integer v : cards.values()) {
			if (v == 2)
				count++;
		}
		return count == 2 ? true : false;
	}

	public static boolean isOnePair(HashMap<Integer, Integer> cards) {
		int count = 0;
		for (Integer v : cards.values()) {
			if (v == 2)
				count++;
		}
		return count == 1 ? true : false;
	}
}
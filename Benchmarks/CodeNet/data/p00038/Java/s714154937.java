import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		for (String str; (str = br.readLine()) != null; ) {
			String[] data = str.split(",");
			int[] hand = new int[5];
			for (int i=0; i < 5; i++) {
				hand[i] = Integer.parseInt(data[i]); // 0, 1, 2, 3, 4
			}
			Arrays.sort(hand);

			if (fourCard(hand)) System.out.println("four card");
			else if (fullHouse(hand)) System.out.println("full house");
			else if (straight(hand)) System.out.println("straight");
			else if (threeCard(hand)) System.out.println("three card");
			else if (twoPair(hand)) System.out.println("two pair");
			else if (onePair(hand)) System.out.println("one pair");
			else System.out.println("null");
		}
	}

	public static boolean fourCard(int[] hand) {
		if (hand[1] != hand[3]) return false;
		if (hand[2] == hand[0] || hand[2] == hand[4]) return true;
		return false;
	}

	public static boolean fullHouse(int[] hand) {
		if (hand[0] == hand[1] && hand[2] == hand[4]) return true;
		if (hand[0] == hand[2] && hand[3] == hand[4]) return true;
		return false;
	}

	public static boolean straight(int[] hand) {
		if (hand[0] == 1
				&& hand[1] == 10
				&& hand[2] == 11
				&& hand[3] == 12
				&& hand[4] == 13) {
			return true;
		}
		if (hand[0] + 1 == hand[1]
				&& hand[1] + 1 == hand[2]
				&& hand[2] + 1 == hand[3]
				&& hand[3] + 1 == hand[4]) {
			return true;
		}
		return false;
	}

	public static boolean threeCard(int[] hand) {
		if (hand[0] == hand[2]) return true;
		if (hand[1] == hand[3]) return true;
		if (hand[2] == hand[4]) return true;
		return false;
	}

	public static boolean twoPair(int[] hand) {
		if (hand[0] == hand[1]
				&& hand[2] == hand[3]) {
			return true;
		}
		if (hand[0] == hand[1]
				&& hand[3] == hand[4]) {
			return true;
		}
		if (hand[1] == hand[2]
				&& hand[3] == hand[4]) {
			return true;
		}
		return false;
	}

	public static boolean onePair(int[] hand) {
		for (int i=0; i <= 3; i++) {
			if (hand[i] == hand[i+1]) return true;
		}
		return false;
	}
}
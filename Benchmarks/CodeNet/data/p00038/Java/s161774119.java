import java.util.Arrays;
import java.util.Scanner;


public class Main {

	class Hand {
		final String[] win = new String[] {
			"null", "one pair", "two pair", "three card", "straight", "full house", "four card"
		};

		int[] cards;

		public Hand(String s) {
			cards = new int[5];
			String[] ss = s.split(",");
			for (int i = 0 ; i < 5 ; i++) cards[i] = Integer.parseInt(ss[i]);
			Arrays.sort(cards);
		}

		public void display() {
			System.out.println(Arrays.toString(cards));
		}

		public int judge() {
			int[] temp = new int[5];
			int[] accum = new int[14];
			for (int i = 0 ; i < 5 ; i++) {
				temp[i] = cards[i] - cards[0];
				accum[temp[i]] += 1;
			}
			Arrays.sort(accum);
			if (Arrays.binarySearch(accum, 4) >= 0) return 6;
			if (Arrays.binarySearch(accum, 3) >= 0) {
				if (Arrays.binarySearch(accum, 2) >= 0) return 5;
				else return 3;
			}
			if (Arrays.equals(temp, (new int[] {0,1,2,3,4}))) return 4;
			int count = 0;
			for (int i = 1 ; i < 14 ; i++)
				if (accum[i] == 2) count++;
			switch (count) {
			case 1: return 1;
			case 2: return 2;
			default: return 0;
			}
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();

		String line;
		while ((line = sc.nextLine()) != null) {
			Hand hand = m.new Hand(line);
			System.out.println(hand.win[hand.judge()]);
		}

	}

}
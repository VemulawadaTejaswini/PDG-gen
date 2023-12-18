import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] splited = line.trim().split(",");

			int[] cards = new int[5];
			for (int i = 0; i < 5; i++) {
				cards[i] = Integer.parseInt(splited[i]);
			}
			Arrays.sort(cards);

			int same = 0;
			int pear = 0;
			boolean straight = true;
			for (int i = 0; i < 4; i++) {
				if (cards[i] != cards[i + 1] - 1
						&& cards[0] != cards[1] - 9) {
					straight = false;
					break;
				}
			}

			for (int i = 0; i < 4; i++) {
				for (int j = i + 1; j < 5; j++) {
					if (cards[i] == cards[j])
						same++;
				}
				i += same;
				if (pear == 0) {
					pear = same;
					same = 0;
				}
			}

			if (straight == true) {
				System.out.println("straight");
			} else if (same != 0) {
				if (same == pear)
					System.out.println("two pair");
				else
					System.out.println("full house");
			} else {
				switch (pear) {
				case 1:
					System.out.println("one pair");
					break;
				case 2:
					System.out.println("three card");
					break;
				case 3:
					System.out.println("four card");
					break;
				case 0:
					System.out.println("null");
					break;
				}
			}
		}
	}
}
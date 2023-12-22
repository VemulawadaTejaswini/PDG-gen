
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();

		String line;
		while ((line = reader.readLine()) != null) {
			if(line.isEmpty()){
				break;
			}
			StringTokenizer tokenizer = new StringTokenizer(line,",");
			int[] num = new int[5];
			for (int i = 0; i < 5; i++) {
				num[i] = Integer.parseInt(tokenizer.nextToken());
			}

			Arrays.sort(num);
			int sum = 0;
			boolean straight = true;
			for (int i = 0; i < 4; i++) {
				int j = num[i + 1] - num[i];
				if (i == 0) {
					if (j != 1 && j != 9) {
						straight = false;
					}
				} else {
					if (j != 1) {
						straight = false;
					}
				}
				if (j == 0) {
					sum += (i + 1) * (i + 2) + 1;
				}

			}

			if (straight) {
				System.out.println("straight");
			} else {
				switch (sum) {
				case 23:
				case 41:
					System.out.println("four card");
					break;
				case 31:
				case 37:
					System.out.println("full house");
					break;
				case 10:
				case 20:
				case 34:
					System.out.println("three card");
					break;
				case 16:
				case 24:
				case 28:
					System.out.println("two pair");
					break;
				case 0:
					System.out.println("null");
					break;
				default:
					System.out.println("one pair");
					break;
				}
			}
		}
	}
}
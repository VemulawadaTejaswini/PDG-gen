
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String str = scanner.nextLine();
			if (str.equals("0"))
				break;
			StringTokenizer tokenizer = new StringTokenizer(str);
			int i = tokenizer.countTokens();
			int sum = 0;
			boolean a = false;
			while (i-- > 0) {
				int num = Integer.parseInt(tokenizer.nextToken());
				if (num > 10) {
					num = 10;
				} else if (num == 1) {
					a = true;
				}
				sum += num;
			}
			if (sum > 21) {
				System.out.println(0);
			} else {
				if (a && sum < 12) {
					sum += 10;
				}
				System.out.println(sum);
			}
		}
	}
}
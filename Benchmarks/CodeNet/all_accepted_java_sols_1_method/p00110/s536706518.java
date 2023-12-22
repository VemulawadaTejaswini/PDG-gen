
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			int result = -1;
			for (int i = 0; i < 10; i++) {
				String newLine = line.replace("X", String.valueOf(i)).replace(
						"+", "=");
				String[] strs = newLine.split("=");
				if ((strs[0].length() > 1 && strs[0].charAt(0) == '0')
						|| (strs[1].length() > 1 && strs[1].charAt(0) == '0')
						|| (strs[2].length() > 1 && strs[2].charAt(0) == '0')) {
					continue;
				}
				BigInteger[] num = new BigInteger[3];
				for (int j = 0; j < 3; j++) {
					num[j] = new BigInteger(strs[j]);
				}
				if (num[0].add(num[1]).equals(num[2])) {
					result = i;
					break;
				}

			}
			System.out.println(result == -1 ? "NA" : result);
		}
	}
}
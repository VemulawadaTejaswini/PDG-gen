import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();

			int K = Integer.parseInt(data);
			BigDecimal bdK = BigDecimal.valueOf(K);

			int ans = -1;
			if (K % 2 == 0) {
				System.out.println(ans);
				return;
			}

			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				BigDecimal bd = bdK.multiply(BigDecimal.valueOf(i));
				System.out.println("BigDecimal bd = " + bd.toPlainString());
				if (isAllSeven(bd)) {
					String str = bd.toPlainString();
					ans = str.length();
					break;
				}
			}

			System.out.println(ans);
		}
	}

	private static boolean isAllSeven(BigDecimal bd) {
		String str = bd.toPlainString();
		for (char c : str.toCharArray()) {
			if (c != '7') {
				return false;
			}
		}
		return true;
	}
}
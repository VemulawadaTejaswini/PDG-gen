import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String s = scanner.nextLine();
			String t = scanner.nextLine();

			int roopCount = (s.length() -  t.length()) + 1;

			int ans = t.length();
			char[] sArr = s.toCharArray();
			char[] tArr = t.toCharArray();
			for (int i = 0; i < roopCount; i++) {
				int index = i;
				int res = 0;
				boolean isEqual = false;
				for (char tc : tArr) {
					if (tc == sArr[index++]) {
						isEqual = true;
						res++;
					}
				}
				if (isEqual) {
					ans = Math.min(ans, (t.length() - res));
				}
			}

			System.out.println(ans);
		}
	}
}
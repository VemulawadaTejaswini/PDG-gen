
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			String t = sc.next();
			char[] sArr = s.toCharArray();
			char[] tArr = t.toCharArray();

			int result = Integer.MAX_VALUE;
			for (int i = 0; i < s.length() - t.length() + 1; i++) {
				int tmp = 0;
				for (int j = 0; j < t.length(); j++) {
					if(sArr[i + j] != tArr[j]) {
						tmp++;
					}
				}
				if (tmp < result) {
					result = tmp;
				}
			}
			System.out.println(result);
		}
	}
}

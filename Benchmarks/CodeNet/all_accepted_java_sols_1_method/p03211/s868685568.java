
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i <= s.length() - 3; i++) {
			String s2 = s.substring(i, i + 3);
			int n = Integer.valueOf(s2);
			if (ans > Math.abs(753 - n)) {
				ans = Math.abs(753 - n);
			}
		}
		
		System.out.println(ans);
	}
}
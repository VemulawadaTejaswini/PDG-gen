
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(in.next());
		int ans = 0;
		for (int i = 0; i < sb.length() - 1; i++) {
			if (sb.charAt(i) == sb.charAt(i + 1)) {
				sb.replace(i + 1, i + 2, sb.charAt(i) == '0' ? "1" : "0");
				ans++;
			}
		}
		System.out.println(ans);
		in.close();
	}
}
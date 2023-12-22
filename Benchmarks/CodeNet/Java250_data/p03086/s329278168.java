
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int cnt = 0;
		int ans = 0;

		sc.close();

		for (char d : c) {
			if (d != 'A' && d != 'C' && d != 'G' && d != 'T') {
				cnt = 0;
				continue;
			}
			cnt++;
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}
}
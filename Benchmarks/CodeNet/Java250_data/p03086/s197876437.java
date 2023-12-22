import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		sc.close();

		int max = 0;
		int ans = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'A' || c[i] == 'C' || c[i] == 'G' || c[i] == 'T') {
				ans++;
				max = Math.max(max, ans);
			} else {
				ans = 0;
			}
		}
		System.out.println(max);
	}
}

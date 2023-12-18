import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			int n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			int[] k = new int[n + 1];
			int[] s = new int[n];
			for (int i = 0; i < n + 1; i++) {
				k[i] = stdIn.nextInt();
			}
			for (int i = 0; i < n; i++) {
				s[i] = k[i + 1] - k[i];
			}
			if (s[0] != s[1] && s[1] == s[2]) {
				System.out.println(k[0]);
				continue;
			}
			if (s[s.length - 1] != s[s.length - 2]
					&& s[s.length - 2] == s[s.length - 3]) {
				System.out.println(k[k.length - 1]);
				continue;
			}
			for (int i = 0; i < n - 2; i++) {
				if (s[i] != s[i + 1] && s[i + 1] != s[i + 2]) {
					System.out.println(k[i + 2]);
					break;
				}
			}
		}
	}
}
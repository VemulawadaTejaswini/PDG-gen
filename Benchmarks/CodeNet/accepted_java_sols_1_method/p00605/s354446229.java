import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] s = new int[100];
		while (n != 0 || k != 0) {
			Arrays.fill(s, 0);
			for (int i = 0; i < k; i++) {
				s[i] = in.nextInt();
			}
			boolean isYes = true;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < k; j++) {
					if (isYes) {
						s[j] -= in.nextInt();
						isYes = s[j] >= 0;
					} else {
						in.next();
					}
				}
			}
			System.out.println(isYes ? "Yes" : "No");
			n = in.nextInt();
			k = in.nextInt();
		}
	}
}
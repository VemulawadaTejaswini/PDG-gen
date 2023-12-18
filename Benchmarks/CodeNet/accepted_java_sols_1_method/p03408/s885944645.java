import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] up = new int[n];
		int[] max = new int[n];
		int MAX = 0;
		String s[] = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = scan.next();
		}
		int m = scan.nextInt();
		int[] down = new int[n];
		String t[] = new String[m];
		for (int i = 0; i < m; i++) {
			t[i] = scan.next();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (s[i].equals(s[j])) {
					up[i]++;
				}
			}
		}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (s[i].equals(t[j] )) {
						down[i]++;
					}
				}
			}
			for (int i = 0; i < n; i++) {
				max[i] = up[i] - down[i];
				if (max[i] > MAX) {
					MAX = max[i];
				}
		}
		if (MAX > 0) {
			System.out.println(MAX);
		} else {
			System.out.println(0);
		}
	}
}

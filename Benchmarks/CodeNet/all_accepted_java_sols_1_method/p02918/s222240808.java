import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		StringBuilder s = new StringBuilder(sc.next());
		s.insert(0, "X");
		s.insert(n + 1, "X");
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (s.substring(i, i + 1).equals("L")) {
				if (s.substring(i - 1, i).equals("L")) {
					cnt++;
				}
			} else {
				if (s.substring(i, i + 1).equals("R")) {
					if (s.substring(i + 1, i + 2).equals("R")) {
						cnt++;
					}
				}
			}
		}

		System.out.println(Math.min(cnt + (k * 2), n - 1));
		sc.close();
	}
}
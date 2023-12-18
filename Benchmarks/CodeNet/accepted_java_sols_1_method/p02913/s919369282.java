import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.nextLine());
			String S = sc.nextLine();
			int s = 0, e = 1;
			int max = 0;
			while (s < N && e < N) {
				String sub = S.substring(s, e);
				if (e - s > S.length() - e) break;
				boolean fit = false;
				for (int i = 0; e + i + sub.length() - 1 < N; i++) {
					String sub_sub = S.substring(e + i, e + i + sub.length());
					if (e - s < sub_sub.length()) break;

					fit = sub.equals(sub_sub);
					if (fit) {
						max = Math.max(max, sub_sub.length());
						break;
					}
				}
				if (!fit) s++;
				e++;
			}
			System.out.println(max);
		}
	}
}
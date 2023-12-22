import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			char[][] table = new char[n][2];
			for (int i = 0; i < n; i++) {
				table[i][0] = sc.next().charAt(0);
				table[i][1] = sc.next().charAt(0);
			}
			int m = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < m; i++) {
				char c = sc.next().charAt(0);
				for (int j = 0; j < n; j++) {
					if (table[j][0] == c) {
						c = table[j][1];
						break;
					}
				}
				sb.append(c);
			}
			System.out.println(sb);
		}
		sc.close();
	}
}
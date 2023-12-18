import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int[] c = new int[3];
			for (int i = 0; i < 3; i++)
				c[i] = sc.nextInt();
			int[] p = new int[7];
			for (int i = 0, j = 1; j <= 10; j++) {
				if (j == c[0] || j == c[1] || j == c[2])
					continue;
				p[i++] = j;
			}
			int t = 0;
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 7; j++) {
					if (i == j)
						continue;
					int m = c[0] + c[1] + p[i];
					if (m < 21)
						t++;
				}
			}
			System.out.println(t >= 21 ? "YES" : "NO");
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		int[] c = new int[27];
		for (int i = 1; i < 27; i++) {
			c[i] = sc.nextInt();
		}
		int[][] s = new int[d + 1][27];
		for (int i = 1; i < d + 1; i++) {
			for (int j = 1; j < 27; j++) {
				s[i][j] = sc.nextInt();
			}
		}
		int[] t = new int[d + 1];
		for (int i = 1; i <= d; i++) {
			t[i] = sc.nextInt();
		}
		sc.close();

		int[] last = new int[27];
		int v = 0;
		for (int i = 1; i <= d; i++) {
			int type = t[i];
			last[type] = i;
			v += s[i][type];
			int downSatis = 0;
			for (int j = 1; j < 27; j++) {
				downSatis += (c[j] * (i - last[j]));
			}
			v -= downSatis;
			System.out.println(v);
		}
	}
}

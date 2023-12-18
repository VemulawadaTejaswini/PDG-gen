import java.util.Scanner;

public class Main {
	static int acnt = 0, bcnt = 0;
	static boolean memo[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] map1 = new int[n];
		int[] map2 = new int[n];
		int a, b;
		for (int i = 0; i < m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == 1) {
				map1[b - 1]++;
			}
			if (b == n) {
				map2[a - 1]++;
			}
		}
		String str = "IMPOSSIBLE";
		for (int i = 0; i < n; i++) {
			if (map1[i] >= 1 && map2[i] >= 1) {
				str = "POSSIBLE";
				break;
			}
		}
		System.out.println(str);
	}
}

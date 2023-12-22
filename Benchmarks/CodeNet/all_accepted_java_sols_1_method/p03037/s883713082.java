import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = 1;
		int min = n + 1;
		int li;
		int ri;
		for (int i = 1; i <= m; i++) {
			li = sc.nextInt();
			ri = sc.nextInt();

			if (li > max) {
				max = li;
			}
			if (ri < min) {
				min = ri;
			}
		}

		int ans = min - max + 1;
		if (ans >= 0) {
			System.out.println(ans);
		} else {

			System.out.println(0);
		}
	}
}

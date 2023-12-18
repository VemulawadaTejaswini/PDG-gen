import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tt = 0;
		int tx = 0;
		int ty = 0;
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int dt = Math.abs(t - tt);
			int dx = Math.abs(x - tx);
			int dy = Math.abs(y - ty);
			if (dt < dx + dy || (dt - dx - dy) % 2 == 1) {
				System.out.println("No");
				sc.close();
				return;
			}
		}
		sc.close();
		System.out.println("Yes");
	}
}

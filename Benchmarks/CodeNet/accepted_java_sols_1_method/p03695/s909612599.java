import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] color = new int[9];
		int ans = 0;

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			color[Math.min(a/400, 8)]++;
		}

		for(int i = 0; i < 8; i++) {
			if(color[i] > 0) ans++;
		}
		int ans2 = ans + color[8];
		if(ans == 0 && color[8] > 0) ans = 1;
		System.out.printf("%d %d", ans, ans2);
		sc.close();
	}
}
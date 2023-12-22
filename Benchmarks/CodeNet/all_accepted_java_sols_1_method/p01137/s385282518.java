import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int e = sc.nextInt();
			if (e == 0) {
				break;
			}
			int ans = e;
			for (int z = 0; z * z * z <= e; z++) {
				int t = e - z * z * z;
				if (t < 0) break;
				for (int y = 0; y <= t; y++) {
					int x = t - y * y;
					if (x < 0) break;
					ans = Math.min(ans, x + y + z);
				}
			}
			System.out.println(ans);
		}
	}

}



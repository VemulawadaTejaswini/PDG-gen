import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			boolean hasAns = false;
			int ans = 0;
			for (int x = 1; x <= i/3; x++) {
				for (int y = 1; x + y <= i/3; y++) {
					for (int z = 1; x + y + z <= i/3; z++) {
						if (x * x + y * y + z * z + x * y + y * z + z * x == i) {
							if (x == y && y == z && z == x) {
								ans = 1;
							} else {
								ans = 3;
							}
							hasAns = false;
							break;
						}
					}
					if (hasAns) {
						break;
					}
				}
				if (hasAns) {
					break;
				}
			}
			System.out.println(ans);
		}

		sc.close();
	}
}
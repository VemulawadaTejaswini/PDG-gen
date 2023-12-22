import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		for (;;) {
			int n = in.nextInt();
			int x = in.nextInt();
			if (n == 0 && x == 0) {
				break;
			}
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (i > x) {
					break;
				}
				for (int j = i + 1; j <= n; j++) {
					if (i + j > x) {
						break;
					}
					for (int k = j + 1; k <= n; k++) {
						if (i + j + k == x) {
							count++;
						} else if (i + j + k > x) {
							break;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
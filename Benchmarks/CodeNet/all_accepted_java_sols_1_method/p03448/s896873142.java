
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int cnt = 0;
		int z;
		for (int i = 0; i <= a; i++) {
			z = x - 500 * i;
			// x -= 500*i;
			for (int j = 0; j <= b; j++) {
				z -= 100 * j;
				for (int k = 0; k <= c; k++) {
					// z -= 50*k;
					z = z - 50 * k;
					if (z == 0) {
						cnt++;
					}
					z = z + 50 * k;
				}
				z += 100 * j;
			}
		}
		System.out.println(cnt);
	}
}
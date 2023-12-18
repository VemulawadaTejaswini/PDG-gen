import java.util.Scanner;

// Aising2020_C
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int x, y, z = 0;
		int tmp = 0;
		int count = 0;
		for (int n = 1; n <= N; n++) {

			for (int i = 1; i < 100; i++) {
				x = i;
				for (int j = 1; j < 100; j++) {
					y = j;
					for (int k = 1; k < 100; k++) {
						z = k;
						tmp = x * x + y * y + z * z + x * y + y * z + z * x;
						if (tmp == n) {
							count++;
						}
						tmp = 0;
					}
				}
			}
			System.out.println(count);
			count = 0;
		}

		sc.close();
	}

}

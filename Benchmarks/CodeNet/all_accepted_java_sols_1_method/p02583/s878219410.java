import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] L = new long[N];
		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
		sc.close();

		int result = 0;
		int chohuku2 = 0;
		int chohuku3 = 0;
		for (int i = 0; i < N; i++) {
			long a = L[i];
			for (int j = 0; j < N; j++) {
				if (j == i) {
					break;
				}
				long b = L[j];
				for (int k = 0; k < N; k++) {
					if (k == i || k == j) {
						break;
					}
					long c = L[k];
					if (a + b > c && a + c > b && b + c > a) {
						result = result + 1;
						if (a == b && b == c && c == a) {
							chohuku3++;
						} else if (a == b || b == c || c == a) {
							chohuku2++;
						}
					}

				}
			}
		}

		System.out.println(result - chohuku2 - chohuku3);
	}

}

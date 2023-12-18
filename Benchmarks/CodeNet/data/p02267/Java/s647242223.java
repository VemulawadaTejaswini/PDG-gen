import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] numList01 = new long[n];
		for (int i = 0; i < n; i++) {
			numList01[i] = scanner.nextLong();
		}
		int m = scanner.nextInt();
		long[] numList02 = new long[n];
		for (int i = 0; i < m; i++) {
			numList02[i] = scanner.nextLong();
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (numList01[i] == numList02[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
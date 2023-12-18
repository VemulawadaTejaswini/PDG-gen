import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numList01 = new int[n];
		for (int i = 0; i < n; i++) {
			numList01[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int[] numList02 = new int[n];
		for (int i = 0; i < m; i++) {
			numList02[i] = scanner.nextInt();
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (numList01[i] == numList02[j]) {
					count++;
					
				}
			}
		}
		System.out.println(count);
	}
}
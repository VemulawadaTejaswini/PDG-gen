import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, ans = 0;
		int B[] = new int[n];
		B[n - 1] = -1;
		int sum = 0;
		for (i = 0; i < n - 1; i++)
			B[i] = sc.nextInt();

		for (i = 0; i < n - 1; i++) {
			if (B[i + 1] != -1 && B[i] > B[i + 1]) {
				sum += B[i + 1];
			} else {
				sum += B[i];
			}
		}
		ans = sum + B[0];
		System.out.println(ans);
	}
}
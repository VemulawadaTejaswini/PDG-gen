import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] L = new long[n+1];
		L[0] = 2;
		L[1] = 1;
		for (int i = 2; i <= n; i++) {
			L[i] = L[i - 1] + L[i - 2];
		}
		System.out.println(L[n]);
	}
}

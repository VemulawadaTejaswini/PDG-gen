import java.util.Scanner;

public class Main {

	static boolean[] prime;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] R = new int[n];
		for (int i=0; i<n; i++) {
			R[i] = sc.nextInt();
		}

		int ans = -2000000000;
		int min = R[0];
		for (int i=1; i<n; i++) {
			ans = Math.max(ans, R[i]-min);
			min = Math.min(min, R[i]);
		}

		System.out.println(ans);

		sc.close();
	}

}
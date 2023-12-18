import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n + 1];
		for (int i = 1; i < n + 1; i++)
			v[i] = sc.nextInt();
		sc.close();

		Arrays.sort(v);
		double ans = v[1];

		for (int i = 2; i < n + 1; i++)
			ans = (ans + v[i]) / 2;

		System.out.print(ans);

	}
}
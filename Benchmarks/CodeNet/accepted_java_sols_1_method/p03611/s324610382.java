import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[100002];
		Arrays.fill(x, 0);

		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			x[tmp]++;
			x[tmp + 1]++;
			x[tmp + 2]++;
		}

		Arrays.sort(x);

		int max = 0;
		for (int m : x) {
			max = Math.max(max, m);
		}

		System.out.println(max);

		sc.close();

	}

}
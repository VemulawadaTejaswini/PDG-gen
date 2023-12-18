import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		sc.close();

		Arrays.parallelSort(d);

		int d1 = d[n / 2 - 1];
		int d2 = d[n / 2];
		System.out.println(d2 - d1);
	}
}

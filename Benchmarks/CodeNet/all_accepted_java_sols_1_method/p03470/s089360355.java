import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		int m = 1;
		for (int i = 0; i < n - 1; i++) {
			if (d[i + 1] - d[i] != 0)
				m++;
		}
		System.out.println(m);
	}
}
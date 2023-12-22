
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] x = new int[n];
		int[] x2 = new int[n];
		int[] y = new int[n - 1];
		int[] b = new int[n];
		int m = 0;
		int m2 = 0;
		for (int i = 0; i < n; i++) {
			x[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.arraycopy(x, 0, x2, 0, n);
		Arrays.sort(x2);
		m = x2[n / 2 - 1];
		m2 = x2[n / 2];
		for (int i = 0; i < n; i++) {
			if (x[i] <= m) {
				System.out.println(m2);
			}else {
				System.out.println(m);
			}
		}
		

	}

}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];
		double ans = 1;
		double div = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextDouble();
			ans *= a[i];
		}
		for(int i = 0; i < n; i++) {
			div += ans / a[i];
		}
		ans /= div;
		System.out.println(ans);
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double[] a = new double[n];
		double p = 0;
		for (int i = 0; i < n; i++) {
			p = sc.nextDouble();
			a[i] = (p+1)/2;
		}

		double ans = 0;
		for (int i = 0; i < k; i++) {
			ans += a[i];
		}
		double max = ans;
		int i = k;
		while(i<n) {
			ans += a[i]-a[i-k];
			if(ans > max) max = ans;
			i++;
		}
		System.out.println(max);
		sc.close();
	}
}
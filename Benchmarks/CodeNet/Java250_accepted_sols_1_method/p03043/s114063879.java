import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		double K = (double) k;

		//   double[] wariai = new double[n];

		double p = 0;
		double ans = 0;
		double tmp = 0;

		for (int i = 1; i <= n; i++) {
			p = (int) Math.ceil(Math.log(K / (double)i) / Math.log(2.0));
			//    	wariai[i]= Math.pow(0.5, p);
			if (p > 0) {
				tmp = Math.pow(0.5, p);
				ans += tmp;
			} else {
				//ans += (1 / n)*(n-i+1);
				ans += (n-k+1);
				break;
			}
		}
		BigDecimal Ans = BigDecimal.valueOf(ans/n);

		System.out.println(Ans);

	}

}
import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int n = scan.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i < n; i++){
			x[i] = scan.nextInt();
		}
		for(int i = 0; i < n; i++){
			y[i] = scan.nextInt();
		}

		double d1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		double dd = 0;
		for(int i = 0; i < n; i++){
			d1 += Math.abs(x[i] - y[i]);
			sum2 += Math.pow(Math.abs(x[i] - y[i]), 2);
			sum3 += Math.pow(Math.abs(x[i] - y[i]), 3);
			dd = Math.max(dd, Math.abs(x[i] - y[i]));
		}
		double d2 = Math.sqrt(sum2);
		double d3 = Math.cbrt(sum3);
		System.out.printf("%f\n", d1);
		System.out.printf("%f\n", d2);
		System.out.printf("%f\n", d3);
		System.out.printf("%f\n", dd);
	}
}


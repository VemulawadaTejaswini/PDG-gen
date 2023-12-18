import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		
		int sum1 = 0;
		int sum2 = 0;
		long sum3 = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			y[i] = sc.nextInt();

			sum1 += Math.abs(x[i]- y[i]);
			sum2 += (x[i]- y[i]) * (x[i]- y[i]);
			sum3 += Math.abs((x[i]- y[i]) * (x[i]- y[i]) * (x[i]- y[i]));
			max = Math.max(max, Math.abs(x[i]- y[i]));
		}
		
		System.out.println(sum1);
		System.out.println(Math.sqrt(sum2));
		System.out.println(Math.pow(sum3, (double)1/3));
		System.out.println(max);

		sc.close();
	}
}
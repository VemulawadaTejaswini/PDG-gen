import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		double Dp1 = 0;
		double Dp2 = 0;
		double Dp3 = 0;
		double Dp2u = 0;
		double Dp3u = 0;
		double Dpmax = 0;
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++){
			y[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++){
			Dp1 += Math.abs(x[i]-y[i]);
			Dp2u += Math.pow(x[i]-y[i], 2);
			Dp3u += Math.pow(Math.abs(x[i]-y[i]), 3);
			Dpmax = Math.max(Dpmax, Math.abs(x[i]-y[i]));
		}
		Dp2 = Math.sqrt(Dp2u);
		Dp3 = Math.pow(Dp3u, 1.0/3.0);
		
		System.out.println(Dp1);
		System.out.println(Dp2);
		System.out.println(Dp3);
		System.out.println(Dpmax);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] X = new int[n];
		for(int i = 0; i < n; i++) {
			X[i] = sc.nextInt();
		}
		int[] Y = new int[n];
		for(int i = 0; i < n; i++) {
			Y[i] = sc.nextInt();
		}		
		
		for(int i = 1; i <= 3; i++) {
			System.out.println(dist(X, Y, n, i));
		}
		System.out.println(distInf(X, Y ,n));
		
		sc.close();
	}	
	
	static double dist(int[] X, int[] Y, int n, int p) {
		double D = 0;
		for(int i = 0; i < n; i++) {
			double d = Math.abs(X[i] - Y[i]);
			D += Math.pow(d, p);
		}
		switch(p) {
			case 1 :{
				return(D);
			}
			case 2 :{
				return(Math.sqrt(D));
			}
			case 3 :{
				return(Math.cbrt(D));
			}
			default :{
				return(-1);
			}
		}
	}
	
	static double distInf(int[] X, int[] Y, int n) {
		double D = X[0] - Y[0];
		for(int i = 0; i < n; i++) {
			D = Math.max(D, Math.abs(X[i] - Y[i]));
		}
		return(D);
	}

}


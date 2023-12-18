

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		
		int c = 0;
		double[] x = new double[100];
		double[] y = new double[100];
		while(sc.hasNext()){
			String[] s = sc.next().split(",");
			x[c] = Double.parseDouble(s[0]);
			y[c] = Double.parseDouble(s[1]);
			c++;
		}
		solve(c, x, y);
	}

	public void solve(int n, double[] x, double[] y) {
		double res = 0;
		double a = Math.hypot(x[1]-x[0], y[1]-y[0]); 
		for(int i=1;i<n-1;i++){
			double b = Math.hypot(x[i+1]-x[0], y[i+1]-y[0]);
			double c = Math.hypot(x[i+1]-x[i], y[i+1]-y[i]);
			double z = (a+b+c)/2;
			
			res += Math.sqrt(z*(z-a)*(z-b)*(z-c));
//			System.out.println(res);
			a = b;
		}
		
		System.out.println(String.format("%.6f", res));
	}

}
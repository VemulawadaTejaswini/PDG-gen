import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] d = new int[n];
		
		double d1 = 0;
		double d2 = 0;
		double d3 = 0;
		double di = 0;
		
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			y[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			d[i] = Math.abs(x[i]-y[i]);
			d1 += d[i];
			d2 += d[i]*d[i];
			d3 += d[i]*d[i]*d[i];
			di = Math.max(di, d[i]);
		}
		
		System.out.println(String.format("%f", d1));
		System.out.println(String.format("%f", Math.pow(d2, 0.5)));
		System.out.println(String.format("%f", Math.pow(d3, 1.0/3.0)));
		System.out.println(String.format("%f", di));
	}
}

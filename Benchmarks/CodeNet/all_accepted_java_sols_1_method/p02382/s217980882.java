import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		
		double[] x = new double[n];
		double[] y = new double[n];
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++){
			y[i] = sc.nextInt();
		}
		
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		double pi = 0;
		for(int i=0; i<n; i++){
			double d = Math.abs(x[i] - y[i]);
			p1 += d;
			p2 += Math.pow(d, 2);
			p3 += Math.pow(d, 3);
			if(d > pi){
				pi = d;
			}
		}
		
		p2 = Math.sqrt(p2);
		p3 = Math.cbrt(p3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(pi);
		
	}

}
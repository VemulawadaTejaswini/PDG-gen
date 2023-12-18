import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int p=Integer.MAX_VALUE;
		double[] X = new double[n];
		double[] Y = new double[n];

		for(int i=0; i<n;i++) {
			X[i]=sc.nextDouble();
		}

		for(int i=0; i<n;i++) {
			Y[i]=sc.nextDouble();
		}
		System.out.printf("%f", mincof(n,1,X,Y));
		System.out.println();
		System.out.printf("%f", mincof(n,2,X,Y));
		System.out.println();
		System.out.printf("%f", mincof(n,3,X,Y));
		System.out.println();
		System.out.printf("%f", mincof(n,p,X,Y));
		System.out.println();
	}

	public static double mincof(int n,int p,double[] X, double[] Y) {
		double sum=0;

		if(p>3) {
			double max=Double.MIN_VALUE;
			for(int i=0; i<n;i++) {
				double d=Math.abs(X[i]-Y[i]);
				if(d>max) {
					max=d;
				}
			}
			return max;
		}else {
			for(int i=0;i<n;i++) {
				sum+=Math.pow(Math.abs(X[i]-Y[i]), p);
			}
			return  Math.pow(sum, (double)1/p);
		}


	}

}

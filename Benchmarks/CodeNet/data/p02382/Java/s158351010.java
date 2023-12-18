import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double[] x=new double[n];
		double[] y=new double[n];
		for(int i=0; i<n; i++){
			x[i]=sc.nextDouble();
		}
		for(int i=0; i<n; i++){
			y[i]=sc.nextDouble();
		}
		d1(x,y);
		d2(x,y);
		d3(x,y);
		dmax(x,y);

    }
	public static void d1(double[] x,double[] y){
		double sum=0;
		for(int i=0; i<x.length; i++){
			sum+=Math.abs(x[i]-y[i]);
		}
		System.out.printf("%.6f\n",sum);
	}
	public static void d2(double[] x,double[] y){
		double sum=0;
		for(int i=0; i<x.length; i++){
			sum+=Math.pow(Math.abs(x[i]-y[i]), 2);

		}
		sum=Math.sqrt(sum);
		System.out.printf("%.6f\n",sum);
	}
	public static void d3(double[] x,double[] y){
		double sum=0;
		for(int i=0; i<x.length; i++){
			sum+=Math.pow(Math.abs(x[i]-y[i]), 3);

		}
		sum=Math.pow(sum, 1.0/3);
		System.out.printf("%.6f\n",sum);
	}
	public static void dmax(double[] x, double[] y){
		double max=0;
		for(int i=0; i<x.length; i++){
			if(Math.abs(x[i]-y[i])>max){
				max=Math.abs(x[i]-y[i]);
			}
		}
		System.out.printf("%.6f\n",max);
	}
}

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n=sc.nextInt();
			if(n==0) {
				break;
			}
			double[] array = new double[n];
			double sum =0;
			for(int i=0; i<n; i++) {
				array[i]=sc.nextDouble();
				sum+=array[i];
			}
			double m = sum/n;

			double a=0;

			for(double s : array) {
				a+=(s-m)*(s-m);
			}
			a=Math.sqrt(a/n);
			System.out.printf("%f",a);
			System.out.println();
		}

	}
}

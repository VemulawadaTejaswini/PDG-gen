import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] x = new double[n];
		double ave=0;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
			ave+=x[i];
		}
		
		long p=0;
		
		p=Math.round(ave/n);
		
		for(int i=0;i<n;i++) {
			sum+=(Math.pow((x[i]-p), 2));
		}
		
		System.out.println(sum);
		sc.close();
	}
}
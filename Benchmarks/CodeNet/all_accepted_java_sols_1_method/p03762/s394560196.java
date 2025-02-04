import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] x = new long[n];
		long[] y = new long[m];
		for(int i=0;i<n;i++) x[i] = sc.nextLong();
		for(int i=0;i<m;i++) y[i] = sc.nextLong();
		sc.close();

		long div = (long)Math.pow(10, 9)+7;
		/*
		long sum = 0;
		for(int i=1;i<n;i++){
			for(int j=1;j<m;j++){
				long dx = x[i]-x[i-1];
				long dy = y[j]-y[j-1];
				sum += dx*dy*(n-i)*i*(m-j)*j;
				sum %= div;
			}
		}
		*/
		long xsum = 0;
		for(int i=0;i<n;i++){
			xsum += (2*i-n+1)*x[i];
		}
		xsum %= div;
		long ysum = 0;
		for(int i=0;i<m;i++){
			ysum += (2*i-m+1)*y[i];
		}
		ysum %= div;
		long sum = xsum*ysum;
		System.out.println(sum%div);
	}

}
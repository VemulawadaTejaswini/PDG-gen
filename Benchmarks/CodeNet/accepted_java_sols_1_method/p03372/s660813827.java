import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long c = in.nextLong();
		long[] x = new long[n];
		long[] v = new long[n];
		for(int i=0;i<n;i++) {
			x[i] = in.nextLong();
			v[i] = in.nextLong();
		}
		
		long[] sum1 = new long[n];
		sum1[0] = v[0];
		long[] sum2 = new long[n];
		sum2[0] = v[n-1];
		for(int i=1;i<n;i++) {
			sum1[i] = sum1[i-1] + v[i];
			sum2[i] = sum2[i-1] + v[n-1-i];
		}
		
		long[] dp1 = new long[n+1];
		long[] dist1 = new long[n+1];
		if(sum1[0]-x[0]>0) {
			dp1[1] = sum1[0]-x[0];
			dist1[1] = x[0];
		}
		for(int i=1;i<n;i++) {
			if(sum1[i]-x[i]>dp1[i]) {
				dp1[i+1] = sum1[i]-x[i];
				dist1[i+1] = x[i];
			}else {
				dp1[i+1] = dp1[i];
				dist1[i+1] = dist1[i];
			}
		}
		
		long[] dp2 = new long[n+1];
		long[] dist2 = new long[n+1];
		if(sum2[0]-c+x[n-1]>0) {
			dp2[1] = sum2[0]-c+x[n-1];
			dist2[1] = c-x[n-1];
		}
		for(int i=1;i<n;i++) {
			if(sum2[i]-c+x[n-1-i]>dp2[i]) {
				dp2[i+1] = sum2[i]-c+x[n-1-i];
				dist2[i+1] = c-x[n-1-i];
			}else {
				dp2[i+1] = dp2[i];
				dist2[i+1] = dist2[i];
			}
		}
		
		long max = Math.max(dp1[n], dp2[n]);
		for(int i=1;i<n;i++) {
			if(max<dp1[i]+dp2[n-i]-Math.min(dist1[i], dist2[n-i])) {
				max = dp1[i]+dp2[n-i]-Math.min(dist1[i], dist2[n-i]);
			}
		}
		
		System.out.println(max);
		
		in.close();

	}

}

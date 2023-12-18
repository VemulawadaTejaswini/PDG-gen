import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		long k = s.nextInt();
		
		long a[] = new long[n];
		long b[] = new long[m];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		for(int i=0;i<m;i++) {
			b[i] = s.nextInt();
		}
		
		long sum1 = 0;
		int max = 0;
		for(int i=0;i<=n;i++) {
			int j=0;
			long sum2 = 0;
			while(j<m && sum2+sum1+b[j]<=k) {
				sum2+=b[j];
				j++;
			}
			if(sum1>k)
				break;
			max = Math.max(max, i+j);
			if(i==n) {
				break;
			}
			sum1+=a[i];
		}
		System.out.println(max);
	}

}

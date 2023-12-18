
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		long []sumA = new long [n+1];
		long []sumB = new long [m+1];
		
		for(int i = 0 ; i < n ;i++) {
			int a = Integer.parseInt(sc.next());
			sumA[i+1] = (long)(sumA[i] + a);
		}
		
		for(int i = 0 ; i < m ;i++) {
			int b = Integer.parseInt(sc.next());
			sumB[i+1] = (long)(sumB[i] + b);
		}
		
		int max = 0;
		
		for(int i = 0 ; i <= n ;i++) {
			if(sumA[i] > k) {
				continue;
			}
			
			int b = LowerBound(k, sumA[i],sumB,m);
			max = Math.max(i+b, max);
		}
		
		System.out.println(max);
		
	}
	
	static int LowerBound(int k , long t, long []sumB , int m) {
		if(t >= k) {
			return 0;
		}
		if(t + sumB[m] <= k) {
			return m;
		}
		
		int l = 0;
		int r = m;
		
		while(r-l > 1) {
			int tmp = (l+r)/2;
			if(t + sumB[tmp] > k) {
				r = tmp;
			}
			else if(t + sumB[tmp] < k) {
				l = tmp;
			}
			else {
				return tmp;
			}
		}
		
		
		return l;
	}
}

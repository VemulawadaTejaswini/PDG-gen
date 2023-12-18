import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true) {
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		
		if(n==0)break;
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		int[] s = new int[n+1];
		s[0] = 0;
		
		for(int i = 0; i < n; i++) {
			s[i+1] = s[i]+a[i];
		}
		
		long ans = Long.MIN_VALUE;
		
		for(int i = 0; i <=n-k; i++) {
			long val = s[k+i] - s[i];
			if(ans < val) ans = val;
		}
		
		System.out.println(ans);
		
		}
		
		
	}

}


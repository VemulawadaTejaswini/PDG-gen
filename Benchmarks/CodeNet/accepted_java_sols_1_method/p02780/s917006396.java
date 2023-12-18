import java.util.Scanner;
public class Main { //これは累積和だよーん

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int k = stdIn.nextInt();
		
		int [] p = new int[n];
		
		for(int i = 0; i < n; i++) {
			p[i] = stdIn.nextInt();
		}
		
		
		int[]s = new int[n+1];
		
		for(int i = 0; i < n; i++) {
			s[i+1] = s[i] + p[i];
		}
		
		int max = Integer.MIN_VALUE;
		int index = 0;
		
		for(int i = 0; i < n+1-k; i++) {
			int sum = s[i+k]-s[i];
			if(max < sum) {
				max = sum;
				index = i;
			}
			
		}
		
		double ans = 0;
		
		for(int i = 0; i < k; i++) {
			ans += p[index++]/2.0 + 0.5;
		}
		System.out.println(ans);
	}

}

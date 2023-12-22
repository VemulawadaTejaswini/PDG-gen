
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
	
		long []sum = new long [n+1];
		
		for(int i = 0 ; i < n ;i++) {
			long a = Long.parseLong(sc.next());
			sum[i+1] = a + sum[i];
		}
		
		Arrays.sort(sum);
		long temp = sum[0];
		long ans = 0;
		int len = 1;
		
		for(int i = 1 ; i <= n+1 ;i++) {
			if(i == n+1) {
				ans += (long)len*(len-1)/2;
				break;
			}
			if(temp == sum[i]) {
				len++;
			}
			else {
				
				ans += (long)len*(len-1)/2;
				len = 1;
			}
			temp = sum[i];
		}
		
		System.out.println(ans);
	}

}

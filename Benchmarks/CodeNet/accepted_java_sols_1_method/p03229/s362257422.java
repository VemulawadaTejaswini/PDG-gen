
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		
		for(int i = 0 ;i < n ; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(a);
		long ans = 0;
		
		if(n % 2 == 0) {
			int m = (n-2)/2;
			for(int i = 0 ; i < m ;i++) {
				ans += (long)(2 *(a[n-1-i] - a[i]));
				//System.out.println(ans);
			}
			ans += a[m+1] - a[m];
			System.out.println(ans);
		}
		else {
			
			int m = (n-1)/2;
			long temp = (long)((a[m+1] + a[m-1]) - 2 * a[m]);
			for(int i = 0 ; i < m-1 ;i++) {
				ans += (long)(2 *(a[n-1-i] - a[i]));
				//System.out.println(ans);
			}
			if(temp >= 0) {
				ans += (long)(2 *a[m+1] - a[m-1] - a[m]);
			}
			else {
				ans += (long)(a[m+1] + a[m] - (a[m-1] * 2));
			}
			System.out.println(ans);
		}
		

	}

}

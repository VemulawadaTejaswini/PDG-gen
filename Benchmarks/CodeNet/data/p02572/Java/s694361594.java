import java.util.Scanner;


public class Main {


	public static void main(String[] args)  {
		int MOD = 1000000007;

		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Long[] a = new Long[n];


		for(int i = 0 ; i < n ; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		Long temp = 0l;
		long ans = 0l;
		for(int i = 0 ; i < n - 1 ; i++) {
			for(int j = i + 1 ; j < n  ; j++) {
				temp = (a[i] * a[j]);
				ans+= temp;
				ans = ans % MOD;
				
			}
		}		
		System.out.println(ans);
	}
}
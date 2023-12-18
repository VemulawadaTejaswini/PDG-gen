import java.util.*;

public class Main {
	static int r = 1000000000 + 7;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		sc.close();
		Arrays.sort(a);
		long ans = 1;
		if(a[0] >= 0){
			for (int i = 0; i < k; ++i) {
				ans *= (long) a[n - i - 1];
				ans %= r;
			}	
		}
		else if(a[n - 1] <= 0){
			if(k % 2 == 1){
				for (int i = 0; i < k; ++i) {
					ans *= (long) a[n - i - 1];
					ans %= r;
				}	
			}else{
				for (int i = 0; i < k; ++i) {
					ans *= (long) a[i];
					ans %= r;
				}	
			}
		}
		else {
			long minus = 1, plus = 1;
			int curl = 0, curr = n - 1;
			if(k % 2 == 1){
				ans *= (long)a[n - 1];
				ans %= r;
				--k;
				--curr;
			}
			for (int i = 2; i <= k; i += 2) {
				minus = (long)a[curl] * (long)a[curl];
				minus %= r;
				plus = (long)a[curr] * (long)a[curr];
				plus %= r;
				if(minus >= plus){
					ans *= minus;
					ans %= r;
					curl += 2;
				}
				else{
					ans *= plus;
					ans %= r;
					curr -= 2;
				}
			}
		}
		if (ans < 0) {
			ans += r;
		}
		System.out.println(ans);
	}
}

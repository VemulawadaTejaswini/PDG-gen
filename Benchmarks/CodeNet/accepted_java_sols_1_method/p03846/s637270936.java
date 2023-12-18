import java.util.*;
public class Main {
	public static void main(String[] args){
		int MOD = 1000000007;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		sc.close();

		long ans = 0;
		if(n%2 == 0){
			int[] count = new int[n];
			for(int i = 0; i <= n-1; i++) count[i] = 0;
			for(int i = 0; i < n; i++){
				count[a[i]]++;
			}
			boolean f = true;
			for(int i = 0; i <= n-1; i++){
				if(i%2 == 1 && count[i] != 2) f = false;
			}
			if(f){
				ans = 1;
				for(int i = 0; i < n/2; i++){
					ans *= 2;
					ans %= MOD;
				}
			}
		}else{
			int[] count = new int[n];
			for(int i = 0; i <= n-1; i++) count[i] = 0;
			for(int i = 0; i < n; i++){
				count[a[i]]++;
			}
			boolean f = true;
			if(count[0] != 1) f = false;
			for(int i = 2; i <= n-1; i++){
				if(i%2 == 0 && count[i] != 2) f = false; 
			}
			if(f){
				ans = 1;
				for(int i = 0; i < n/2; i++){
					ans *= 2;
					ans %= MOD;
				}
			}
		}

		System.out.println(ans);
	}
}
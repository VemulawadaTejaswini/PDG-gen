import java.util.*;
public class Main {
	

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int mod = (int)1e9+7;
		
		int cnt[] = new int[N+1];
		
		for(int i=2;i<=N;i++) {
			int tmp = i;
			for(int j=2;j*j<=tmp;j++) {
				while(tmp%j==0) {
					tmp /= j;
					cnt[j]++;
				}
			}
			if(tmp!=1)cnt[tmp]++;
		}
		
		long ans = 1;
		for(int t:cnt) {
			ans *= (t+1);
			ans %= mod;
		}
		System.out.println(ans);
	}
	
}
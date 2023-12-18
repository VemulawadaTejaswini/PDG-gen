import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new aoj0053().doIt();
	}

	class aoj0053 {	
		int prime[] = new int [100001];
		boolean is_prime[] = new boolean[100001];
		void sieve(int n){
			int p = 0;
			for(int i = 0;i <=n;i++)is_prime[i] = true;
			for(int i = 2;i <= n;i++){
				if(is_prime[i]){
					prime[p++]=i;
					for(int j = 2*i;j <= n;j+=i)is_prime[j] = false;
				}
			}
		}
		void doIt() {
			sieve(100000);
			while (true) {
				int n = sc.nextInt();
				if(n == 0)break;
				int cnt = 0;
				int cnt2 = 2;
				int ans = 0;
				while(cnt < n){
					if(is_prime[cnt2]){
						ans = ans + cnt2;
						cnt++;
					}
					cnt2++;
				}
				System.out.println(ans);
			}
		}
	}
}
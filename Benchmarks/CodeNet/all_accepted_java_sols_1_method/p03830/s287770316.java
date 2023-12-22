import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int P = (int)1e9+7;
		
		int cnt[] = new int[1010];
		
		for(int i=2;i<=n;i++){
			int t = i;
			for(int j=2;j*j<=t;j++){
				while(t%j==0){
					cnt[j]++;
					t/=j;
				}
			}
			if(t>1)
				cnt[t]++;
		}
		
		long ans = 1;
		for(int i=2;i<=n;i++){
			ans *= cnt[i]+1;
			ans%=P;
		}
		System.out.println(ans);
	}

}

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		sc.close();
		int mod = 2019;
		
		for(int i=L;i<=R;i++) {
			if(i%2019==0) {
				System.out.println(0);
				return;
			}
		}
		
		L%=mod;
		R%=mod;
		
		int ans = Integer.MAX_VALUE;
		for(int i=L;i<R;i++) {
			for(int j=L+1;j<=R;j++) {
				int tmp = i*j;
				tmp %= mod;
				ans = Math.min(ans, tmp);
			}
		}
		System.out.println(ans);
	}
}
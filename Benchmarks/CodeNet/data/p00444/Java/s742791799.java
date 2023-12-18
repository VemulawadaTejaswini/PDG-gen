
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[] dp;
	int MONEY = 1000;
	void run() {
		Scanner sc = new Scanner(System.in);
		dp();
		for(;;) {
			int money = sc.nextInt();
			if(money == 0) break;
			System.out.println(dp[money]);
		}
	}
	
	void dp() {
		dp = new int[MONEY+1];
		int coin[] = {1, 5, 10, 50, 100, 500};
		fill(dp, INF);
		dp[MONEY] = 0;
		for(int i=MONEY;i>=0;i--) for(int j=0;j<coin.length;j++) {
			if( i-coin[j]>0 )
				dp[i-coin[j]] = min(dp[i-coin[j]], dp[i]+1);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
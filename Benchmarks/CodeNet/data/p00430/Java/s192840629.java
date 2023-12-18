
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n=sc.nextInt();
			if( n == 0 ) break;
			int[] ans = new int[n+1];
			ans[0] = n;
			dfs(1, n, ans);
		}
	}
	
	void dfs(int i, int num, int ans[]) {
//		debug(i, num);
//		if(i == n+1) return;
		if(num == 0) {
			print(ans);
			return;
		}
		for(int j=min(num,ans[i-1]);j>=1;j--) {
			ans[i] = j;
			dfs(i+1, num - j, ans);
			ans[i] = 0;
		}
	}
	
	void print(int[] ans) {
		System.out.print(ans[1]);
		for(int i=2; i!= n+1 && ans[i]!=0;i++) System.out.print(" " + ans[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}
import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	void solve(){
		int n = in.nextInt() - 1, m = in.nextInt();

		int [] d = new int[n + 1];
		d[0] = 0;

		for(int i = 1; i <= n; i++) d[i] = d[i - 1] + in.nextInt();

		int ans = 0, pos = 0;

		for(int i = 0; i < m; i++){
			int k = in.nextInt();
			ans += Math.abs(d[pos] - d[pos + k]);
			ans %= 100000;
			pos += k;
		}

		System.out.println(ans % 100000);
		
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }
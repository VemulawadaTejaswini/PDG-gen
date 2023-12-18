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
		int n = in.nextInt(), m = in. nextInt();
		int ans = m;
		boolean f = true;
		for(int i = 0; i < n; i++){
			int a = in.nextInt(), b = in.nextInt();
			m += a; m -= b;
			if(m < 0) f = false;
			ans = Math.max(ans, m);
		}
		if(f) System.out.println(ans);
		else System.out.println(0);
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }
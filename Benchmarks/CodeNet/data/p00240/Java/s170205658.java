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
		while(in.hasNext()){
			int n = in.nextInt();
			if( n == 0) return;
			int y = in.nextInt();

			int ans = 0;
			double d, m = 0.0;

			for(int i = 0; i < n; i++){
				int b = in.nextInt(), r = in.nextInt(), t = in.nextInt();
				if(t == 1) d = 1 + y * (double)r / 100;
				else d = Math.pow(1 + (double)r / 100, y);
				if(i == 0 || m < d){
					m = d;
					ans = b;
				}
			}

			System.out.println(ans);
		}
		
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }
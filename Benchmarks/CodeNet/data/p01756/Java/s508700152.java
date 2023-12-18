import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}
//1077
class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	void solve(){
		String s = in.next();
		int n = in.nextInt();
		for(int i = 0; i < n; i++){
			String t = in.next(), u = in.next();
			int a = s.indexOf(t), b = s.lastIndexOf(u);
			int ans = 0;
			if(a == -1 || b == -1 || a > b || a+t.length()>b+u.length()) ans = 0;
			else ans = b - a + u.length();
			System.out.println(ans);
		}
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }
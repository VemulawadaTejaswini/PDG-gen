import java.util.*;

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
		int l = in.nextInt();
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
		System.out.println(l - Math.max((a + c -1) / c, (b + d - 1) / d));
	}

	
}
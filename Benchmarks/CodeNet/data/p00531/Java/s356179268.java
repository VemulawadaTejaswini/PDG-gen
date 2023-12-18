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
		int a = in.nextInt(), b = in.nextInt();
		int c = in.nextInt(), d = in.nextInt();
		int p = in.nextInt();

		int x = a * p;
		int y;
		if(p <= c) y = b;
		else y = b + (p - c) * d;

		System.out.println(Math.min(x,y));
	}

}
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
		for(int i = 0; i < 3; i++){
			int h = in.nextInt(), m = in.nextInt(), s = in.nextInt();
			int ans = tos(h, m, s);
			h = in.nextInt();
			m = in.nextInt();
			s = in.nextInt();
			ans = tos(h, m, s) - ans;
			h = ans / 3600; ans %= 3600;
			m = ans / 60; ans %= 60;
			s = ans;
			System.out.println(h + " " + m + " " + s);
		}	
	}

	int tos(int h, int m, int s){
		return h * 3600 + m * 60 + s;
	}
}
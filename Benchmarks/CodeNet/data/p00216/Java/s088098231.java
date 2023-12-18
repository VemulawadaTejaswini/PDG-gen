
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;


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
			if(n == -1) return;
			int ans = 1150;
			if(n > 10) ans += Math.min(n - 10, 10) * 125;
			if(n > 20) ans += Math.min(n - 20, 10) * 140;
			if(n > 30) ans += (n - 30) * 160;

			System.out.println(4280 - ans);
		}
	}

	

}
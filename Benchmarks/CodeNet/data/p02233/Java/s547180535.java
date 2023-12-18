
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
	
	int[] memo;

	void solve(){
		Scanner in = new Scanner(System.in);

		memo = new int[45];

		int n = in.nextInt();

		System.out.println(fib(n));
		
	}
	
	int fib(int n){
		if(n<2) return 1;
		if(memo[n] != 0) return memo[n];
		return memo[n] = fib(n - 1) + fib(n - 2);
	}

}
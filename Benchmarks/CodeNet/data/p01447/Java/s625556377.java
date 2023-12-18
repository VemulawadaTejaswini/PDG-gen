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

	double EPS = 1e-9;

	void solve(){
		int n = in.nextInt();

		System.out.println((int)(Math.log(n) / Math.log(3) - EPS) + 1);
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }
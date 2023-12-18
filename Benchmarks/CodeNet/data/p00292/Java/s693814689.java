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
		int n = in.nextInt();

		for(int i = 0; i < n; i++){
			int a = in.nextInt(), b = in.nextInt();
			int c = (a % b == 0 ? b : a % b);
			System.out.println(a % b);
		}
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }
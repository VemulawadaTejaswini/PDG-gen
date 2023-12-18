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
		while(in.hasNext()){
			int n = in.nextInt();
			if( n == 0) return;
			for(int i = 0; i < 9; i++){
				int a = in.nextInt();
				n -= a;
			}
			System.out.println(n);
		}
	}

	
}
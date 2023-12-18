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
			if(n == 0) return;

			boolean f = false;

			for(int i = 0; i < n; i++){
				int k = in.nextInt();
				if( k > 1) f = true;
			}

			if(f) System.out.println(n + 1);
			else System.out.println("NA");

		}
	}

	
}
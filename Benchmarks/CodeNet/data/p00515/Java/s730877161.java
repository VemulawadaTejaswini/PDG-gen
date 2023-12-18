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
		int sum = 0;
		for(int i = 0; i < 5; i++){
			int a = in.nextInt();
			sum += Math.max(a,40);
		}
		System.out.println(sum/5);
	}

	
}
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
		while(in.hasNext()) {
			int n = in.nextInt();
			if(n == 0) return;
			int maxi = 0, mini = 1000000;
			for(int i = 0; i < n; i++){
				int sum = 0;
				for(int j = 0; j < 5; j++){
					int t = in.nextInt();
					sum += t;
				}
				maxi = Math.max(maxi, sum);
				mini = Math.min(mini, sum);
			}
			System.out.print(maxi);
			System.out.print(" ");
			System.out.println(mini);
		}
	}

}
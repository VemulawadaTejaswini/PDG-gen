import java.util.*;

class Main{
	public static void main(String args[]){
		Solve s = new Solve();
		s.solve();
	}
}

class Solve{
	Scanner in = new Scanner(System.in);

	void solve(){
		int n = in.nextInt(), m = in.nextInt();
		int[] c = new int[m];
		for(int i= 0; i < m; i++) c[i] = in.nextInt();

		int[] t = new int[n + 1];
		for(int i = 0; i <= n; i++) t[i] = 100000000;
		t[0] = 0;

		for(int i = 0; i < m; i++){
			for(int j = c[i]; j <= n; j++){
				t[j] = Math.min(t[j], t[j-c[i]]+1);
			}
		}
	}
	
}
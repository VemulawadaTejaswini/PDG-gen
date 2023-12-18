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
		int n = in.nextInt(), m = in.nextInt();
		int[] a = new int[m];
		for(int i = 0; i < m; i++) a[i] = in.nextInt() - 1;
		int[] p = new int[n];
		int b;
		for(int i = 0; i < m; i++){
			int x = 0;
			for(int j = 0; j < n; j++){
				b = in.nextInt() - 1;
				if(b == a[i]) p[j]++;
				else x++;
			}
			p[a[i]] += x;
		}
		for(int i = 0; i < n; i++){
			System.out.println(p[i]);
		}
	}

}
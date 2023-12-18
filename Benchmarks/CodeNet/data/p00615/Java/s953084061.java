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
		while(in.hasNext()){
			int n = in.nextInt(), m = in.nextInt();
			if(n == 0 && m == 0) return;
			int[] a = new int[n + m + 1];
			for(int i = 0; i < n + m; i++) a[i] = in.nextInt();
			a[n + m] = 0;
			Arrays.sort(a);
			int ans = a[1] - a[0];
			for(int i = 1; i < n + m + 1; i++) ans = Math.max(ans, a[i] - a[i - 1]);
			System.out.println(ans);
		}
	}
}
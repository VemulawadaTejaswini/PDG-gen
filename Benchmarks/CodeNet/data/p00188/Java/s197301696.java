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
			int n = in.nextInt();
			if(n == 0) return;
			int[] a = new int[n];
			for(int i = 0; i < n; i++) a[i] = in.nextInt();
			int b = in.nextInt();

			int l = 0, r = n, s = 0;
			while(true){
				s++;
				int m = (l + r) / 2;
				if(r - l == 1) break;
				//System.out.println(l + " " + r);
				if(a[m] < b) l = m;
				else if(a[m] > b) r = m;
				else break;
			}

			System.out.println(s);
		}
	}
	
}
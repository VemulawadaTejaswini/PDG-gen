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
			int s = 0;
			boolean f = false;
			for(int i = 1; i < n; i++){
				if(a[i] - a[i - 1] != 1){
					if(f) System.out.print(" ");
					f = true;
					if(s != i -1) System.out.print(a[s] + "-" + a[i - 1]);
					else System.out.print(a[s]);
					s = i;
				}
			}
			if(f) System.out.print(" ");
			if(s != n - 1) System.out.print(a[s] + "-" + a[n - 1]);
			else System.out.print(a[s]);
			System.out.println();
		}
	}
}
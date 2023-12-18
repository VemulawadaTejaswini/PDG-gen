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
			int n = in.nextInt(), s = in.nextInt(), e = in.nextInt();
			if(n == 0 && s == 0&& e == 0) return;
			int a[] = new int[24 * 60 + 100];
			s = toM(s); e = toM(e);
			//a[s] = 1; a[e+1] = -1;
			for(int i = 0; i < n ; i++){
				int t = in.nextInt();
				for(int j = 0; j < t; j++){
					int ts = toM(in.nextInt()), te = toM(in.nextInt());
					a[ts] += 1; a[te] -= 1;
				}
			}
			for(int i = 1; i < 24 * 60 + 100; i++){
				a[i] += a[i-1];
			}
			int ans = 0;
			for(int i = s; i < e ; i++){
				if(a[i] == n) a[i] = 0;
				else a[i] = a[i>0?i-1:0] + 1;
				//System.out.println(toH(i)+" "+a[i]);
				ans = Math.max(ans, a[i]);
			}
			System.out.println(ans);
		}
	}
	int toM(int h){
		return (h/100)*60+h%100;
	}
	int toH(int m){
		return m/60*100+m%60;
	}
}
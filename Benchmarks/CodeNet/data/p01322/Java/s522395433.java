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
			int n = in.nextInt(), m = in.nextInt();
			if(n == 0 && m == 0) return;
			String[] s = new String[n];
			int[] d = new int[n];
			for(int i = 0; i < n; i++){
				s[i] = in.next();
				d[i] = in.nextInt();
			}
			int ans = 0;
			for(int i = 0; i < m; i++){
				String t = in.next();
				for(int j = 0; j < n; j++) {
					for(int k = 0; k < 8; k++){
						if(s[j].charAt(k) !='*' && s[j].charAt(k) != t.charAt(k)) break;
						if(k == 7) ans += d[j];
					}
				}
			}
			System.out.println(ans);
		}
	}

}
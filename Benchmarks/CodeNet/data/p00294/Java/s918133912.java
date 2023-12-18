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
		int n = in.nextInt(), m = in.nextInt(), p = in.nextInt();
		int[] d = new int[n];
		for(int i = 0; i < m ; i++) {
			int a = in.nextInt();
			d[a]++;
		}

		int c = 0;

		for(int i = 0; i < m; i++){
			int l = p, r = p;
			while(true){
				c++;
				l = (n + l -1) % n;
				if(d[l] > 0) {
					p = l;
					d[l] = 0;
					break;
				}
				r = (r + 1) % n;
				if(d[r] > 0) {
					p = r;
					d[r] = 0;
					break;
				}
			}
		}

		System.out.println(c * 100);
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }
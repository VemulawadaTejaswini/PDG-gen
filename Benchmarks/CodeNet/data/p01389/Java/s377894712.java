import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);


	int ans = 0;
	int h, w;
	String[] str;
	int[] dx = {0, 1};
	int[] dy = {1, 0};

	void solve(){
		h = in.nextInt(); w = in.nextInt();

		str = new String[h];
		for(int i = 0; i < h; i++) str[i] = in.next();

		calc(0,0,0);

		System.out.println(ans);
	}

	void calc(int y, int x, int n){
		n += str[y].charAt(x) - '0';
		if(y == h - 1 && x == w - 1){
			ans = Math.min(ans, n);
			return;
		}
		for(int i = 0; i < 2; i++){
			int nx = x + dx[i], ny = y + dy[i];
			if(nx >= 0 && nx < w && ny >= 0 && ny < h) calc(ny, nx, n);
		}
	}	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }
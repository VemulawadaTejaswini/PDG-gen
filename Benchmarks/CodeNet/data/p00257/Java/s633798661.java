import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	class C{
		int pos, step, start;
		public C(int pos, int step, int start) {
			this.pos = pos;
			this.step = step;
			this.start = start;
		}
		
	}
	
	private void doit(){
		while(true){
			int max = sc.nextInt();
			if(max == 0) break;
			int n = sc.nextInt();
			int [] data  = new int[n + 2];
			for(int i = 1; i <= n; i++){
				data[i] = sc.nextInt();
			}
			n += 2;
			LinkedList<C> open = new LinkedList<Main.C>();
			open.add(new C(0, 0, 0));
			boolean [][] close = new boolean[n][n];
			close[0][0] = true;
			while(! open.isEmpty()){
				C now = open.poll();
				if(now.pos == n-1){
					continue;
				}
				for(int i = 1; i <= max; i++){
					int npos = now.pos + i;
					if(n <= npos){
						npos = n-1;
					}
					if(data[npos] != 0){
						npos = npos + data[npos];
						if(0 > npos){
							npos = 0;
						}
						if(npos >= n){
							npos = n-1;
						}
					}
					if(! close[now.start][npos]){
						close[now.start][npos] = true;
						open.add(new C(npos, now.step + 1, now.start));
					}
					if(! close[npos][npos]){
						close[npos][npos] = true;
						open.add(new C(npos, 0, npos));
					}
				}
			}
			boolean ans = true;
			for(int i = 0; i < n; i++){
				if(close[i][n-1] == false && close[i][i]){
					ans = false;
					break;
				}
			}
			System.out.println(ans ? "OK" : "NG");
		}
	}
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}
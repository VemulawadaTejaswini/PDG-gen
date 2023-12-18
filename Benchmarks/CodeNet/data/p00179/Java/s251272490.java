
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n;
	String str;
	boolean[] visited;
	void run() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			str = sc.next();
			if(str.equals("0")) break;
			n = str.length();
			int max = 1;
			for(int i=0;i<n;i++) max *= 3;
			visited = new boolean[max];
			int ans = bfs(new Worm(str));
			if( ans < 0 ) System.out.println("NA");
			else System.out.println(ans);
		}
	}
	
	int bfs(Worm worm) {
		LinkedList<Worm> que = new LinkedList<Worm>();
		que.add(worm);
		visited[worm.w] = true;
		Worm w = new Worm("");
		while(true) {
			if(que.isEmpty()) return -1;
			w = que.removeFirst();
//			System.out.println(w.w);
			int col = w.w;
			int a = col%3;
			int b = col%3;
			int tmp = 1;
			boolean f = true;
			for(int i=0;i<n-1;i++) {
				a = b;
				tmp *= 3;
				b = (col/tmp)%3;
				if(a != b) {
					Worm next = new Worm(col - a*tmp/3-b*tmp + (tmp+tmp/3) * (3-a-b), w.cnt+1);
					if(!visited[next.w]) {
						que.addLast(next);
						visited[next.w] = true;
					}
					f = false;
				}
			}
			if(f) return w.cnt;
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	class Worm {
		int w, cnt;
		Worm(String str) {
			int tmp = 1;
			for(int i=0;i<str.length();i++) {
				switch (str.charAt(i)) {
				case 'r': w += tmp * 0; break;
				case 'g': w += tmp * 1; break;
				case 'b': w += tmp * 2; break;
				}
				tmp *= 3;
			}
			cnt = 0;
		}
		
		Worm(int w, int cnt) {
			this.w = w;
			this.cnt = cnt;
		}
	}
	
}
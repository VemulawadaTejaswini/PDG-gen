
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		int[] to = new int[n+2];
		to[0] = 1;
		String[] label = new String[n];
		for(int i=0;i<n;i++) {
			String[] com = sc.nextLine().split(" ");
			if( com.length == 1 ) {
				label[i] = com[0].substring(0, com[0].length()-1);
				to[i+1] = i+2;
			}
			else {
				label[i] = com[1].substring(0, com[1].length()-1);
				to[i+1] = -1;
			}
		}
		
		for(int i=0;i<n;i++) if(to[i+1] == -1) {
			for(int j=0;j<n;j++) if( i!=j && label[i].equals(label[j]) ) {
				to[i+1] = j+1;
			}
		}
		
		PriorityQueue<P> q = new PriorityQueue<P>();
		q.add(new P(0, 0));
		boolean[][] mem = new boolean[n+2][n+2];
		mem[0][0] = true;
		for(;;) {
			P cur = q.remove();
			if( to[cur.p] == 0 ) {
				System.out.println(cur.c);
				break;
			}
			if( to[cur.p] != cur.p + 1 ) if(!mem[cur.p+1][cur.c+1]){
				q.add(new P(cur.p+1, cur.c+1));
				mem[cur.p+1][cur.c+1] = true; 
			}
			if(!mem[to[cur.p]][cur.c]) {
				q.add(new P(to[cur.p], cur.c));
				mem[to[cur.p]][cur.c] = true;
			}
		}
	}
	
	class P implements Comparable<P>{
		int p, c;
		P(int p, int c) {
			this.p = p;
			this.c = c;
		}
		@Override
		public int compareTo(P arg0) {
			// TODO 自動生成されたメソッド・スタブ
			return c-arg0.c;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
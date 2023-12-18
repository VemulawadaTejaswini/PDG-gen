
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int[][] ps;
	int[] heap;
	int n, q;
	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); q = sc.nextInt();
		ps = new int[n+1][2];ps[0][0] = INF;
		heap = new int[n+1];
		for(int i=1;i<=n;i++) {
			ps[i][0] = 0; ps[i][1] = i;
			heap[i] = i;
		}
		for(int i=0;i<q;i++) {
			int a = sc.nextInt(), v = sc.nextInt();
			ps[a][0] += v;
			if( v > 0 )up(ps[a][1]);
			else down(ps[a][1]);
			System.out.println(heap[1] + " " + ps[heap[1]][0]);
//			debug(heap);
//			debug(ps);
		}
	}
	
	void up(int p) {
		int cur = p;
		while( ps[heap[cur]][0] >= ps[heap[cur/2]][0] ) {
			if(ps[heap[cur]][0] > ps[heap[cur/2]][0]) swap(cur, cur/2);
			else {
				if(heap[cur] < heap[cur/2]) swap(cur, cur/2);
				else break;
			}
			cur /= 2;
		}
	}
	
	void down(int p) {
		int cur = p;
		while( cur*2 <= n ) {
			int sel = cur*2;
			if( cur*2+1 <= n ) {
				if(ps[heap[cur*2]][0] < ps[heap[cur*2+1]][0]) {
					sel = cur*2+1;
				}
				if( ps[heap[cur*2]][0] == ps[heap[cur*2+1]][0] ) {
					if(ps[heap[cur*2]][1] > ps[heap[cur*2+1]][1])
						sel = cur*2+1;
				}
			}
			if( ps[heap[cur]][0] < ps[heap[sel]][0] ) {
				swap(cur, sel);
			}
			else if( ps[heap[cur]][0] == ps[heap[sel]][0] ){
				if( ps[heap[cur]][1] > ps[heap[sel]][1] ) swap(cur, sel);
				else break;
			}
			else break;
			cur = sel;
		}
	}
	
	void swap(int p, int q) {
		int tmp = ps[heap[p]][1];
		ps[heap[p]][1] = ps[heap[q]][1];
		ps[heap[q]][1] = tmp;
		tmp = heap[p];
		heap[p] = heap[q];
		heap[q] = tmp;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
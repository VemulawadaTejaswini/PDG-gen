
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Main {
	Scanner sc = new Scanner(System.in);

	class E implements Comparable<E> {
		int p;
		int d;
		int c;

		E(int pp, int dd, int cc) {
			p = pp;
			d = dd;
			c = cc;
		}

		public int compareTo(E tar) {
			if (tar.d == d) {
				return -tar.c + c;
			}
			return -tar.d + d;
		}
	}

	class ed {
		int t;
		int c;
		int d;

		ed(int tt, int cc, int dd) {
			t = tt;
			c = cc;
			d = dd;
		}
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}

			LinkedList<ed>[] el = new LinkedList[n];
			for (int i = 0; i < n; i++) {
				el[i] = new LinkedList<ed>();
			}
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int d = sc.nextInt();
				int c = sc.nextInt();

				el[a].add(new ed(b, c, d));
				el[b].add(new ed(a, c, d));
			}

			PriorityQueue<E> q = new PriorityQueue<E>();
			q.add(new E(0,0,0));
			boolean visited[] = new boolean[n];
			int ream = n;
			long res = 0;
			for (;;) {
				if(q.isEmpty()){
					break;
				}
				E now = q.poll();
				if(visited[now.p]){
					continue;
				}
				visited[now.p] = true;
				res += now.c;
//				System.out.println(now.p + " "+now.c);
				ream--;
				if(ream == 0){
					break;
				}
				
				for(ed e: el[now.p]){
					if(!visited[e.t]){
						q.add(new E(e.t , now.d + e.d, e.c));
					}
				}
			}
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}
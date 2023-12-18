
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	int gcd(int a, int b) {
		if (a > b) {
			int c = a % b;
			if (c == 0) {
				return b;
			} else {
				return gcd(b, c);
			}
		} else {
			int c = b % a;
			if (c == 0) {
				return a;
			} else {
				return gcd(a, c);
			}
		}
	}

	class Edge {
		Node to;
		int cap;
		int flow;

		Edge g;
		Edge(Node to, int cap, int flow) {
			this.to = to;
			this.cap = cap;
			this.flow = flow;
		}
		
		void rrf(int f){
			if(g ==null){
				return;
			}
			g.flow -= f;
		}
	}

	class Node {
		int id;

		LinkedList<Edge> e;

		Node(int id) {
			this.id = id;
			e = new LinkedList<Edge>();
		}
	}

	Node[] all;
	boolean[] used;

	int dfs(Node s,Node t){
		if(s==t){
			return 1;
		}
		used[s.id] = true;
		
		for(Edge e: s.e){
			if(!used[e.to.id]){
				if(e.cap - e.flow >0){
					int res = dfs(e.to,t);
					if(res >0){
						e.flow++;
						e.rrf(1);
						return res;
					}
				}			
			}
		}
		return 0;
	}
	
	public void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}
			Node[] r = new Node[n];
			Node[] b = new Node[m];
			Node source = new Node(n + m);
			Node sink = new Node(n + m + 1);

			all = new Node[n + m + 2];
			all[n + m] = source;
			all[n + m + 1] = sink;
			int[] red = new int[n];
			int[] blue = new int[m];

			for (int i = 0; i < n; i++) {
				red[i] = sc.nextInt();
				r[i] = new Node(i);

				all[i] = r[i];
				source.e.add(new Edge(r[i], 1, 0));
			}
			for (int j = 0; j < m; j++) {
				blue[j] = sc.nextInt();
				b[j] = new Node(n + j);

				all[n + j] = b[j];
				b[j].e.add(new Edge(sink, 1, 0));
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (gcd(red[i], blue[j]) >= 2) {
						Edge rb = new Edge(b[j], 1, 0);
						Edge br = new Edge(r[i], 1, 1);
						rb.g = br;
						br.g = rb;
						r[i].e.add(rb);
						b[j].e.add(br);
					}
				}
			}

			int sum = 0;
			for (;;) {
				used = new boolean[all.length];
				int res = dfs(source,sink);
				if (res == 0) {
					break;
				} else {
					sum += res;
				}
			}
			System.out.println(sum);
		}
	}

	public static void main(String a[]) {
		Main m = new Main();
		m.run();
	}
}
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class Node {
		int pos, time, num, dis;
		Node(int p, int t, int n, int d) {
			pos = p;
			time = t;
			num = n;
			dis = d;
		}
		
		@Override
		public int hashCode() {
			return num+10*pos+1000*dis+time;
		}
		
		@Override
		public boolean equals(Object o) {
			Node n = (Node)o;
			return pos == n.pos && time == n.time && num == n.num && dis == n.dis;
		}
	}
	
	void run() {
		int[] p = new int[40];
		int[] t = new int[40];
		int[][] memo = new int[40][2];
		int INF = Integer.MAX_VALUE/2;
		Queue<Node> que = new LinkedList<Node>();
		W:while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
				t[i] = sc.nextInt();
				memo[i][0] = memo[i][1] = INF;
			}
			
			que.clear();
			que.add(new Node(0, 0, 0, 0));
			
			for (int i = 0; i < n; i++) {
				int z = que.size();
				if (z == 0) {
					out.printf("NG %d\n", i);
					continue W;
				}
				for (int j = 0; j < z; j++) {
					Node node = que.poll();
					if ((1+node.num)*abs(node.pos-p[i])<=t[i]-node.time) {
						if (node.num < 2 && memo[i][node.num] > node.dis+abs(node.pos-p[i])) {
							que.add(new Node(p[i], t[i], node.num+1, node.dis+abs(node.pos-p[i])));
							memo[i][node.num] = node.dis+abs(node.pos-p[i]);
						}
						que.add(new Node(0, t[i]+(2+node.num)*p[i], 0, node.dis+abs(node.pos-p[i])+p[i]));
					}
				}
			}
			
			if (que.size() == 0) {
				out.printf("NG %d\n", n);
				continue W;
			}
			
			int res = INF;
			for (Node node : que) {
				if (node.pos == 0) {
					res = min(res, node.dis);
				}
			}
			
			out.printf("OK %d\n", res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}
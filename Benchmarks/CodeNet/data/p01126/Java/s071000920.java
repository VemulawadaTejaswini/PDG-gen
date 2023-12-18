import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int n = nextInt();
			if (n == 0) {
				break;
			}

			int m = nextInt();
			int a = nextInt();

			ArrayList<Edge> edges = new ArrayList<Edge>();
			for (int i = 0; i < m; i++) {
				int h = nextInt();
				int p = nextInt();
				int q = nextInt();
				edges.add(new Edge(h, p, q));
			}
			Collections.sort(edges);

			for (Edge edge : edges) {
				if (edge.p == a) {
					a = edge.q;
				} else if (edge.q == a) {
					a = edge.p;
				}
			}

			System.out.println(a);

		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}

class Edge implements Comparable<Edge> {
	int height, p, q;

	Edge(int h, int p, int q) {
		this.height = h;
		this.p = p;
		this.q = q;
	}

	@Override
	public int compareTo(Edge o) {
		return o.height - this.height;
	}
}
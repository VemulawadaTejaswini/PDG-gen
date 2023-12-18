import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int N = nextInt();
			if (N == 0) {
				break;
			}

			int M = nextInt();
			ArrayList<Edge> list = new ArrayList<Edge>();
			for (int i = 0; i < N; i++) {
				int D = nextInt();
				int P = nextInt();
				list.add(new Edge(D, P));
			}

			Collections.sort(list);

			int deathP = 0;
			for (Edge e : list) {
				if (M >= e.D) {
					M -= e.D;
				} else {
					deathP += (e.D - M) * e.P;
					M = 0;
				}
			}
			System.out.println(deathP);
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
	int D, P;

	Edge(int d, int p) {
		this.D = d;
		this.P = p;
	}

	@Override
	public int compareTo(Edge arg0) {
		return arg0.P - this.P;
	}
}
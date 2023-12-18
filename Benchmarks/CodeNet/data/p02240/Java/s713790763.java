import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Graph I - Connected Components
 */
public class Main {

	static final int NIL = -1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		Main main = new Main();

		line = br.readLine();

		int n, m;
		n = parseInt(line.substring(0, line.indexOf(' ')));
		m = parseInt(line.substring(line.indexOf(' ') + 1));

		Vertex[] G = new Vertex[n];
		int color = 0;

		for (int i = 0; i < n; i++) {
			G[i] = main.new Vertex();
		}

		for (int i = 0; i < m; i++) {
			line = br.readLine();
			int s, t;
			s = parseInt(line.substring(0, line.indexOf(' ')));
			t = parseInt(line.substring(line.indexOf(' ') + 1));
			G[s].es.add(G[t]);
			G[t].es.add(G[s]);
		}

		for (int i = 0; i < n; i++) {
			if (G[i].color == NIL) {
				G[i].color = color++;
				Deque<Vertex> stack = new ArrayDeque<>();
				stack.push(G[i]);
				while (!stack.isEmpty()) {
					Vertex s = stack.pop();
					for (Vertex t : s.es) {
						if (t.color == NIL) {
							t.color = G[i].color;
							stack.push(t);
						}
					}
				}
			}
		}


		int q = parseInt(br.readLine());

		for (int i = 0; i < q; i++) {
			line = br.readLine();
			int s, t;
			s = parseInt(line.substring(0, line.indexOf(' ')));
			t = parseInt(line.substring(line.indexOf(' ') + 1));
			if (G[s].color == G[t].color) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

	class Vertex {
		int color = NIL;
		List<Vertex> es = new ArrayList<>();
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Marked Ancestor
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Main main = new Main();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N, Q;
			N = parseInt(line.substring(0, line.indexOf(' ')));
			Q = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((N | Q) == 0) break;

			Node[] nodes = new Node[N + 1];
			for (int i = 0; i < nodes.length; i++) {
				nodes[i] = main.new Node(i);
			}

			nodes[1].p = nodes[0];
			for (int i = 2; i <= N; i++) {
				int p = parseInt(br.readLine());
				nodes[i].p = nodes[p];
			}

			nodes[1].marked = true;
			long sum = 0;
			for (int i = 0; i < Q; i++) {
				line = br.readLine();
				char o = line.charAt(0);
				int v = parseInt(line.substring(line.indexOf(' ') + 1));
				if (o == 'M') {
					nodes[v].marked = true;
				} else {
					Node node = nodes[v];
					while (node.id != 0 && !node.marked) {
						node = node.p;
					}
					sum += node.id;
				}
			}
			System.out.println(sum);
		} //end while
	} //end main

	class Node {
		int id;
		boolean marked = false;
		Node p;

		Node(int id) {
			this.id = id;
		}
	}
}
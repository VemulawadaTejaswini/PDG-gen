import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	static class Node {
		long x, y;

		Node(String line) {
			String[] tokens = line.split(" ");
			x = Long.parseLong(tokens[0]);
			y = Long.parseLong(tokens[1]);
		}

		long getDist(Node other) {
			return Math.abs(other.x - x) + Math.abs(other.y - y);
		}
	}

	int N;
	Node[] nodes;
	long[] x, y;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			nodes[i] = new Node(in.readLine());
		}
		Arrays.sort(nodes, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if (o1.x + o1.y != o2.x + o2.y) {
					return Long.compare(o1.x + o1.y, o2.x + o2.y);
				} else {
					return Long.compare(o1.x, o2.x);
				}
			}
		});
	}

	void calc() {
	}

	void showResult() {
		System.out.println(nodes[N - 1].getDist(nodes[0]));
	}
}
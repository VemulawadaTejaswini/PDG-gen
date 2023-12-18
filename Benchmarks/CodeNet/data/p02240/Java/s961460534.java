import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String[] data = br.readLine().split(" ");
		int n = Integer.parseInt(data[0]);
		int m = Integer.parseInt(data[1]);

		Node[] v = new Node[n];
		for (int i=0; i < n; i++) {
			v[i] = new Node(i);
		}

		for (int i=0; i < m; i++) {
			data = br.readLine().split(" ");
			int s = Integer.parseInt(data[0]);
			int t = Integer.parseInt(data[1]);

			if (v[s].label == v[t].label) continue;

			Node temp = v[t];
			do {
				temp.label = v[s].label;
				temp = temp.next;
			} while (temp != v[t]);

			Node vsnext = v[s].next;
			Node vtnext = v[t].next;

			v[s].next = vtnext;
			v[t].next = vsnext;
		}

		StringBuilder ans = new StringBuilder();

		int q = Integer.parseInt(br.readLine());
		for (int i=0; i < q; i++) {
			data = br.readLine().split(" ");
			int s = Integer.parseInt(data[0]);
			int t = Integer.parseInt(data[1]);

			if (v[s].label == v[t].label) ans.append("yes\n");
			else ans.append("no\n");
		}

		System.out.print(ans);
	}

	public static class Node {
		int label;

		Node next;

		public Node(int label) {
			this.label = label;
			this.next = this;
		}
	}
}
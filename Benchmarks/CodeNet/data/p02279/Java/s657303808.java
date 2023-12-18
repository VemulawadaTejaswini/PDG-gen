import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static Main main = new Main();
	static String format = "node %d: parent = %d, depth = %d, %s, %s";
	static String TYPE_ROOT="root";
	static String TYPE_INTR="internal node";
	static String TYPE_LEAF="leaf";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			int n = Integer.parseInt(line);
			Tree tree = main.new Tree(n);

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				tree.addNode(line);
			}
			for (int i = 0; i < n; i++) {
				Node node = tree.getNode(i);
				System.out.println(String.format(format, node.id,
						node.parentId(), node.depth(), node.type(),
						node.childIds()));
			}
		}
	}

	class Tree {
		Node[] nodes;

		Tree(int nodes) {
			this.nodes = new Node[nodes];
		}

		Node getNode(int id) {
			return nodes[id];
		}

		void addNode(String info) {
			StringTokenizer st = new StringTokenizer(info);
			Node pnode;
			int pid = Integer.parseInt(st.nextToken());

			if (nodes[pid] == null) {
				pnode = new Node(pid, null);
				nodes[pid] = pnode;
			} else {
				pnode = nodes[pid];
			}

			int k = Integer.parseInt(st.nextToken());
			if (k != 0) {
				for (int i = 0; i < k; i++) {
					Node cnode;
					int cid = Integer.parseInt(st.nextToken());
					if (nodes[cid] == null) {
						cnode = new Node(cid, pnode);
						nodes[cid] = cnode;
					} else {
						nodes[cid].parent = pnode;// ???????即????
						cnode = nodes[cid];
					}
					pnode.children.add(cnode);// ????????????
				}
			}
		}
	}

	class Node {
		int id;
		Node parent;
		ArrayList<Node> children;

		Node(int id, Node parent) {
			this.id = id;
			this.parent = parent;
			children = new ArrayList<Node>();
		}

		int parentId() {
			if (parent == null)
				return -1;
			return parent.id;
		}

		int depth() {
			int d = 0;
			Node pnode = parent;
			while (pnode != null) {
				d++;
				pnode = pnode.parent;
			}
			return d;
		}

		String type() {
			if (parent == null)
				return TYPE_ROOT;
			else if (children.size() > 0)
				return TYPE_INTR;
			else
				return TYPE_LEAF;
		}

		String childIds() {
			String result = "[";
			for (int i = 0; i < children.size(); i++) {
				if (i != children.size() - 1)
					result += children.get(i).id + ", ";
				else
					result += children.get(i).id;
			}
			result += "]";
			return result;
		}
	}
}
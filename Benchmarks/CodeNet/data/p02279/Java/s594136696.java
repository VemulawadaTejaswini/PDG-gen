import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static Main main = new Main();

	public static enum TYPE {
		ROOT, INTR, LEAF
	}

	static String TYPE_ROOT = "root";
	static String TYPE_INTR = "internal node";
	static String TYPE_LEAF = "leaf";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			int n = Integer.parseInt(line);
			Tree tree = main.new Tree();

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				tree.addNode(line);
			}
			for (int i = 0; i < n; i++) {
				Node node = tree.getNode(i, true);
				System.out.println(node.toString());
			}
		}
	}

	class Tree {
		ArrayList<Node> nodes;

		Tree() {
			nodes = new ArrayList<Node>();
		}

		Node getNode(int id, boolean recursive) {
			Node result = null;
			for (Node n : nodes) {
				if (n.id == id)
					return n;
			}
			if (recursive) {
				for (Node n : nodes) {
					result = n.find(id);
					if (result != null)
						break;
				}
			}
			return result;
		}

		void addNode(String info) {
			StringTokenizer st = new StringTokenizer(info);
			Node node;
			int id = Integer.parseInt(st.nextToken());

			// ???????????????????????則?????????????卒蔵
			node = getNode(id, true);
			if (node == null) {
				// ?????則???????????属?????? root ??即??????
				node = new Node(id, null);
				nodes.add(node);
			}

			int k = Integer.parseInt(st.nextToken());
			if (k != 0) {
				node.children = new ArrayList<Node>();
				for (int i = 0; i < k; i++) {
					Node cnode;
					int cid = Integer.parseInt(st.nextToken());
					// ??? root ??則?????????????卒蔵
					cnode = getNode(cid, false);
					if (cnode == null) {
						cnode = new Node(cid, node);
					} else {
						cnode.parent = node;// ???????即????
						nodes.remove(cnode);// ?????????????????贈???????????????????????則?????????
					}
					node.children.add(cnode);// ????????????
				}
			}
		}
	}

	class Node {
		int id;
		Node parent;
		ArrayList<Node> children;

		// Node[] children;

		Node(int id, Node parent) {
			this.id = id;
			this.parent = parent;
		}

		Node find(int id) {
			Node result = null;

			// if (this.id == id) {
			// return this;
			// }

			if (children != null) {
				for (Node n : children) {
					// if (n == null)
					// break;
					if (n.id == id)
						return n;
				}
				for (Node n : children) {
					// if (n == null)
					// break;
					result = n.find(id);
					if (result != null)
						break;
				}
			}
			return result;
		}

		int parentId() {
			if (parent == null)
				return -1;
			return parent.id;
		}

		int depth() {
			int result = 0;
			Node pnode = parent;
			while (pnode != null) {
				result++;
				pnode = pnode.parent;
			}
			return result;
		}

		TYPE type() {
			if (parent == null)
				return TYPE.ROOT;
			else if (children == null)
				return TYPE.LEAF;
			else
				return TYPE.INTR;
		}

		String typeByString() {
			String result = "";
			switch (type()) {
			case ROOT:
				result = TYPE_ROOT;
				break;
			case INTR:
				result = TYPE_INTR;
				break;
			case LEAF:
				result = TYPE_LEAF;
				break;
			}
			return result;
		}

		String childIds() {
			String result = "[";
			if (children != null) {
				for (int i = 0; i < children.size(); i++) {
					if (i != children.size() - 1)
						result += children.get(i).id + ", ";
					else
						result += children.get(i).id;
				}
			}
			result += "]";
			return result;
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("node " + id + ": ");
			sb.append("parent = " + parentId() + ", ");
			sb.append("depth = " + depth() + ", ");
			sb.append(typeByString() + ", ");
			sb.append(childIds());
			return sb.toString();
		}
	}
}
package p07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	static Main main = new Main();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			int n = Integer.parseInt(line);
			Tree tree = main.new Tree();

			// ??????????§????
			for (int i = 0; i < n; i++) {
				tree.addNode(br.readLine());
			}
			// ??????????????±??????
			for (int i = 0; i < n; i++) {
				System.out.println(tree.getNode(i).toString());
			}
		}
	}

	class Tree {

		ArrayList<Node> nodes = new ArrayList<Node>();

		void addNode(String info) {
			int pid, lid, rid;
			pid = Integer.parseInt(info.split(" ")[0]);
			lid = Integer.parseInt(info.split(" ")[1]);
			rid = Integer.parseInt(info.split(" ")[2]);

			// ????????¢??????????§????
			Node parent, left = null, right = null;
			if ((parent = getNode(pid)) == null) {
				parent = new Node(pid, null);
			}
			//
			if (lid != -1) {
				if ((left = getNode(lid)) == null) {
					left = new Node(lid, parent);
				} else {
					left.parent = parent;
					nodes.remove(left);
				}
			}
			//
			if (rid != -1) {
				if ((right = getNode(rid)) == null) {
					right = new Node(rid, parent);
				} else {
					right.parent = parent;
					nodes.remove(right);
				}
			}
			//
			parent.left = left;
			parent.right = right;
			if (parent.parent == null) {
				nodes.add(parent);
			}
		}

		Node getNode(int id) {
			Node result = null;
			for (Node n : nodes) {
				result = n.find(id);
				if (result != null)
					break;
			}
			return result;
		}
	}

	class Node {
		int id;
		Node parent;
		Node left;
		Node right;

		Node(int value, Node parent) {
			this.id = value;
			this.parent = parent;
		}

		Node find(int id) {
			Node result = null;
			if (this.id == id) {
				result = this;
			}
			if (result == null && left != null) {
				result = left.find(id);
			}
			if (result == null && right != null) {
				result = right.find(id);
			}
			return result;
		}

		int id() {
			return id;
		}

		int parentId() {
			if (parent != null)
				return parent.id();
			else
				return -1;
		}

		int sibling() {
			int lid, rid;
			if (parent != null) {
				if (parent.left != null) {
					lid = parent.left.id();
				} else {
					lid = -1;
				}
				if (parent.right != null) {
					rid = parent.right.id();
				} else {
					rid = -1;
				}
				return lid != id ? lid : rid;
			} else {
				return -1;
			}
		}

		int degree() {
			int result = 0;
			if (left != null)
				result++;
			if (right != null)
				result++;
			return result;
		}

		int depth() {
			int result = 0;
			Node p = parent;
			while (p != null) {
				result++;
				p = p.parent;
			}
			return result;
		}

		int height() {
			int lh = 0, rh = 0;
			if (left != null)
				lh = left.height() + 1;
			if (right != null)
				rh = right.height() + 1;
			return lh > rh ? lh : rh;
		}

		String type() {
			String result = "";
			if (parent == null)
				return "root";
			if (left != null || right != null)
				return "internal node";
			if (left == null && right == null)
				return "leaf";
			return result;
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("node " + id() + ": ");
			sb.append("parent = " + parentId() + ", ");
			sb.append("sibling = " + sibling() + ", ");
			sb.append("degree = " + degree() + ", ");
			sb.append("depth = " + depth() + ", ");
			sb.append("height = " + height() + ", ");
			sb.append(type());
			return sb.toString();
		}
	}
}
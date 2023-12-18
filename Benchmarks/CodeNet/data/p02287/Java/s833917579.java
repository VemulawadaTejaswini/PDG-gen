
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int id;
	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int h = in.nextInt();
		Queue<Long> a = new ArrayDeque<Long>();
		for (int i = 0; i < h; i++) {
			a.add(in.nextLong());
		}

		// solve
		Node nFirst = new Node(++id, a.remove(), Long.MAX_VALUE, null, null);
		Queue<Node> q = new ArrayDeque<>();
		q.add(nFirst);

		for (int i = 1; i < h; i++) {
			while (!q.isEmpty()) {
				Node n = q.peek();
				if (n.left != null) {
					q.add(n.left);
				} else {
					if (!a.isEmpty()) {
						Node newLeftNode = new Node(++id, a.remove(), n.nodeNum, null, null);
						n.left = newLeftNode;
						q.add(newLeftNode);
					}
				}

				if (n.right != null) {
					q.add(n.right);
				} else {
					if (!a.isEmpty()) {
						Node newRightNode = new Node(++id, a.remove(), n.nodeNum, null, null);
						n.right = newRightNode;
						q.add(newRightNode);
					}
					q.remove();
				}
			}
		}

		q.clear();
		q.add(nFirst);

		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < h; i++) {
			while (!q.isEmpty()) {
				Node n = q.remove();
				sb.append("node "+n.id+": key = "+n.nodeNum);
				if (n.parentNodeNum != Long.MAX_VALUE) {
					sb.append(", parent key = "+n.parentNodeNum+", ");
				}
				if (n.left != null) {
					q.add(n.left);
					sb.append("left key = "+n.left.nodeNum);
				}
				if (n.right != null) {
					q.add(n.right);
					sb.append(", right key = "+n.right.nodeNum+",");
				}
				sb.append("\n");
			}
		}

		System.out.print(sb.toString());

	}
	static class Node {
		int id;
		long nodeNum;
		long parentNodeNum;
		Node left;
		Node right;

		public Node(int id, long nodeNum, long parentNodeNum, Node left, Node right) {
			this.id = id;
			this.nodeNum = nodeNum;
			this.parentNodeNum = parentNodeNum;
			this.left = left;
			this.right = right;
		}
	}

}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	private class Node {
		int id, pos;
		Node left, right;
		public Node(int id) {
			this.id = id;
			pos = -1;
			left = right = null;
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] pre = new int[n];
		int[] in = new int[n];
		StringTokenizer st1 = new StringTokenizer(reader.readLine());
		StringTokenizer st2 = new StringTokenizer(reader.readLine());
		int rootId = -1;
		int rootPos = -1;
		for (int i = 0; i < n; i++) {
			pre[i] = Integer.parseInt(st1.nextToken());
			in[i] = Integer.parseInt(st2.nextToken());
			if (i == 0) {
				rootId = pre[i];
			}
			if (rootId == in[i]) {
				rootPos = i;
			}
		}
		Node rootNode = new Node(pre[0]);
		rootNode.pos = rootPos;
		for (int i = 1; i < n; i++) {
			addNode(rootNode, new Node(pre[i]), in);
		}
		System.out.println(postOrder(rootNode));
	}

	private String postOrder(Node rootNode) {
		StringBuilder sb = new StringBuilder();
		Stack<Node> stack = new Stack<Node>();
		Node lastVisited = null;
		Node current = rootNode;
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				Node peekNode = stack.peek();
				if (peekNode.right != null && peekNode.right != lastVisited) {
					current = peekNode.right;
				} else {
					if (sb.length() != 0) {
						sb.append(" ");
					}
					sb.append(peekNode.id);
					lastVisited = stack.pop();
				}
			}
		}		
		return sb.toString();
	}

	private void addNode(Node rootNode, Node newNode, int[] in) {
		newNode.pos = findPos(newNode.id, in);
		Stack<Node> stack = new Stack<Node>();
		stack.push(rootNode);
		while (!stack.isEmpty()) {
			Node current = stack.pop();
			if (current.pos == -1) {
				current.pos = findPos(current.id, in);
			}
			if (newNode.pos < current.pos) {
				if (current.left == null) {
					current.left = newNode;
				} else {
					stack.push(current.left);
				}
			} else {
				if (current.right == null) {
					current.right = newNode;
				} else {
					stack.push(current.right);
				}
			}
		}
	}

	private int findPos(int id, int[] in) {
		for(int i = 0; i < in.length; i++) {
			if (in[i] == id) return i;
 		}
		return -1;
	}	
}

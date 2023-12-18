import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	private class Node {
		int key, pri;
		Node left, right;
		public Node(int key, int pri) {
			this.key = key;
			this.pri = pri;
			left = right = null;
		}
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("key=" + key);
			sb.append(",pri=" + pri);
			sb.append(",left=");
			if (left != null) sb.append(left.key);
			sb.append(",right=");
			if (right != null) sb.append(right.key);
			return sb.toString();
		}
	}

	private class Treap {
		Node root;
		public Treap() {
			root = null;
		}
		
		public void print() {
			printInOrder();
			printPreOrder();
		}
		
		private void printInOrder() {
			Stack<Node> st = new Stack<Node>();
			Node cur = root;
			while (cur != null || !st.isEmpty()) {
				if (cur != null) {
					st.push(cur);
					cur = cur.left;
				} else {
					cur = st.pop();
					System.out.print(" " + cur.key);
					cur = cur.right;
				}
			}
			System.out.println("");
		}
		
		private void printPreOrder() {
			Stack<Node> st = new Stack<Node>();
			st.push(root);
			while (!st.isEmpty()) {
				Node cur = st.pop();
				System.out.print(" " + cur.key);
				if (cur.right != null) st.push(cur.right);
				if (cur.left != null) st.push(cur.left);
			}
			System.out.println("");
		}
		
		public Node find(int key) {
			Node cur = root;
			while (cur != null) {
				if (key == cur.key) return cur;
				if (key < cur.key) cur = cur.left;
				else cur = cur.right;
			}
			return null;
		}
		
		public void insert(int key, int pri) {			
			root = insert(root, key, pri);
		}		
		
		private Node insert(Node node, int key, int pri) {
			if (node == null) {
				node = new Node(key, pri);
			} else if (key < node.key) {
				node.left = insert(node.left, key, pri);
				if (node.pri < node.left.pri) {
					node = rightRotate(node);
				}
			} else if (key > node.key) {
				node.right = insert(node.right, key, pri);				
				if (node.pri < node.right.pri) {
					node = leftRotate(node);
				}
			}
			return node;
		}

		private Node leftRotate(Node node) {
			Node tmp = node.right;
			node.right = tmp.left;
			tmp.left = node;
			return tmp;
		}

		private Node rightRotate(Node node) {
			Node tmp = node.left;
			node.left = tmp.right;
			tmp.right = node;
			return tmp;
		}

		public void delete(int key) {
			root = delete(root, key);
		}

		private Node delete(Node node, int key) {
			if (node != null) {
				if (key < node.key) {
					node.left = delete(node.left, key);
				} else if (key > node.key) {
					node.right = delete(node.right, key);
				} else {
					return delete_(node, key);
				}
			}
			return node;
		}

		private Node delete_(Node node, int key) {
			if (node.left == null && node.right == null) {
				return null;
			} else if (node.left == null) {
				node = node.right;
			} else if (node.right == null) {
				node = node.left;
			} else {
				if (node.left.pri > node.right.pri) {
					node = rightRotate(node);
				} else {
					node = leftRotate(node);
				}
			}
			return delete(node, key);
		}
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Treap treap = new Treap();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			String cmd = st.nextToken();
			if (cmd.equals("print")) {
				treap.print();
			} else {
				int key = Integer.parseInt(st.nextToken());
				if (cmd.equals("insert")) {
					treap.insert(key, Integer.parseInt(st.nextToken()));
				} else if (cmd.equals("find")) {
					if (treap.find(key) != null) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
				} else {
					treap.delete(key);
				}
			}
		}
		reader.close();
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}


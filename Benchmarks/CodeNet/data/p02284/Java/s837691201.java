import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private class Node {
		int key;
		Node left, right, parent;
		public Node(int key) {
			this.key = key;
			left = right = parent = null;
		}
	}
	
	private class BST {
		Node rootNode;
		public BST() {
			rootNode = null;
		}

		public void insert(int key) {
			Node newNode = new Node(key);
			Node parent = null;
			Node current = rootNode;
			while (current != null) {
				parent = current;
				if (key < current.key) {
					current = current.left;
				} else {
					current = current.right;
				}
			}
			newNode.parent = parent;
			if (parent == null) {
				rootNode = newNode;
			} else if (key < parent.key) {
				parent.left = newNode;
			} else {
				parent.right = newNode;
			}			
		}
		
		public Node find(int key) {
			Node current = rootNode;
			while (current != null) {
				if (key == current.key) {
					return current;
				}
				if (key < current.key) {
					current = current.left;
				} else {
					current = current.right;
				}
			}		
			return null;
		}
		
		public void delete(int key) {
			
		}
		
		public void print() {
			printInOrder(rootNode);
			System.out.println("");
			printPreOrder(rootNode);
			System.out.println("");
		}

		private void printPreOrder(Node node) {
			if (node != null) {
				System.out.print(" " + node.key);
				printPreOrder(node.left);
				printPreOrder(node.right);
			}
		}

		private void printInOrder(Node node) {
			if (node != null) {
				printInOrder(node.left);
				System.out.print(" " + node.key);
				printInOrder(node.right);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		BST bst = new BST();
		for (int i = 0; i < n; i++) {
			String cmd = reader.readLine();
			if (cmd.startsWith("print")) {
				bst.print();
			} else {
				StringTokenizer st = new StringTokenizer(cmd);
				cmd = st.nextToken();
				int key = Integer.parseInt(st.nextToken());
				if (cmd.equals("insert")) {
					bst.insert(key);
				} else if (cmd.equals("find")) {
					if (bst.find(key) != null) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
				} else {
					bst.delete(key);
				}
			}
		}
		reader.close();
	}
}


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public class Node<E> {
		E value;
		Node<E> left;
		Node<E> right;
		Node<E> parent;
		public Node(E value) {
			this.value = value;
			left = right = parent = null;
		}
		public Node<E> insertLeft(E value) {
			left = new Node<E>(value);
			return left;
		}
		public Node<E> insertRight(E value) {
			right = new Node<E>(value);
			return right;
		}
		public String toString() {
			return value.toString();
		}
	}
	
	public class NodeData {
		int id, left, right;
		public NodeData(int id, int left, int right) {
			this.id = id;
			this.left = left;
			this.right = right;
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		NodeData[] nodeData = new NodeData[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int id = Integer.parseInt(st.nextToken());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			nodeData[i] = new NodeData(id, left, right);
		}
		Map<Integer, Node<Integer>> map = new HashMap<Integer, Node<Integer>>();
		for (int i = 0; i < n; i++) {
			NodeData data = nodeData[i];
			Node<Integer> current = null;
			if (!map.containsKey(data.id)) {
				current = new Node<Integer>(data.id);
				map.put(data.id, current);
			} else {
				current = map.get(data.id);
			}
			if (data.left != -1) {
				Node<Integer> left = null;
				if (!map.containsKey(data.left)) {
					left = new Node<Integer>(data.left);
					map.put(data.left, left);
				} else {
					left = map.get(data.left);
				}
				current.left = left;
				left.parent = current;
			}
			if (data.right != -1) {
				Node<Integer> right = null;
				if (!map.containsKey(data.right)) {
					right = new Node<Integer>(data.right);
					map.put(data.right, right);
				} else {
					right = map.get(data.right);
				}
				current.right = right;
				right.parent = current;
			}
		}
		Node<Integer> rootNode = null;
		Set<Entry<Integer, Node<Integer>>> entrySet = map.entrySet();
		Iterator<Entry<Integer, Node<Integer>>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Entry<Integer, Node<Integer>> pair = itr.next();
			Node<Integer> current = pair.getValue();
			if (current.parent == null) {
				rootNode = current;
				break;
			}
		}
		System.out.println("Preorder");
		preOrder(rootNode);
		System.out.println("Inorder");
		inOrder(rootNode);
		System.out.println("Postorder");
		postOrder(rootNode);
	}

	private void preOrder(Node<Integer> rootNode) {
		Stack<Node<Integer>> stack = new Stack<Node<Integer>>();
		stack.push(rootNode);
		while (!stack.isEmpty()) {
			Node<Integer> current = stack.pop();
			System.out.print(" " + current);
			if (current.right != null)
				stack.push(current.right);
			if (current.left != null)
				stack.push(current.left);
		}
		System.out.println("");
	}
	
	private void inOrder(Node<Integer> rootNode) {
		Stack<Node<Integer>> stack = new Stack<Node<Integer>>();
		Node<Integer> current = rootNode;
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				current = stack.pop();
				System.out.print(" " + current);
				current = current.right;
			}
		}
		System.out.println("");
	}

	private void postOrder(Node<Integer> rootNode) {
		Stack<Node<Integer>> stack = new Stack<Node<Integer>>();
		Node<Integer> current = rootNode;
		Node<Integer> lastVisited = null;
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				Node<Integer> peekNode = stack.peek();
				if (peekNode.right != null && peekNode.right != lastVisited) {
					current = peekNode.right;
				} else {
					System.out.print(" " + peekNode);
					lastVisited = stack.pop();
				}
			}
		}
		System.out.println("");		
	}
}

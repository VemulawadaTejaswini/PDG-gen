import java.util.Scanner;

public class Main {
	
	class Node {
		public Integer val;
		public Node left = null;
		public Node right = null;
		
		
		public Node() {
			this.val = null;
		}
		
		public Node(int val) {
			this.val = val;
		}
		
		public boolean hasLeft() {
			return this.left != null;
		}
		
		public boolean hasRight() {
			return this.right != null;
		}
		
		public boolean hasChildren() {
			return this.hasLeft() || this.hasRight();
		}
	}
	
	private Node root;
	private Node curr;
	
	public Main() {
		this.root = this.curr = new Node();
	}
	
	public Main(int val) {
		this.root = new Node(val);
		this.curr = root;
	}
	
	private void insert(int v) {
		find(v);
		
		Node n = new Node(v);
		
        if(curr.val <= v) {
            if(curr.hasRight()) {
            	n.right = curr.right;
            }
            curr.right = n;
        }
        else {
        	if(curr.hasLeft()) {
            	n.left = curr.left;
            }
            curr.left = n;
        }
	}
	
	public void preorder() {
		preorder(root);
		System.out.print("\n");
	}
	
	private void preorder(Node n) {
		if (n != null) {
			System.out.print(" " + n.val);
			preorder(n.left);
			preorder(n.right);
		}
		
	}
	
	public void inorder() {
		inorder(root);
		System.out.print("\n");
	}
	
	private void inorder(Node n) {
		if (n != null) {
			inorder(n.left);
			System.out.print(" " + n.val);
			inorder(n.right);
		}
	}
	
	public boolean find(int v) {
		return find(this.root, v);
	}
	
	private boolean find(Node n, int v) {
		if(n == null || n.val == null) {
			return false;
		}
		
        curr = n;
        
        if(v == n.val) {
            return true;
        } else {
            if(!n.hasChildren()) {
            	return false;
            } else if(v > n.val) {
                return find(n.right, v);
            } else {
                return find(n.left, v);
            }
        }
	}
	
	public void delete(int v) {
		this.delete(this.root, v);
	}
	
	private Node delete(Node n, int v) {
		if(n == null) {
			return null;
		}
		
        if(n.val > v) {
        	n.left = delete(n.left, v);
        } else if (n.val < v) {
        	n.right = delete(n.right, v);
        } else {
        	if(n.left == null) {
            	return n.right;
            } else if(n.right == null) {
            	return n.left;
            } else {
            	Node current = n.right;
            	Node parent = n;
				while (current.hasLeft()) {
					parent = current;
					current = current.left;
				}

				if (!(parent == n)) {
					
					parent.left = null;
				} else {
					parent.right = null;
				}
				n.val = current.val;
            }
        }
        
		return n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String unused = in.nextLine();
		Main t = new Main(Integer.parseInt(in.nextLine().split(" ")[1]));
		while (in.hasNextLine()) {
			String command = in.nextLine();
			String[] components = command.split(" ");
			switch(components[0]) {
				case "find":
					String ans = t.find(Integer.parseInt(components[1])) ? "yes" : "no";
					System.out.println(ans);
					break;
				case "delete":
					t.delete(Integer.parseInt(components[1]));
					break;
				case "insert":
					t.insert(Integer.parseInt(components[1]));
					break;
				default:
					t.inorder();
					t.preorder();
			}
		}
	}
}

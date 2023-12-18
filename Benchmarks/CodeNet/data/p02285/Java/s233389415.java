import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Node root = new Node();
	TreeWalker walker = new TreeWalker();
	int n = Integer.parseInt(br.readLine());
	String[] input;
	for (int i = 0; i < n; i++) {
	    input = br.readLine().split(" ");
	    if (input.length == 1) {
		walker.runPrintInorder(root.right);
		walker.runPrintPreorder(root.right);
	    } else if (input.length == 2) {
		if (input[0].equals("insert")) {
		    root.insert (root, Integer.parseInt(input[1]));
		} else if (input[0].equals("find")) {
		    root.find (root, Integer.parseInt(input[1]));
		} else if (input[0].equals("delete")) {
		    root.delete (root, Integer.parseInt(input[1]));
		}
	    }
	}
	
    }
}
class Node {
    int key;
    Node left;
    Node right;
    TreeWalker walker = new TreeWalker();
    ArrayList<Node> list;
    Node () {
	key = 2000000001 * (-1);
	left = null;
	right = null;
    }
    Node (int key) {
	this.key = key;
	left = null;
	right = null;
    }
    void insert (Node root, int key) {
	Node node = root;
	Node parent = null;
	while (node != null) {
	    parent = node;
	    if (key < node.key) {
		node = node.left;
	    } else {
		node = node.right;
	    }
	}
	if (parent == null) {
	    parent = new Node (key);
	} else if (key < parent.key) {
	    parent.left = new Node (key);
	} else {
	    parent.right = new Node (key);
	}
    }
    void find (Node root, int key) {
	Node node = root;
	boolean isFind = false;
	while (node != null) {
	    if (key == node.key) {
		isFind = true;
		break;
	    }
	    if (key < node.key) {
		node = node.left;
	    } else {
		node = node.right;
	    }
	}
	if (isFind) {
	    System.out.println("yes");
	} else {
	    System.out.println("no");
	}
    }
    void delete (Node root, int key) {
	System.out.println("delete_: " + key);
	Node node = root;
	Node parent = null;
	while (node != null && node.key != key) {
	    parent = node;
	    if (key < node.key) {
		node = node.left;
	    } else {
		node = node.right;
	    }
	}
	System.out.println(parent.key);
	if (node == null) return;
	if (node.left == null && node.right == null) {
	    deleteLeaf(parent, node);
	} else if (node.left != null && node.right != null) {
	    list = walker.getInorder(root);
	    int index = 0;
	    while (list.get(index) != node) {
		index++;
	    }
	    Node nextNode = list.get(index+1);
	    key = nextNode.key;
	    Node tmp = node;
	    node = root;
	    parent = null;
	    while (node != null && node.key != key) {
		parent = node;
		if (key < node.key) {
		    node = node.left;
		} else {
		    node = node.right;
		}
	    }
	    tmp.key = nextNode.key;
	    if (nextNode.left == null && nextNode.right == null) {
		deleteLeaf(parent, nextNode);
	    } else if (nextNode.left != null || nextNode.right != null) {
		deleteInternalNode(parent, nextNode);
	    }
	    node = null;
	}
	else if (node.left != null || node.right != null) {
	    deleteInternalNode(parent, node);
	}
    }
    void deleteLeaf (Node parent, Node child) {
	System.out.println("deleteLeaf");
	if (parent.left == child) {
	    parent.left = null;
	} else if (parent.right == child) {
	    parent.right = null;
	}
	child = null;
    }
    void deleteInternalNode (Node parent, Node node) {
	if (node.left != null && node.right == null) {
	    if (parent.left == node) {
		parent.left = node.left;
	    } else if (parent.right == node) {
		parent.right = node.left;		
	    }
	} else if (node.left == null && node.right != null) {
	    if (parent.left == node) {
		parent.left = node.right;
	    } else if (parent.right == node) {
		parent.right = node.right;
	    }
	}
	node = null;
    }
}
class TreeWalker {
    ArrayList<Node> getInorder (Node root) {
	ArrayList<Node> list = new ArrayList<Node>();
	inorder(root, list);
	return list;
    }
    void inorder (Node node, ArrayList<Node> list) {
	if (node == null) {
	    return;
	}
	inorder(node.left, list);
	list.add(node);
	inorder(node.right, list);
    }
    void runPrintInorder (Node root) {
	StringBuilder sb = new StringBuilder();
	printInorder(root, sb);
	System.out.println(sb);
    }
    void printInorder (Node node, StringBuilder sb) {
	if (node == null) {
	    return;
	}
	printInorder(node.left, sb);
	sb.append(" " + node.key);
	printInorder(node.right, sb);
    }
    void runPrintPreorder (Node root) {
	StringBuilder sb = new StringBuilder();
	printPreorder(root, sb);
	System.out.println(sb);
    }
    void printPreorder (Node node, StringBuilder sb) {
	if (node == null) {
	    return;
	}
	sb.append(" " + node.key);
	printPreorder(node.left, sb);
	printPreorder(node.right, sb);
    }
}
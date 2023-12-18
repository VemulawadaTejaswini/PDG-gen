import java.util.Scanner;

class Node {
	int i, id, left, right, parent = -1, sibling = -1, degree = 0, depth = 0, height = 0;

	public Node(int Id, int l, int r) {
		id = Id;
		left = l;
		right = r;
	}
}

public class Main {

	public static void preorder(int i,Node[] node) {
		System.out.print(" " + node[i].id);
		if (node[i].left != -1) {
			preorder(node[i].left,node);
		}
		if (node[i].right != -1) {
			preorder(node[i].right,node);
		}
	}
	public static void inorder(int i,Node[] node) {
        if (node[i].left != -1) {
            inorder(node[i].left,node);
            }
        System.out.print(" " + node[i].id);
        if (node[i].right != -1) {
            inorder(node[i].right,node);
        }
    }
 
    public static void postorder(int i,Node[] node) {
        if (node[i].left != -1) {
            postorder(node[i].left,node);
            }
        if (node[i].right != -1) {
            postorder(node[i].right,node);
        }
        System.out.print(" "+node[i].id);
    }
 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, n, id, l, r;
		n = scan.nextInt();
		Node[] node = new Node[n];
		for (i = 0; i < n; i++) {
			id = scan.nextInt();
			l = scan.nextInt();
			r = scan.nextInt();
			node[id] = new Node(id, l, r);
		}
		for (i = 0; i < n; i++) {
			if (node[i].left != -1) {
				node[node[i].left].parent = node[i].id;
				node[node[i].left].sibling = node[i].right;
			}
			if (node[i].right != -1) {
				node[node[i].right].parent = node[i].id;
				node[node[i].right].sibling = node[i].left;
			}
		}
		for (i = 0; i < n; i++) {
			if (node[i].parent == -1) {
				System.out.println("Preorder");
				preorder(i,node);
				System.out.println("\nInorder");
                inorder(i,node);
                System.out.println("\nPostorder");
                postorder(i,node);
				System.out.println("");
				break;
			}
		}
		scan.close();
	}
}

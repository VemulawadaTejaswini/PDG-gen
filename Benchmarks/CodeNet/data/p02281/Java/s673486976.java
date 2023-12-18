import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node[] a = new Node[n];
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			a[id] = new Node();
			a[id].id = id;
			a[id].l = sc.nextInt();
			a[id].r = sc.nextInt();
			a[id].p = -1;
		}

		for (int i = 0; i < n; i++) {
			if (a[i].l != -1) a[a[i].l].p = a[i].id;
			if (a[i].r != -1) a[a[i].r].p = a[i].id;
		}

		int j = 0;
		while(a[j].p != -1) j++;
		int root = a[j].id;
		
		System.out.println("Preorder");
		preorder(a, root);
		System.out.println();

		System.out.println("Inorder");
		inorder(a, root);
		System.out.println();

		System.out.println("Postorder");
		postorder(a, root);
		System.out.println();
	}

	static void preorder(Node a[], int id) {
		System.out.print(" " + id);
		if (a[id].l != -1) preorder(a, a[a[id].l].id);
		if (a[id].r != -1) preorder(a, a[a[id].r].id);
	}

	static void inorder(Node a[], int id) {
		if (a[id].l != -1) inorder(a, a[a[id].l].id);
		System.out.print(" " + id);
		if (a[id].r != -1) inorder(a, a[a[id].r].id);
	}

	static void postorder(Node a[], int id) {
		if (a[id].l != -1) postorder(a, a[a[id].l].id);
		if (a[id].r != -1) postorder(a, a[a[id].r].id);
		System.out.print(" " + id);
	}
}

class Node {
	int id;
	int l;
	int r;
	int p;
}
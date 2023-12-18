import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node[] heap = new Node[n + 1];
		heap[0] = new Node();
		for (int i = 1; i < n + 1; i++) {
			heap[i] = new Node();
			heap[i].id = i;
			heap[i].key = sc.nextInt();
		}

		for (int i = 1; i < n + 1; i++) {
			heap[i].p = heap[i / 2].key;
			if (2 * i > n) continue;
			else heap[i].l = heap[2 * i].key;
			if (2 * i + 1 > n) continue;
			else heap[i].r = heap[2 * i + 1].key;
		}

		for (int i = 1; i < n + 1; i++) {
			System.out.print("node " + heap[i].id + ": key = " + heap[i].key + ", ");
			if (heap[i].p != Integer.MIN_VALUE) System.out.print("parent key = " + heap[i].p + ", ");
			if (heap[i].l != Integer.MIN_VALUE) System.out.print("left key = " + heap[i].l + ", ");
			if (heap[i].r != Integer.MIN_VALUE) System.out.print("right key = " + heap[i].r + ", ");
			System.out.println();
		}
	}
}

class Node {
	int id;
	int key;
	int p;
	int l;
	int r;

	Node() {
		id = Integer.MIN_VALUE;
		key = Integer.MIN_VALUE;
		p = Integer.MIN_VALUE;
		l = Integer.MIN_VALUE;
		r = Integer.MIN_VALUE;
	}
}
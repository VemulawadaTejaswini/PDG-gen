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

		buildMaxHeap(heap, n);
		for(int i = 1;i < n+1;i++){
			System.out.print(" "+heap[i].key);
		}
		System.out.println();
	}

	static void maxHeapify(Node A[], int i, int n) {
		int l = 2 * i;
		int r = 2 * i + 1;
		int max = i;
		//System.out.println(l+" "+r);
		if (l <= n && A[l].key > A[max].key)max = l;
		if (r <= n && A[r].key > A[max].key)max = r;
		if (max != i) {
			int temp = A[i].key;
			A[i].key = A[max].key;
			A[max].key = temp;
			maxHeapify(A, max, n);
		}

	}

	static void buildMaxHeap(Node A[], int n){
		for(int i = n/2;i > 0;i--){
			maxHeapify(A, i, n);
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
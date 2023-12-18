import java.util.Scanner;

public class Main {
	class PriorityQueue {
		final int MAX_HEAP = 2000000;
		int[] heap;
		int h;
		PriorityQueue() {
			this.heap = new int[MAX_HEAP + 1];
			this.h = 0;
		}
		void insert(int k) {
			h++;
			this.heap[h] = k;
			buildMaxHeap();
		}
		void extract() {
			System.out.println(heap[1]);
			heap[1] = 0;
			buildMaxHeap();
			h--;
		}
		void maxHeapify(int i) {
			int left = 2 * i;
			int right = 2 * i + 1;
			int largest = 0;
			if (left <= h && heap[left] > heap[i])
				largest = left;
			else
				largest = i;
			if (right <= h && heap[right] > heap[largest])
				largest = right;
			if (largest != i) {
				int tmp = heap[i];
				heap[i] = heap[largest];
				heap[largest] = tmp;
				maxHeapify(largest);
			}
		}
		void buildMaxHeap() {
			for (int i = h / 2; i >= 1; i--)
				maxHeapify(i);
		}
	}

	void run() {
		Scanner scan = new Scanner(System.in);
		PriorityQueue que = new PriorityQueue();
		while (true) {
			String inst = scan.next();
			switch (inst) {
			case "insert":
				int k = scan.nextInt();
				que.insert(k);
				break;
			case "extract":
				que.extract();
				break;
			case "end":
				return;
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}


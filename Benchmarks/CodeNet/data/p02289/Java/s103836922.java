
import java.util.Scanner;

public class Main {
	int MAX = 200000;
	int H = 0;
	int A[] = new int[MAX + 1];
	int INF = -1;

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String line = scanner.next();
			if (line.equals("end"))
				break;
			else if (line.equals("insert")) {
				insert(scanner.nextInt());
			} else {
				System.out.println(extract());
			}
		}
	}

	private int extract() {
		int maxv = A[1];
		A[1] = A[H--];
		maxHeapify(1);
		return maxv;
	}

	private void maxHeapify(int i) {
		int l = left(i);
		int r = right(i);
		int largest = -1;
		if (l <= H && A[l] > A[i])
			largest = l;
		else
			largest = i;
		if (r <= H && A[r] > A[largest])
			largest = r;
		if (i != largest) {
			swap(i, largest);
			maxHeapify(largest);
		}
	}

	private void insert(int key) {
		H++;
		A[H] = INF;
		inceraseKey(H, key);
	}

	private void inceraseKey(int i, int key) {
		if (A[H] > 0)
			return;
		A[H] = key;
		while (i > 1 && A[i] > A[parent(i)]) {
			swap(i, parent(i));
			i = parent(i);
		}
	}

	private void swap(int i, int parent) {
		int t = A[i];
		A[i] = A[parent];
		A[parent] = t;
	}

	int parent(int i) {
		return i / 2;
	}

	int left(int i) {
		return i * 2;
	}

	int right(int i) {
		return i * 2 + 1;
	}
}
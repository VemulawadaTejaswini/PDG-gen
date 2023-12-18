
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int[] A = new int[H];
		for (int i = 0; i < H; i++) {
			A[i] = in.nextInt();
		}
		buildMaxHeap(A);
		for (int i : A) {
			System.out.print(" " + i);
		}
		System.out.println();
	}

	public static void buildMaxHeap(int[] A) {
		int H = A.length;
		for (int i = H / 2; i >= 0; i--) {
			maxHeapify(A, i);
		}
	}

	public static void maxHeapify(int[] A, int i) {
		int H = A.length;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest;
		if (l < H && A[l] > A[i]) {
			largest = l;
		} else {
			largest = i;
		}
		if (r < H && A[r] > A[largest]) {
			largest = r;
		}

		if (largest != i) {
			int tmp = A[i];
			A[i] = A[largest];
			A[largest] = tmp;
			maxHeapify(A, largest);
		}
	}
}

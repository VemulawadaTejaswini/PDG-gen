import java.util.Scanner;

public class Main {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] heap = new int[size];
		for (int i = 0; i < size; i++) {
			heap[i] = in.nextInt();
		}
		for (int i = 0; i < size; i++) {
			System.out.println("node " + (i + 1) + ": key = " + heap[i] + ", " + getParent(heap, i) + getLeft(heap, i)
					+ getRight(heap, i));
		}
	}

	/**
	 * returns the parent key of the element in the given heap at the given index
	 */
	public static String getParent(int[] heap, int i) {
		int par = (i - 1) / 2;
		if (par >= 0 && i != 0) {
			return "parent key = " + heap[par] + ", ";
		} else {
			return "";
		}
	}

	/**
	 * returns the left child key of the element in the given heap at the given
	 * index
	 */
	public static String getLeft(int[] heap, int i) {
		int left = i * 2 + 1;
		if (left < heap.length) {
			return "left key = " + heap[left] + ", ";
		} else {
			return "";
		}
	}

	/**
	 * returns the right child key of the element in the given heap at the given
	 * index
	 */
	public static String getRight(int[] heap, int i) {
		int right = i * 2 + 2;
		if (right < heap.length) {
			return "right key = " + heap[right] + ", ";
		} else {
			return "";
		}
	}
}

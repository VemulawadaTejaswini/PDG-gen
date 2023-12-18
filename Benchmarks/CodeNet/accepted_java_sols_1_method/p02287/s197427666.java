import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] heap = new int[size];
		
		for (int i = 0; i < size; i++) {
			heap[i] = in.nextInt();
		}
		
		in.close();
		
		for (int i = 0; i < size; i++) {
			int parent = (i - 1) /2;
			int lchild = 2 * i + 1;
			int rchild = 2 * i + 2;
			System.out.print("node " + (i + 1) + ": key = " + heap[i] + ", ");
			if (i > parent) {
				System.out.print("parent key = " + heap[parent] + ", ");
			}
			if (lchild <= (size-1)) {
				System.out.print("left key = " + heap[lchild] + ", ");
			}
			if (rchild <= (size-1)) {
				System.out.print("right key = " + heap[rchild] + ", ");
			}
			System.out.println();
		}
	}
}


import java.util.*;

public class Main {
	public static void main(String[] argv) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] heap = new int[size + 1];

		for (int i = 1; i <= size; i++)
			heap[i] = in.nextInt();
		in.close();
		
		for (int i = 1; i <= size; i++) {
			System.out.print("node " + i + ": key = " + heap[i] + ", ");
			if (i / 2 > 0)
				System.out.print("parent key = " + heap[i/2] + ", ");
			if ((i * 2) <= size)
				System.out.print("left key = " + heap[i*2] + ", ");
			if ((2*i + 1) <= size)
				System.out.print("right key = " + heap[(2*i) + 1] + ", ");
			System.out.println();
			
		}
	}
}


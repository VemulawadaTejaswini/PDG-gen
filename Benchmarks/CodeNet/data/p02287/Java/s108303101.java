import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] bHeap = new int[size];
		for (int  i = 0; i < size; i++) bHeap[i] = s.nextInt();
		System.out.println("node 1: key = " + bHeap[0] + ", left key = " + bHeap[1] + ", right key = " + bHeap[2] + ", ");
		for (int i = 1; i < size; i++) {
			System.out.print("node " + (i+1) + ": key = " + bHeap[i] + ", parent key = " + bHeap[(i-1)/2] + ", ");
			int l = (2*i + 1);
			int r = (2*i + 2);
			if (l < size) System.out.print("left key = " + bHeap[l] + ", ");
			if (r < size) System.out.print("right key = " + bHeap[r] + ", ");
			System.out.println();
		}
	}	
}


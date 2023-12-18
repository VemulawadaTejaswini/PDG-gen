import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[] heap = new int[n];
		for(int i = 0; i < n; i ++) {
			heap[i] = in.nextInt();
		}
		in.close();

		int pos = 1;
		for(int i = 0; i < n; i++) {
			System.out.print("node " + (i + 1) + ": key = " + heap[i] + ", ");
			if(i != 0) {
				System.out.print("parent key = " + heap[(int) Math.floor((i-1)/2)] + ", ");
			}
			if(pos < n) {
				System.out.print("left key = " + heap[pos] + ", ");
			}
			if(pos + 1 < n) {
				System.out.print("right key = " + heap[pos + 1] + ", ");
			}
			System.out.println();
			pos += 2;
		}
	}
}

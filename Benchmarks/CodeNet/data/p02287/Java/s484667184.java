import java.util.Scanner;
import java.io.IOException;

// ALDS1_9_A
public class Main {
	void run() throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n+1]; A[0] = 0;
		for (int i = 1; i < n+1; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 1; i < n+1; i++) {
			System.out.print("node " + i + ": key = " + A[i] + ", ");
			if (i/2 > 0) System.out.print("parent key = " + A[i/2] + ", ");
			if (2*i < A.length) System.out.print("left key = " + A[2*i] + ", ");
			if (2*i+1 < A.length) System.out.print("right key = " + A[2*i+1] + ", ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}


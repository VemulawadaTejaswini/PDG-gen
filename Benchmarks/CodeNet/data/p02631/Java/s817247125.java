import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    int[] A = new int[N];

	    for (int i = 0; i < N; i++) {
	        A[i] = Integer.parseInt(scanner.next());
	    }

	    int allXor = 0;

	    for (int i = 0; i < A.length; i++) {
	        allXor = allXor^A[i];
	    }

	    A[0] = A[0]^allXor;
	    System.out.print(A[0]);
	    for (int i = 1; i < N; i++) {
		    System.out.print(" ");
		    A[i] = A[i]^allXor;
		    System.out.print(A[i]);
	    }
	}
}
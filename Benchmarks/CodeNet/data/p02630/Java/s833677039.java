import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    int[] A = new int[N];
	    for (int i = 0; i < N; i++) {
	        A[i] = Integer.parseInt(scanner.next());
	    }

	    int Q = Integer.parseInt(scanner.next());
	    int[] B = new int[Q];
	    int[] C = new int[Q];
	    for (int i = 0; i < Q; i++) {
	        B[i] = Integer.parseInt(scanner.next());
	        C[i] = Integer.parseInt(scanner.next());
	    }

        for (int i = 0; i < Q; i++) {
        	long sum = 0;
            for (int j = 0; j < N; j++) {
                if (B[i] == A[j]) {
                    A[j] = C[i];
                    sum+=A[j];
                } else {
                    sum+= A[j];
                }
            }

    	    System.out.println(sum);
        }
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    int K = Integer.parseInt(scanner.next());

	    int[] P = new int[N];

	    for (int i = 0; i < N; i++) {
	        P[i] = Integer.parseInt(scanner.next());
	    }

	    Arrays.sort(P);

	    int result = 0;
	    for (int i = 0; i < K; i++) {
	        result += P[i];
	    }

	    System.out.println(result);
	}

}
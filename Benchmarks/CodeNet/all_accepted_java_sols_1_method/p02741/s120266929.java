import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	/* --------------------------------------------------------------------
	   main
	 * -------------------------------------------------------------------- */
	static final int[] A = {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
	public static void main(String args[]) throws Exception {

		// ----- input -----
		int K = 0;
		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))){
			K = Integer.parseInt(input.readLine());
		}

		System.out.println(A[K-1]);
	}
}

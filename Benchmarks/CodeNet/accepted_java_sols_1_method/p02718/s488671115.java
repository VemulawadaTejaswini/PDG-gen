import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String W = in.readLine();

			int N = Integer.parseInt(W.split(" ")[0]);
			int M = Integer.parseInt(W.split(" ")[1]);

			Integer[] A = new Integer[N];

			String Y = in.readLine();
			for(int i = 0; i < N; i++) {
				A[i] = Integer.parseInt(Y.split(" ")[i]);
			}

			long sum = 0;
			for(long i:A) {
			sum+=i;
			}


			 Arrays.sort(A, Collections.reverseOrder());

			if(A[M -1] >= (double)sum/(4*M)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}

	}

}

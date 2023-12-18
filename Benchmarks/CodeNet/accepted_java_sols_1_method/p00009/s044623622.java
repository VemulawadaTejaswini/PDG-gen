import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = 999999;
		int[] P = new int[N+1];
		P[0] = 1; P[1] = 1;
		for (int i = 4 ; i < N+1 ; i+=2) P[i] = 1;
		for (int i = 3 ; i < N+1 ; i++) {
			if (P[i] == 0) {
				for (int j = i+i ; j < N+1 ; j+=i) P[j] = 1;
			}
		}
		int a = 0;
		for (int i = 0 ; i < N+1 ; i++) {
			if (P[i] == 0) a++;
			P[i] = a;
		}

		String line;
		while ((line = br.readLine()) != null) {
			int n = Integer.parseInt(line);
			System.out.println(P[n]);
		}

	}
}
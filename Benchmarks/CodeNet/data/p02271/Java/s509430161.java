import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	int N;

	void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		String[] A = br.readLine().split(" ");
		int S = Integer.parseInt(br.readLine());
		String[] B = br.readLine().split(" ");
		for (int i = 0; i < S; i++) 
			System.out.println(solve(0, Integer.parseInt(B[i]), A) ? "yes" : "no");
	}
	
	boolean solve(int i, int m, String[] A) {
		if (m == 0) return true;
		if (i > N - 1) return false;
		if (solve(i + 1, m, A) || solve(i + 1, m - Integer.parseInt(A[i]), A)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}
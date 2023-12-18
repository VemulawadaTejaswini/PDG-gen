import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// ALDS1_6_B
public class Main {
	int partition(int[] A, int p, int r) {
		int x = A[r];
		int i = p-1;
		for (int j = p; j < r; j++) {
			if (A[j] <= x) {
				i = i + 1;
				int tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
			}
		}
		int tmp = A[i + 1];
		A[i + 1] = A[r];
		A[r] = tmp;
		return i + 1;
	}
	
	void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int A[] = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		int q = partition(A, 0, n-1);
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i != 0) build.append(" ");
			if (q == i) build.append("[" + A[i] + "]");
			else build.append(A[i]);
		}
		System.out.println(build);
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	public void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] A = new int[n+1];
		int[] B = new int[n+1];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		reader.close();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			A[i+1] = Integer.parseInt(st.nextToken());
			max = Math.max(max, A[i+1]);
		}
		
		int[] C = new int[max+1];
		for (int i = 0; i < n; i++) C[A[i+1]]++;
		for (int i = 1; i <= max; i++) C[i] += C[i-1];
		
		for (int i = n; i >= 1; i--) {
			B[C[A[i]]] = A[i];
			C[A[i]]--;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(B[1]);
		for (int i = 2; i <= n; i++) {
			sb.append(" " + B[i]);
		}
		System.out.println(sb.toString());
	}
}

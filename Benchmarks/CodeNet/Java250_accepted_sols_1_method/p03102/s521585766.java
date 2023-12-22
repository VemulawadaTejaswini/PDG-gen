import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(), M = s.nextInt(), C = s.nextInt(), m = 0, n = 0;
		int[] B = new int [M], A = new int [M];
		for (int i = 0; i < M; i++) B[i] = s.nextInt();
		for (int j = 0; j < N; j++){
			m = 0;
			for (int k = 0; k < M; k++){
				A[k] = s.nextInt();
				m += A[k] * B[k];
			}
			if (m + C > 0) n++;
		}
		System.out.println(n);
	}
}

import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[][] = new int[2][N];
		for (int i = 0; i < N; i++) {
			A[0][i] = sc.nextInt();
			if (0 < i) A[0][i] += A[0][i-1];
		}
		for (int i = 0; i < N; i++) {
			A[1][i] = sc.nextInt();
			if (i == 0) A[1][i] += A[0][i];
			else A[1][i] += Math.max(A[0][i], A[1][i-1]);
		}
		System.out.println(A[1][N-1]);
	}
}
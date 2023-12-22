import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int A[] = new int[N];
		int min = 1000000000;
		int max = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if(A[i] < min) min = A[i];
			if(A[i] > max) max = A[i];
		}
		System.out.println(max - min);
	}
}

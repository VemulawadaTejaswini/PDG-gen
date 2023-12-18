import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] A = new Integer[N];
		Arrays.setAll(A, i -> sc.nextInt());
		sc.close();

		Integer[] C = A.clone();
		Arrays.sort(C, Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			if (A[i] == C[0]) {
				System.out.println(C[1]);
			} else {
				System.out.println(C[0]);
			}
		}
	}
}
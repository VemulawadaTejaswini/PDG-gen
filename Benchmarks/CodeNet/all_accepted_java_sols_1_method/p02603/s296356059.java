import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		Arrays.setAll(A, i -> sc.nextInt());
		long m = 1000;
		int l = 300;
		for(int i = 0; i < N; i++) {
			if(A[i] > l) {
				m += (A[i] - l) * (m / l);
				l = A[i];
			}
			else
				l = Math.min(A[i], l);
		}
		System.out.println(Math.max(m, 1000));
	}

}
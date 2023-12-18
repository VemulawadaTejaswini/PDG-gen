import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		Arrays.setAll(A, i -> sc.nextInt());
		for(int i = 0; i < N-K; i++) {
			if(A[i] < A[i+K])
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}

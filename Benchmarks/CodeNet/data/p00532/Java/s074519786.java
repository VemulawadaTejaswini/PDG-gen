import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), Q = sc.nextInt();
		int A[] = new int[Q], B[] = new int[N];
		for(int i = 0; i < Q; i++) A[i] = sc.nextInt();
		for(int i = 0; i < Q; i++) {
			for(int j = 0; j < N; j++) {
				int r = sc.nextInt();
				if(A[i] == r) B[j]++;
				else B[A[i] - 1]++;
			}
		}
		for(int i = 0; i < N; i++) System.out.println(B[i]);
	}
}
import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for (int i=0;i<N;i++) {
			A[i] = Integer.parseInt(sc.next());
			B[i] = A[i];
		}
		Arrays.sort(A);
		int swap = 0;
		for (int i=0;i<N;i++) {
			if (A[i] != B[i]) {
				swap++;
			}
		}
		if (swap<=2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Inputs
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int A[] = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}
		int q = scan.nextInt();
		int m[] = new int[q];
		for (int i = 0; i < q; i++) {
			m[i] = scan.nextInt();
		}
		
		// Calculate & outputs
		for (int i = 0; i < q; i++) {
			if (isSumOf(m[i], A, 0, 0)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

	private static boolean isSumOf(int x, int[] A, int index, int curSum) {
		if (x == curSum) return true;
		if (index == A.length) return false;
		if (isSumOf(x, A, index + 1, curSum + A[index])) return true;
		if (isSumOf(x, A, index + 1, curSum)) return true;
		return false;
	}

}


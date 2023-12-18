import java.util.Scanner;

// ALDS1_4_D
public class Main {	
	int check(int[] A, int k, int p) {
		int sum = 0;
		int n = 0;
		int v = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > p) break;
			if (sum + A[i] <= p) sum += A[i];
			else {
				sum = A[i];
				n++;
			}
			if (n == k) break;
			v++;
		}
		return v;
	}
	
	int binarySearch(int[] A, int k, int n, int min, int max) {
		int mid = (max + min) / 2;
		int v = check(A, k, mid);
		if (v == n && check(A, k, mid-1) == n - 1) return mid;
		if (v > n) return binarySearch(A, k, n, min, mid - 1);
		if (v < n) return binarySearch(A, k, n, mid + 1, max);
		for (int i = min; i < max; i++) {
			if (check(A, k, i) == n) return i;
		}
		return -1;
	}
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int max = 0;
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			max += A[i];
		}
		System.out.println(binarySearch(A, k, n, 0, max));
		sc.close();
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}


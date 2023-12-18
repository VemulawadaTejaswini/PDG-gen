import java.util.Scanner;

public class Main {
	public static int[]A;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}
		scan.close();
		int q = partition(0, n - 1);
		System.out.print(A[0]);
		for(int i = 1; i < n; i++) {
			if(i == q) {
				System.out.print(" [" + A[i] + "]");
			}else {
				System.out.print(" " + A[i]);
			}
		}
		System.out.println();
	}

	public static int partition(int p, int r) {
		int x, i, j, t;
		x = A[r];
		i = p - 1;
		for(j = p; j < r; j++) {
			if(A[j] <= x) {
				i ++;
				t = A[i];
				A[i] = A[j];
				A[j] = t;
			}
		}
		t = A[i + 1];
		A[i + 1] = A[r];
		A[r] = t;
		return i + 1;
	}
}

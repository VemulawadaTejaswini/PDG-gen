import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		int X = partition(A, 0, n);

		StringBuilder str = new StringBuilder();
		str.append(A[0]);
		for (int i = 1; i < X; i++) {
			str.append(" ");
			str.append(A[i]);
		}
		str.append(" [");
		str.append(A[X]);
		str.append("]");
		for (int i = X + 1; i < n; i++) {
			str.append(" ");
			str.append(A[i]);
		}
		System.out.println(str);

	}

	public static int partition(int[] A, int p, int r) {
		int x = A[r - 1];
		int i = p - 1;
		int kari = 0;
		for (int j = p; j < r; j++) {
			if (A[j] <= x) {
				i++;
				kari = A[i];
				A[i] = A[j];
				A[j] = kari;
			}
		}
		return i;
	}

}
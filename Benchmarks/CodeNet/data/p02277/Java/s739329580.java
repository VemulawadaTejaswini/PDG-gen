
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int partition(int[] A, String[] B, int[] C, int p, int r) {
		int x = A[r];
		int i = p - 1;
		int oki = 0;
		String keep;
		for (int j = p; j < r; j++) {
			if (A[j] <= x) {
				i = i + 1;
				oki = A[i];
				A[i] = A[j];
				A[j] = oki;
				keep = B[i];
				B[i] = B[j];
				B[j] = keep;
				oki = C[i];
				C[i] = C[j];
				C[j] = oki;
			}
		}
		oki = A[i + 1];
		A[i + 1] = A[r];
		A[r] = oki;
		keep = B[i + 1];
		B[i + 1] = B[r];
		B[r] = keep;
		oki = C[i + 1];
		C[i + 1] = C[r];
		C[r] = oki;
		return i + 1;

	}

	public static void quicksort(int[] A, String[] B, int[] C, int p, int r) {
		if (p < r) {
			int q = partition(A, B, C, p, r);
			quicksort(A, B, C, p, q - 1);
			quicksort(A, B, C, q + 1, r);
		}

	}

	public static boolean isStable(int[] nums, int[] check, int n) {
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				if (check[i] > check[i + 1]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] cards1 = new String[n];
		int[] check = new int[n];
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			cards1[i] = br.readLine();
			nums[i] = Integer.parseInt(cards1[i].split(" ")[1]);
			check[i] = i;
		}
		quicksort(nums, cards1, check, 0, n - 1);
		if (isStable(nums, check, n)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
		for (int i = 0; i < n; i++) {
			System.out.println(cards1[i]);
		}

	}

}


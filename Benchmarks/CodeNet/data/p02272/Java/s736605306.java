import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static int count = 0;
	private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {

		try {
			// nを入力
			int n = Integer.parseInt(bufferedReader.readLine());

			// mergeSort対象配列
			int[] A = new int[n];

			// mergeSort対象配列の中身を入力
			String[] array = bufferedReader.readLine().split(" ");

			bufferedReader.close();

			// String配列をint配列に変換
			for (int i = 0; i < array.length; i++) {
				A[i] = Integer.parseInt(array[i]);
			}

			int left = 0;
			int right = A.length;

			mergeSort(A, left, right);

			StringBuilder message = new StringBuilder();
			message.append(A[0]);
			for (int i = 1; i < A.length; i++) {
				message.append(" ");
				message.append(A[i]);
			}
			message.append("\n");
			message.append(count);
			System.out.println(message.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}

	private static void mergeSort(int[] a, int left, int right) {

		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(a, left, mid);
			mergeSort(a, mid, right);
			merge(a, left, mid, right);
		}
	}

	/**
	 * マージ処理をします。
	 *
	 * @param a     マージソート対象の配列
	 * @param left  左のindex
	 * @param mid   真ん中のindex
	 * @param right 右のindex
	 */
	private static void merge(int[] a, int left, int mid, int right) {
		// n of left
		int n1 = mid - left;
		// n of right
		int n2 = right - mid;

		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];

		int i;

		for (i = 0; i < n1; i++) {
			L[i] = a[left + i];
		}
		for (i = 0; i < n2; i++) {
			R[i] = a[mid + i];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;

		i = 0;
		int j = 0;
		for (int k = left; k < right; k++) {
			// Aに小さい方を入れる
			count++;
			if (L[i] <= R[j]) {
				a[k] = L[i++];
			} else {
				a[k] = R[j++];
			}
		}
	}
}


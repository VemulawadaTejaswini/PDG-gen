import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String[] strArray = reader.readLine().split(" ");
		int[] a = new int[n];
		int[] c = new int[10000];
		int k = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(strArray[i]);
			k = Math.max(k, a[i]);
			c[a[i]]++;
		}
		int[] b = new int[n];
		countingSort(a, b, c, k);
		System.out.print(b[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" " + b[i]);
		}
		System.out.println("");
	}

	private static void countingSort(int[] a, int[] b, int[] c, int k) {
		for (int i = 1; i <= k; i++) {
			c[i] = c[i] + c[i - 1];
		}
		for (int i = a.length - 1; i >= 0; i--) {
			b[c[a[i]] - 1] = a[i];
			c[a[i]]--;
		}
	}
}


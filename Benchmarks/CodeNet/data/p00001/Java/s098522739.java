import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 10;
		int array[] = new int[N];
		for (int i = 0; i < 10; i++) {
			String line = br.readLine();
			array[i] = Integer.parseInt(line);
			quickSort(0, N - 1, array);
		}
		for (int j = N-1; j > 6; j--) {
			System.out.println(array[j]);
		}
	}

	private static void quickSort(int bottom, int top, int[] data) {
		int lower, upper;
		if (bottom >= top)
			return;
		int div = data[bottom];
		for (lower = bottom, upper = top; lower < upper;) {
			while (lower <= upper && data[lower] <= div)
				lower++;
			while (lower <= upper && data[upper] > div)
				upper--;

			if (lower < upper) {
				int temp = data[lower];
				data[lower] = data[upper];
				data[upper] = temp;
			}
		}

		int temp = data[bottom];
		data[bottom] = data[upper];
		data[upper] = temp;

		quickSort(bottom, upper - 1, data);
		quickSort(upper + 1, top, data);

	}
}
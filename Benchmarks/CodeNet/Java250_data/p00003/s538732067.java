import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		int size = readInt();
		for (int i = 0; i < size; i++) {
			boolean yes = false;
			int[] a = readInts();
			for (int j = 0; j < a.length; j++) {
				a[j] *= a[j];
			}
			for (int j = 0; j < a.length && !yes; j++) {
				yes = (a[j] == (a[(1 + j) % 3] + a[(2 + j) % 3]));
			}
			System.out.println(yes ? "YES" : "NO");
		}

	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));

	private static int[] readInts() throws IOException {
		String readLine = br.readLine();
		if (readLine == null) {
			return null;
		}
		String[] s = readLine.split(" ");
		int[] result = new int[s.length];
		for (int i = 0; i < result.length; i++)
			result[i] = Integer.parseInt(s[i], 10);

		return result;
	}

	private static int readInt() throws IOException {
		return Integer.parseInt(br.readLine(), 10);
	}
}
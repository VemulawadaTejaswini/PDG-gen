import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		boolean[] indexes = indexesOfPrime(50001);
		int[] values = valuesOfPrime(indexes);

		while (!(line = br.readLine()).equals("0")) {

			int n = Integer.parseInt(line);
			int c = 0;

			for (int v : values) {
				if (v * 2 > n) {
					break;
				}
				if (indexes[v] && indexes[n - v]) {
					c++;
				}
			}
			System.out.println(c);
		}

	}

	static boolean[] indexesOfPrime(int max) {

		boolean[] indexes = new boolean[max + 1];
		Arrays.fill(indexes, true);

		for (int i = 2; i < max + 1; i++) {
			if (indexes[i]) {
				for (int j = 2; j <= max / i; j++) {
					indexes[i * j] = false;
				}
			}
		}

		return indexes;

	}

	static int[] valuesOfPrime(boolean[] indexes) {

		int count = 0;
		for (int i = 2; i < indexes.length; i++) {
			if (indexes[i]) {
				count++;
			}
		}

		int[] values = new int[count];
		int j = 0;
		for (int i = 2; i < indexes.length; i++) {
			if (indexes[i]) {
				values[j] = i;
				j++;
			}
		}

		return values;

	}

}
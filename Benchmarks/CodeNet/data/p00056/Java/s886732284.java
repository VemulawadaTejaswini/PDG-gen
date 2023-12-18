import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static Main main = new Main();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		Prime prime = main.new Prime(50000);

		while (!(line = br.readLine()).equals("0")) {

			int n = Integer.parseInt(line);
			int c = 0;

			for (int v : prime.values) {
				if (v * 2 > n) {
					break;
				}
				if (prime.indexes[v] && prime.indexes[n - v]) {
					c++;
				}
			}
			System.out.println(c);
		}

	}

	class Prime {

		int max;
		int count = 0;
		boolean[] indexes;
		int[] values;

		Prime(int max) {
			this.max = max;
			setIndexes();
			setValues();
		}

		void setIndexes() {

			indexes = new boolean[max + 1];
			Arrays.fill(indexes, true);

			for (int i = 2; i < max + 1; i++) {
				if (indexes[i]) {
					count++;
					for (int j = 2; j <= max / i; j++) {
						indexes[i * j] = false;
					}
				}
			}

		}

		void setValues() {

			values = new int[count];
			int j = 0;
			for (int i = 2; i < max + 1; i++) {
				if (indexes[i]) {
					values[j] = i;
					j++;
				}
			}

		}

	}

}
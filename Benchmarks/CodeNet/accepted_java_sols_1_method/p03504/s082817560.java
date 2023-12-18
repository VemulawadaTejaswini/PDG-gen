import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] array = br.readLine().split(" ");
			int N = Integer.parseInt(array[0]);
			int C = Integer.parseInt(array[1]);

			int[] channels = new int[N];
			int[] starts = new int[N];
			int[] ends = new int[N];
			for (int i = 0; i < N; i++) {
				String[] tmp = br.readLine().split(" ");

				starts[i] = Integer.parseInt(tmp[0]);
				ends[i] = Integer.parseInt(tmp[1]);
				channels[i] = Integer.parseInt(tmp[2]);
			}
			final int[] table = new int[2 * 100_001];
			final boolean[] tmp = new boolean[2 * 100_001];
			boolean updated = false;
			for (int channel = 1; channel <= C; channel++) {
				if (updated) {
					for (int i = 0; i < tmp.length; i++) {
						tmp[i] = false;
					}
					updated = false;
				}

				for (int index = 0; index < N; index++) {
					if (channels[index] == channel) {
						for (int i = starts[index] * 2 - 1; i <= ends[index] * 2; i++) {
							tmp[i] = true;
						}
						updated = true;
					}
				}

				for (int i = 0; i < table.length; i++) {
					if (tmp[i]) {
						table[i]++;
					}
				}
			}

			System.out.println(Arrays.stream(table).max().getAsInt());
		}
	}
}

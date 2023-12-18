import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	void run() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] number = new int[N];
		for (int i = 0; i < N; i++) {
			number[i] = Integer.parseInt(br.readLine());
		}

		int result = number[1] - number[0];
		for (int i = 0; i < N - 1; i++) {
			int x = number[i];
			for (int j = i + 1; j < N; j++) {
				int y = number[j] - x;
				if (result < y) {
					result = y;
				}
			}
		}
		System.out.print(result);
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			int[] height = new int[10];

			for (int i = 0; i < 10; i++) {

				height[i] = Integer.parseInt(br.readLine());

			}

			Arrays.sort(height);

			for (int j = 9; j > 6; j--) {
				System.out.println(height[j]);
			}

		} finally {
			br.close();
		}

	}
}
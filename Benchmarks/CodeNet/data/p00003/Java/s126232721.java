import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int dataSet = Integer.parseInt(br.readLine());
		if (dataSet > 1000) return;

		for (int i = 0; i < dataSet; i++) {
			String[] input = br.readLine().split(" ");
			if (input == null || "".equals(input)) return;
			Arrays.sort(input);

			System.out.println(
					((Integer.parseInt(input[0])^2 + Integer.parseInt(input[1])^2) == (Integer.parseInt(input[2])^2))
					? "Yes"
					: "No"
			);
		}
	}
}
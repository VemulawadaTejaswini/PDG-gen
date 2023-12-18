import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int dataSet = Integer.parseInt(br.readLine());
		if (dataSet > 1000) return;
		for (int i = 0; i < dataSet; i++) {
			String[] input = br.readLine().split(" ");
			Arrays.sort(input);

			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			System.out.println(((a^2 + b^2) == (c^2)) ? "Yes" : "No");
		}
	}
}
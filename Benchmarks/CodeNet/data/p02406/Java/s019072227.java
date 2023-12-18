import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int inputData = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < inputData; i++) {
			if (i % 3 == 0) {
				sb.append(i + " ");
			} else if (i % 10 == 3) {
				sb.append(i + " ");
			}
		}
		if (inputData % 3 == 0 || inputData % 10 == 3) {
			sb.append(inputData);
		}
		System.out.println(sb.toString());
	}
}
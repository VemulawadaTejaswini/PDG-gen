import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		long max = Integer.MIN_VALUE;
		long min = Integer.MAX_VALUE;
		long sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] inputArray = br.readLine().split(" ");

		long input = 0;
		for (int i=0; i<N; i++) {
			input = Long.parseLong(inputArray[i]);
			if (max < input) {
				max = input;
			}

			if (min > input) {
				min = input;
			}

			sum += input;
		}

		System.out.println(min +" "+ max +" "+ sum);
	}
}
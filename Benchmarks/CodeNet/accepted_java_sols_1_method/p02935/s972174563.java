

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] tmpArray = br.readLine().split(" ");

		double[] input = new double[n];
		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
		}

		Arrays.sort(input);

		for(int i = 1; i < n; i++){
			input[i] = (input[i] + input[i - 1])/2;
		}

		System.out.printf("%.6f\n", input[n - 1]);
	}

}

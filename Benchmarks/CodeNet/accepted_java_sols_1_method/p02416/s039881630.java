

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			// input
			char[] firstInput = br.readLine().toCharArray(); // ex : 123
			int[] num = new int[firstInput.length];// base
			char seconInput = 0;
			for (int i = 0; i < firstInput.length; i++) {
				seconInput = firstInput[i];// split
				num[i] = Character.getNumericValue(seconInput);// input info
			}
			// constraints
			if (num[0] == 0 && seconInput == '0' )break;

			// plus works & output
			int sum = 0;
			for (int i = 0; i < num.length; i++) {

				sum += num[i];
			}
			System.out.println(sum);
		} while (true);
	}
}
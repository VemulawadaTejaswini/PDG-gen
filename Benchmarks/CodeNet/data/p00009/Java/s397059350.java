import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	/**
	 * AOJ 0009 Prime Number
	 */
	public static void main(String[] args) throws IOException {

		ArrayList<Integer> inputList = getInputs();
		boolean isPrime = true;
		int result = 0;

		for (int input : inputList) {

			for (int i = 2; i <= input; i++) {
				isPrime = true;
				for (int j = 2; j <= i; j++) {
					if (isPrime && i != j) {
						if (i % j == 0) {
							isPrime = false;
						}
					} else {
						break;
					}
				}
				if (isPrime) {
					result++;
				} else {
					break;
				}
			}
			System.out.println(result);
			result = 0;
		}
	}

	public static ArrayList<Integer> getInputs() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		try {
			String input = null;
			while ((input = bufferedReader.readLine()) != null) {
				list.add(Integer.parseInt(input));
			}
		} finally {
			bufferedReader.close();
		}
		return list;
	}
}
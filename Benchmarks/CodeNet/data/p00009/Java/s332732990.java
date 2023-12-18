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
		int result = 1;

		for (int input : inputList) {

			for (int i = 3; i <= input; i += 2) {
				isPrime = true;
				for (int j = 3; j <= i; j += 2) {
					if (i != j && i % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					result++;
				}
			}
			System.out.println(result);
			result = 1;
		}
	}

	public static ArrayList<Integer> getInputs() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		try {
			String input = null;
			while ((input = bufferedReader.readLine())!=null) {
				list.add(Integer.parseInt(input));
			}
		} finally {
			bufferedReader.close();
		}
		return list;
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	/** 4????????´??°??§??¨???????????§??? */
	private static int MAX = 36;

	/**
	 * AOJ 0008 Sum of 4 Integers
	 */
	public static void main(String[] args) throws IOException {

		ArrayList<Integer> sumList = getInputs();

		for (int sum : sumList) {

			if (sum > MAX) {
				System.out.println(0);
			} else {
				System.out.println(getSumOf4(sum));
			}
		}
	}

	public static int getSumOf4(int sum) {
		int[] total = new int[37];
		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					for (int d = 0; d <= 9; d++) {
						total[a + b + c + d]++;
					}
				}
			}
		}
		return total[sum];
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
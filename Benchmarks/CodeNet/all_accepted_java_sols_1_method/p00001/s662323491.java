import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	/*
	 * 10????????´??°??????best3?????????
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] heightArray = new int[10];

		for (int i = 0; i < 10; i++) {
			heightArray[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(heightArray);

		for (int i = 9; i >= 7; i--) {
			System.out.println(heightArray[i]);
		}

	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args)
			throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		ArrayList<Integer> list = new ArrayList<>();

		String input = br.readLine();
		while (!("EOF".equals(input))) {

			int[] inInt = new int[2];
			String[] str = input.split(" ");
			for (int i = 0; i < 2; i++) {
				inInt[i] = Integer.parseInt(
						str[i]);
			}
			int sum = 0;
			for (int i = 0; i < 2; i++) {
				sum += inInt[i];
			}

			list.add(String.valueOf(sum)
					.length());
			input = br.readLine();
		}

		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
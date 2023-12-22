import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int sum = 0;

		while (!(str.equals("0"))) {

			sum =0;

			for (int i = 0; i < str.length(); i++) {
				sum += Integer.parseInt(String.valueOf(str.charAt(i)));
			}
			System.out.println(sum);

			str = br.readLine();
		}

	}
}
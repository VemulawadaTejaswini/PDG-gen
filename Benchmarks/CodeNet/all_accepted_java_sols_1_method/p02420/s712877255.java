import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		String str2 = "";

		String num = "";

		int num2;

		StringBuilder builder = new StringBuilder();

		while (!(str.equals("-"))) {

			num = br.readLine();


			for (int i = 0; i < Integer.parseInt(num); i++) {

				num2 = Integer.parseInt(br.readLine());

				builder.append(str.substring(num2, str.length()));
				builder.append(str.substring(0, num2));

				str = builder.toString();
				builder.setLength(0);
			}
			str2 += str + "\n";
			str = br.readLine();

		}

		System.out.print(str2);
	}

}
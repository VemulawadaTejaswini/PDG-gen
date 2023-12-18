import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		String num = br.readLine();

		for (int i = 0; i < Integer.parseInt(num); i++) {

			String[] oders = br.readLine().split(" ");

			switch (oders[0]) {
			case "replace":
				/* System.out.println(oders[0]); */
				str = replace(oders[1], oders[2], str, oders[3]);
				break;
			case "reverse":
				/* System.out.println(oders[0]); */
				str =reverse(oders[1], oders[2], str);
				break;

			case "print":
				/* System.out.println(oders[0]); */
				print(oders[1], oders[2], str);
				break;

			default:
				break;
			}
		}

	}

	public static String replace(String num1, String num2, String word, String replacestr) {
		StringBuilder builer = new StringBuilder();

		builer.append(word.substring(0, Integer.parseInt(num1)));
		builer.append(replacestr);
		builer.append(word.substring(Integer.parseInt(num2) + 1, word.length()));

		/* System.out.println(builer.toString());*/

		return builer.toString();
	}

	public static String reverse(String num1, String num2, String word) {
		StringBuilder builer = new StringBuilder();

		builer.append(word.substring(0, Integer.parseInt(num1)));
		for (int i = Integer.parseInt(num2); i >= Integer.parseInt(num1); i--) {
			builer.append(word.charAt(i));
		}
		builer.append(word.substring(Integer.parseInt(num2) + 1, word.length()));

	/*	 System.out.println(builer.toString());*/

		return builer.toString();
	}
	public static void print(String num1, String num2, String word) {
		StringBuilder builer = new StringBuilder();

		for (int i = Integer.parseInt(num1); i <= Integer.parseInt(num2); i++) {
			builer.append(word.charAt(i));
		}

		 System.out.println(builer.toString());


	}

}
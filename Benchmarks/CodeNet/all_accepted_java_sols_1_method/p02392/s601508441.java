import java.util.Scanner;

class Main {

	private static final String SPLIT_STR = " ";
	private static final String OPERATOR_EQUAL = "==";
	private static final String OUTPUT_TRUE = "Yes";
	private static final String OUTPUT_FALSE = "No";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x = sc.nextLine();

		sc.close();

		String[] split = x.split(SPLIT_STR);
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		int c = Integer.parseInt(split[2]);

		String result = OUTPUT_FALSE;

		if (a < b && b < c) {
			result = OUTPUT_TRUE;
		}

		System.out.println(result);
	}
}


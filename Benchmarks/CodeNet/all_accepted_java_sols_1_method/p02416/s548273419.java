import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String x = sc.next();
			int sum = 0;
			char[] str1 = x.toCharArray();
			for (int i = 0; i < str1.length; i++) {
				sum += Character.getNumericValue(str1[i]);
			}

			if (x.equals("0")) {
				break;
			}
			System.out.println(sum);
		}

	}

}
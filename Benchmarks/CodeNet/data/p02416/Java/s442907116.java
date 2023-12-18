import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine();
			if (str.equals("0")) break;
			int sum = 0;
			for (int i = 0; i < str.length(); ++i) {
				sum += Character.getNumericValue(str.charAt(i));
			}
			System.out.println(sum);
		}
	}
}

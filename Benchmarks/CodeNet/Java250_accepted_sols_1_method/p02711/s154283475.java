import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();

		String str = String.valueOf(number);
		String result = "No";
		for(char ch : str.toCharArray()) {
			if ('7' == ch) {
				result = "Yes";
				break;
			}
		}

		System.out.print(result);
	}

}

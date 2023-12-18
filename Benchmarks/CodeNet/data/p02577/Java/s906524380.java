import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();

		int sum = 0;
		for (int i = 0; i < n.length(); i++) {
			sum = sum + Character.getNumericValue(n.charAt(i));
		}
		printBool(sum % 9 == 0);
	}

	public static void printBool(boolean bool) {
		print(bool ? "Yes" : "No");
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}

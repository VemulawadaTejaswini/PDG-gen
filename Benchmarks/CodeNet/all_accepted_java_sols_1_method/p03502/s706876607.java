import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str = reader.next();
		int hashad = 0;
		int base = Integer.parseInt(str);
		for (int i = 0; i < str.length(); i++) {
			hashad += Character.getNumericValue(str.charAt(i));
		}
		String ans = "Yes";
		if ( base % hashad != 0) {
			ans = "No";
		}

		System.out.println(ans);
		reader.close();

	}
}
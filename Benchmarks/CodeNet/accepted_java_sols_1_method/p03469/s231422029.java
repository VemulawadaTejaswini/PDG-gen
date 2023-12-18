
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String newStr = "2018";
		newStr += str.substring(4, str.length());

		System.out.println(newStr);

	}

}

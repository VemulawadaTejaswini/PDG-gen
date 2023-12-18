import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		String str = sc.next();

		if(str.length() == 3) {
			StringBuffer reverseStr = new StringBuffer(str);
	         str = reverseStr.reverse().toString();
		}

		System.out.println(str);

	}
}
import java.io.IOException;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if(s.equals("AAA") || s.equals("BBB")) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}

	}

}

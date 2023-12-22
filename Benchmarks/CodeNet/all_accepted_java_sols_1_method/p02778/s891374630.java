import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			for(char c : s.toCharArray()) {
				System.out.print('x');
			}
		}

	}

}

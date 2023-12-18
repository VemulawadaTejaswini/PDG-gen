import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		int con = 0;

		for (int i = 0; i < line.length(); i++) {
			con +=Character.getNumericValue(line.charAt(i));

		}

		if (con %9==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}

}
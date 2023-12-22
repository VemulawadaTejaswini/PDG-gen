import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			if (input.charAt(0) == input.charAt(1) && input.charAt(0) == input.charAt(2)) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}


		s.close();

	}

}

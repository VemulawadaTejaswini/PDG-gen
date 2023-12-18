import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		
		String res = "No";
		if(input.charAt(2) == input.charAt(3) && input.charAt(4) == input.charAt(5)) {
			res = "Yes";
		}
		
		System.out.println(res);
	}
}

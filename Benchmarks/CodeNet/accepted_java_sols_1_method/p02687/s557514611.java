import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.nextLine();
		if(S.equals("ABC")) {
			System.out.println("ARC");
		}else if(S.equals("ARC")) {
			System.out.println("ABC");
		}
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String firstPart = s.substring(0, 4);
		String secondPart = s.substring(4, 12);
		System.out.println(firstPart + " " + secondPart);
		scan.close();
	}

}

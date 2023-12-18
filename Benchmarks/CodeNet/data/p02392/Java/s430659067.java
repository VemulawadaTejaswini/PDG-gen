import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
		
		 System.out.println((a<b&&b<c) ? "Yes" : "No");
	}

}
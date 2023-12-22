import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c11 = scan.next().charAt(0);
		char c22 = scan.next().charAt(1);
		char c33 = scan.next().charAt(2);
		scan.close();
		System.out.println(c11+""+c22+""+c33);
	}
}

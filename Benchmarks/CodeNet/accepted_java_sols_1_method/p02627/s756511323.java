import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		Character character = sc.next().charAt(0);
		if (character >= 'a' && character <= 'z') {
			System.out.println("a");
		}else {
			System.out.println("A");
		}
	}
}

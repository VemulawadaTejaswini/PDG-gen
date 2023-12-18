
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a =scanner.nextLine();
		String b = a+a;
		String c = scanner.nextLine();
		if(b.contains(c))
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
}
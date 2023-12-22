
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		if(str.charAt(0)=='7' || str.charAt(1)=='7' || str.charAt(2)=='7') {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		scan.close();
	}
}

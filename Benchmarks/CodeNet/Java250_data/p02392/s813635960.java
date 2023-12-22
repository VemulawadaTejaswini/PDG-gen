
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		String str = a < b && b < c ? "Yes" : "No";
		
		System.out.println(str);
		
		scan.close();

	}

}
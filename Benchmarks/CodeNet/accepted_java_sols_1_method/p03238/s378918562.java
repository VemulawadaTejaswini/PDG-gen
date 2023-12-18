import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String n = scan.nextLine();
		
		if("1".equals(n)) {
			System.out.println("Hello World");
		} else {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);
		}
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		String b = stdIn.next();
		int c = stdIn.nextInt();
		
		if (b.charAt(0) == '+') {
			System.out.println(a + c);
		} else {
			System.out.println(a - c);
		}
	}
}
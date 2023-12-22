import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		
		if (a - b > 0) {
			if (c - d > 0) {
				System.out.println(b + d);
			} else {
				System.out.println(b + c);
			}
		} else {
			if (c - d > 0) {
				System.out.println(a + d);
			} else {
				System.out.println(a + c);
			}
		}
	}
}
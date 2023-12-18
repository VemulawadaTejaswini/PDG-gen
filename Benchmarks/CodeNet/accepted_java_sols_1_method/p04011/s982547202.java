import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		
		int e = (b * c) + (a - b) * d;
		int f = (a * c);
		
		if (a > b) {
			System.out.println(e);
		} else {
			System.out.println(f);
		}
	}
}
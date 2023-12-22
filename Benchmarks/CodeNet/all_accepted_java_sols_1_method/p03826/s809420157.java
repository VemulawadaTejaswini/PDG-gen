import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		
		int e = a * b;
		int f = c * d;
		
		if (e <= f) {
			System.out.println(f);
		} else {
			System.out.println(e);
		}
	}
}
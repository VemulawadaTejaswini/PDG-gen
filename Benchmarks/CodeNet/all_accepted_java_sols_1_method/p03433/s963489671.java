import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		int c = a / 500;
		int d = c * 500;
		
		int e = a - d;
		
		if (e > b) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
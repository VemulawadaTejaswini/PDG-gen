import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		System.out.println((int) (a + Math.pow(a, 2) + Math.pow(a, 3)));
	}
}

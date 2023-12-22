import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int X = stdIn.nextInt();
		int T = stdIn.nextInt();
		System.out.println((N / X + Math.min(1, N % X)) * T);
	}
}
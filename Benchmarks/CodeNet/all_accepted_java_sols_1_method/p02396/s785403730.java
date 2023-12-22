import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int i = stdIn.nextInt();
		for (int n = 1; i != 0; n++) {
			System.out.println("Case " + n + ": " + i);
			i = stdIn.nextInt();
		}
	}
}
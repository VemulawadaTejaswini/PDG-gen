import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int X = stdIn.nextInt();
		if(30 <= X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
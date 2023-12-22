import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int i = stdIn.nextInt();
		if(i == 0) {
			System.out.println(1);
		}else if(i == 1) {
			System.out.println(0);
		}
	}
}
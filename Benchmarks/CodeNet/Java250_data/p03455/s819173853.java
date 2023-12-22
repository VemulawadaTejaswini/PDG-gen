import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int a = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[1]);
		if (a % 2 == 1 && b % 2 == 1) {
			System.out.println("Odd");
		} else {
			System.out.println("Even");
		}
		in.close();
	}

}
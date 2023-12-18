import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int n = Integer.parseInt(tokens[0]);
		int k = Integer.parseInt(tokens[1]);
		if (n % k == 0) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}

		in.close();
	}

}
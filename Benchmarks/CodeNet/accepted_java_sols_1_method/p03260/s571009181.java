import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);
		boolean exist = false;
		for (int C = 1; C <= 3; ++C) {
			if (A * B * C % 2 != 0) {
				exist = true;
				break;
			}
		}
		if (exist) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		in.close();

	}

}
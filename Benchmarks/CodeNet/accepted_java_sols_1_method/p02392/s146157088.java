import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		String[] n = line.split(" ");
		int a = Integer.parseInt(n[0]);
		int b = Integer.parseInt(n[1]);
		int c = Integer.parseInt(n[2]);

		if (a < b && b < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}


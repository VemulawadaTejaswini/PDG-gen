import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt(), y = scn.nextInt();
		if (2 * x <= y && 4 * x >= y && y % 2 == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

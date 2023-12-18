import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.nextLine());

		String s = (X == 3 || X == 5 || X == 7) ? "YES" : "NO";
		System.out.println(s);
	}
}
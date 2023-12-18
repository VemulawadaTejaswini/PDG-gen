import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int p = Math.min(sc.nextInt(), Math.min(sc.nextInt(), sc.nextInt()));
		int d = Math.min(sc.nextInt(), sc.nextInt());
		System.out.println(p + d - 50);
	}
}
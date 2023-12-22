import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = Integer.parseInt(sc.next());
		double b = Integer.parseInt(sc.next());

		System.out.println((int)Math.ceil((b+a)/2));
	}
}
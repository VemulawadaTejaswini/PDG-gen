import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double h = scan.nextInt();
		double a = scan.nextInt();
		int count = (int) Math.ceil(h/ a);
		System.out.println(count);
	}
}
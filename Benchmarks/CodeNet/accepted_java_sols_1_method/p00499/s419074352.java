import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int days = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = (int) Math.ceil(a / in.nextDouble());
		int d = (int) Math.ceil(b / in.nextDouble());
		System.out.println(days - Math.max(c, d));
	}
}
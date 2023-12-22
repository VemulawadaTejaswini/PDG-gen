import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int x = a/b;
		int y = a%b;
		double z = 1.0 * a/b;

		String space = " ";

		System.out.println(x + space + y + space + String.format("%.8f", z));

		sc.close();
	}
}

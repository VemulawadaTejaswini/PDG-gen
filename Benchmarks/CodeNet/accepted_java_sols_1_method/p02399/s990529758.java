import static java.lang.System.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = (double)a / (double)b;
		out.println(a / b + " " + a % b + " " + String.format("%.5f",c));
	}
}

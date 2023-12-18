import java.util.Scanner;
public class Digit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String sum = String.valueOf(a+b);
		System.out.println(sum.length());
	}
}
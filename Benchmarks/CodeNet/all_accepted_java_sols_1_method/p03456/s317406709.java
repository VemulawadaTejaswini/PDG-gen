import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int n = Integer.parseInt(a + "" + b);
		double d = Math.sqrt(n);
		int i = (int)d;
		String message = "No";
		if(i == d) {
			message = "Yes";
		}
		System.out.println(message);
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b;
		String sum;
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String num[] = scan.nextLine().split(" ", 0);
			a = Integer.parseInt(num[0]);
			b = Integer.parseInt(num[1]);
			sum = String.valueOf(a+b);
			System.out.println(sum.length());
		}
	}
}
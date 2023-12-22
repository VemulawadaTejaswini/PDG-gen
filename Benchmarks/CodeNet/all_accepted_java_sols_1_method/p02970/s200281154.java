import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();

		int dd = n / (2 * d + 1);
		if(n % (2 * d + 1) != 0)
			dd++;

		System.out.println(dd);
	}
}

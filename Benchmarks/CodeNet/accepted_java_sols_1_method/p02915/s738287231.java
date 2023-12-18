import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		sc.close();

		System.out.println((int)Math.pow(n, 3));
	}
}

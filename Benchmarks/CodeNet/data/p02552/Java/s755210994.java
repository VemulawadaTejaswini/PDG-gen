import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var x = sc.nextInt();
		sc.close();

		System.out.println(x == 0 ? 1 : 0);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var a = sc.nextInt();
		sc.close();

		var result = a + a * a + a * a * a;
		System.out.println(result);
	}
}

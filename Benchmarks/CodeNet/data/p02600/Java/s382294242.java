import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var x = sc.nextInt();
		sc.close();

		var result = 8 - (x - 400) / 200;
		System.out.println(result);
	}
}

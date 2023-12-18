import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var d = sc.nextInt();
		var t = sc.nextInt();
		var s = sc.nextInt();
		sc.close();

		System.out.println(s * t >= d ? "Yes" : "No");
	}
}

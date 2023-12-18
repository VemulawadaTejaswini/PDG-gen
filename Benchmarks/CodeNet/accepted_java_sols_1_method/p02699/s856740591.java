import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var s = sc.nextInt();
		var w = sc.nextInt();
		sc.close();

		System.out.println(w >= s ? "unsafe" : "safe");
	}
}
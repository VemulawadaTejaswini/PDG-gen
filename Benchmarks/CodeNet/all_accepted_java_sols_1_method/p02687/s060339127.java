import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var s = sc.next();
		sc.close();

		System.out.println(s.equals("ABC") ? "ARC" : "ABC");
	}
}
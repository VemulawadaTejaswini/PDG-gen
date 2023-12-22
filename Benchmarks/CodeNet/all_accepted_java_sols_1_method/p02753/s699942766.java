import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next().replace("A", "");

		System.out.println(s.length() == 0 || s.length() == 3 ? "No" : "Yes");
	}
}
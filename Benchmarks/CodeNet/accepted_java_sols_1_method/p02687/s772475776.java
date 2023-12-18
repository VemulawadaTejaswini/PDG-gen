import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String next = s.equals("ABC") ? "ARC" : "ABC";
		System.out.println(next);
	}
}

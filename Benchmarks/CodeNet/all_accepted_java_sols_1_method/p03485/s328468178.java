import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int x = (a + b) / 2;
		System.out.println((x * 2 == a + b)? x : x + 1);
	}
}
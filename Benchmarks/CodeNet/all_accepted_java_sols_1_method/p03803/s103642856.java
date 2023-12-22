import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		if (a == 1) a = 14;
		int b = Integer.parseInt(sc.next());
		if (b == 1) b = 14;
		System.out.println((a > b)? "Alice" : (a < b)? "Bob" : "Draw");
	}
}
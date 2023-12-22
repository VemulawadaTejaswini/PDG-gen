import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = a - b;
		if (d >= c) {
			System.out.println(0);
		}
		else {
			System.out.println(c - d);
		}
	}
}

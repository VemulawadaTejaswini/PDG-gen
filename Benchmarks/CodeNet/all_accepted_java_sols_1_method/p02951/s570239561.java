import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int cap = a - b;
		if (cap > c) {
			System.out.println(0);
		} else {
			System.out.println(c - cap);
		}
		sc.close();
	}
}
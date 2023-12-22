import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(w * (double) h / 2);
		boolean bool = w == x * 2 && h == y * 2;
		System.out.println(bool ? 1 : 0);
	}
}

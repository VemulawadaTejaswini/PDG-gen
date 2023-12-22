import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = Integer.parseInt(sc.next());
		int g = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		System.out.println((10*g+b)%4==0 ? "YES" : "NO");
	}
}
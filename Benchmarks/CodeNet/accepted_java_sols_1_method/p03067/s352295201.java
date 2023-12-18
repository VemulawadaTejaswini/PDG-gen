import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int aa = a;
		int bb = b;
		if (a > b) {
			aa = b;
			bb = a;
		}
		if (aa < c && c < bb) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

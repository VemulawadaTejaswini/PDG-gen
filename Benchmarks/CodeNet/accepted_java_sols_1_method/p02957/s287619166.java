import java.util.Scanner;

public class Main {
	static boolean memo[];
	static boolean ok;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((a + b) % 2 == 0) {
			System.out.println((a + b) / 2);
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}
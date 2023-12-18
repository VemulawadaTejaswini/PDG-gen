import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = 1;
		int x;
		while ((x = sc.nextInt()) != 0) {
			System.out.println("Case " + idx + ": " + x);
			++idx;
		}
	}
}

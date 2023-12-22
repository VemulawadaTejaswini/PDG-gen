import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = Math.max(a, b);
		int min = Math.min(a, b);

		if (max >= min && max <= min + w) {
			System.out.println("0");
		} else {
			System.out.println(max - (min + w));
		}
	}
}
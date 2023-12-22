import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt() - sc.nextInt();
		int i = sc.nextInt();

		System.out.println(r < i ? i - r : 0);
	}
}
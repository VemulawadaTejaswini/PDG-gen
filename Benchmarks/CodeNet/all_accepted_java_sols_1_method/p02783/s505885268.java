import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int a = sc.nextInt();

		int i;
		for (i = 0; h > 0; i++) {
			h -= a;
		}
		System.out.println(i);
	}
}
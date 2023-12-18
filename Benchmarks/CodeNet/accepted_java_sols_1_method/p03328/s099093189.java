import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int diff = b - a;

		int height = 0;
		for (int i = 1; i <  diff; i++) {
			height = height + i;
		}
		System.out.println(height - a);

	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int max = a;
			int min = a;

			max = Math.max(max, b);
			max = Math.max(max, c);

			min = Math.min(min, b);
			min = Math.min(min, c);

			System.out.printf("%d %d\n", min, max);
		sc.close();
	}
}

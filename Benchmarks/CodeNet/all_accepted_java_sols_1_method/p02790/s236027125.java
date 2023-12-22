import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int min = Math.min(a, b);
		int max = Math.max(a, b);
		for (int i = 0; i < max; i++) {
			System.out.print(min);
		}
		System.out.println();
	}
}

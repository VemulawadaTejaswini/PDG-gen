import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int total = a + b + c;
		int max = Math.max(a, Math.max(b,c));

		System.out.println(total - max + max * 10);

	}
}
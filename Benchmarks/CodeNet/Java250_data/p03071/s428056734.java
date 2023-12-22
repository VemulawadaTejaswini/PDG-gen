import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		count += Math.max(a, b);
		count += Math.max(Math.max(a, b) - 1, Math.min(a, b));
		System.out.println(count);
		sc.close();
	}
}

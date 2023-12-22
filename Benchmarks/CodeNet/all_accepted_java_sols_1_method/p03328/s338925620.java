import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int d = b - a;
		int r = d * (d + 1) / 2;
		System.out.println(r - b);
	}
}

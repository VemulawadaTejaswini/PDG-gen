import java.util.Scanner;

public class Main {

	// 107-A
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = sc.nextInt();

		System.out.println(n - i + 1);

		sc.close();
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(n == 3 || n == 5 || n == 7 ? "YES" : "NO");
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 0;
		B += A * 3;
		ans = B / 2;

		System.out.println(ans);
		sc.close();
	}
}

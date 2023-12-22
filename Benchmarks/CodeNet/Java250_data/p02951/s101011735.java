import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int difference = A - B;
		int remaining = C - difference;
		System.out.println(remaining < 0 ? 0 : remaining);
		sc.close();
	}
}
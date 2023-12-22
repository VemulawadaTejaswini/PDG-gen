import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int result = C-(A-B) >=0 ? C-(A-B) : 0;

		System.out.println(result);
		sc.close();
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int A = a;
		int B = b;
		for (int i = 1; i < b; i++) {
			A = A*10+a;
		}
		for (int i = 1; i < a; i++) {
			B = B*10+b;
		}
		System.out.println(A>B?A:B);
		sc.close();
	}
}
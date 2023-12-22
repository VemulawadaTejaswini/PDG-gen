import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A==B) {
			System.out.println(A+B);
		} else if (A>B) {
			System.out.println(A*2-1);
		} else {
			System.out.println(B*2-1);
		}
	}
}
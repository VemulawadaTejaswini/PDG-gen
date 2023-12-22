import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int c = 0;
		if(A > B) { c = A; A--; }
		else { c = B; B--; }
		System.out.println(c + Math.max(A, B));
	}
}
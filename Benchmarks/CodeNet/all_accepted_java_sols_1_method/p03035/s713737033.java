import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		if(A >= 13) System.out.println(B);
		else if(A >= 6 && A <= 12) System.out.println(B/2);
		else System.out.println(0);
	}
}
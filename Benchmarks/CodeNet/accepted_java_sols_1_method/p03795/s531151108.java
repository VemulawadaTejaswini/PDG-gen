import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int ans = 0;

		ans = (800*N) - ((N/15)*200);
		System.out.println( ans );
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int A = Integer.parseInt(sc.next());
		final int B = Integer.parseInt(sc.next());
		int ans = A + B;
		if(A * B > ans) {
			ans = A * B;

		}
		if(A - B > ans) {
			ans = A - B;
		}
		System.out.println(ans);
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		String ans = "";

		if ( (B-A) <= 0 ) {
			ans = "delicious";
		} else if (Math.abs(B-A) <= X) {
			ans = "safe";
		} else {
			ans = "dangerous";
		}
		System.out.println(ans);
	}
}
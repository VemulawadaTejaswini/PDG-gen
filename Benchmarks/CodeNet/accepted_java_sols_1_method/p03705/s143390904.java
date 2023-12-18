import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		if ((N == 1 && B != A) || A > B) {
			System.out.println(0);
		} else {
			long min = B - A;
			long max = min * (N - 1);
			System.out.println(max - min + 1l);
		}
		in.close();
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		long ans = ((N - M) * 100 + M * 1900) * (long) Math.pow(2, M);
		System.out.println(ans);
		in.close();
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		long d = in.nextInt();
		long ans;

		ans = (long) Math.ceil((double)n / (d*2+1));



		System.out.println(ans);
	}
}

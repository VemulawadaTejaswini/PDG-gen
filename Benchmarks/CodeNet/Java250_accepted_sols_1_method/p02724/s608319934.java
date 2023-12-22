import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long X = stdIn.nextLong();
		long ans1 = 0;
		long ans2 = 0;
		long ans = 0;
		ans1 = X / 500;
		ans2 = (X % 500) / 5;

		ans = (ans1 * 1000) + (ans2 * 5);

		System.out.println(ans);
		stdIn.close();
	}
}
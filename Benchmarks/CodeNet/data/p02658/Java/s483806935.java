import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long max = 1000000000000000000L;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String eatEmpty = sc.nextLine();
		String input = sc.nextLine();
		String tempInput = " " + input + " ";
		if (tempInput.contains(" 0 "))
			System.out.println(0);
		else {
			String nums[] = input.split(" ");
			double logAns = 1, ans = 1;
			while (--N >= 0) {
				long temp = Long.parseLong(nums[N]);
				logAns += Math.log10(temp);
				ans *= temp;
			}
			if (logAns > 18.1 || ans > max || ans <= 0)
				System.out.println(-1);
			else
				System.out.println(ans);
		}
		sc.close();

	}
}

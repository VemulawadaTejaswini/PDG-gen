import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long max = 1000000000000000000L;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int flag = 0;
		String eatEmpty = sc.nextLine();
		String input = sc.nextLine();
		String tempInput = " " + input + " ";
		if (tempInput.contains(" 0 ")) {
			flag = 1;
			System.out.println(0);
		} else {
			String nums[] = input.split(" ");
			long ans = 1;
			while (--N >= 0 && flag == 0) {
				if (flag == 0 && ans <= max) {
					long a = Long.parseLong(nums[N]);
					long prevAns = ans;
					ans = (ans * a);
					if ((ans < a || ans > max) || (prevAns == ans && a != 1))
						flag = 1;
				} else if (flag == 0) {
					flag = 1;
					break;
				}
			}
			System.out.println((flag == 1 || max < ans) ? -1 : ans);
		}
		sc.close();

	}
}

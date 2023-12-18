import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigInteger ans = new BigInteger("1");
		BigInteger max = new BigInteger((long) Math.pow(10, 18) + "");
		int flag = 0;
		String eatEmpty = sc.nextLine();
		String input = sc.nextLine();
		String tempInput = " " + input + " ";
		if (tempInput.contains(" 0 ")) {
			flag = 1;
			System.out.println(0);
		} else {
			String nums[] = input.split(" ");
//			System.out.println(Arrays.toString(nums));
			while (--N >= 0) {
				if (flag == 0 && max.compareTo(ans) >= 0) {
					BigInteger a = new BigInteger(nums[N]);
					ans = ans.multiply(a);
				} else if (flag == 0) {
					flag = 1;
					break;
				}
			}
			System.out.println((flag == 1 || max.compareTo(ans) < 0) ? -1 : ans);
		}
		sc.close();
	}
}

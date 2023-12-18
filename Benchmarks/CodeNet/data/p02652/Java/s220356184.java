import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int count0 = 0;
		int count1 = 0;
		int countHatena = 0;
		for (char x : s.toCharArray()) {
			if ('0' == x)
				count0++;
			else if ('1' == x)
				count1++;
			else
				countHatena++;
		}
		int ans = Math.abs(count0 - count1);
		// はてなが奇数の場合
		if (countHatena % 2 != 0) {
			ans++;
		}
		System.out.println(ans);
	}
}
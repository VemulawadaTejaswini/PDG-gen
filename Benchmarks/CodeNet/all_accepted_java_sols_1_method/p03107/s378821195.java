import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int cnt0 = 0;
		int cnt1 = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') cnt0++;
			else cnt1++;
		}

		System.out.println(Math.min(cnt0, cnt1) * 2);
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		Integer run[] = new Integer[S.length()-2];
		int ans = 10000;

		for (int i = 0; i < S.length()-2; i++) {
			Integer num = Integer.valueOf(S.substring(i, i+3));
			run[i] = num;
		}

		for (int i = 0; i < run.length; i++) {
			int tmp = Math.abs(run[i].intValue() - 753);
			if(tmp < ans) {
				ans = tmp;
			}
		}
		System.out.println(ans);
	}
}

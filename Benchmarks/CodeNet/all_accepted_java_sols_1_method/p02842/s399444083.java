import java.util.Scanner;

public class Main {
	static String s = "";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String ans = ":(";

		int N = sc.nextInt();

		for(int X=1; X<=50000; X++) {
			int value = (int)(X * 1.08);
			if(value == N) {
				ans = String.valueOf(X);
				break;
			}
		}

		System.out.println(ans);

	}

}
import java.util.Scanner;

public class Main {
	static String s = "";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int ans;

		if(N % 2 == 0) {
			ans = N / 2;
		}else {
			ans = N / 2 + 1;
		}

		System.out.println(ans);

	}

}
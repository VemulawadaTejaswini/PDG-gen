import java.util.Scanner;

public class Main {
	static String s = "";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int ans = 0;

		int M1 = sc.nextInt();
		int D1 = sc.nextInt();

		int M2 = sc.nextInt();
		int D2 = sc.nextInt();

		if(M1 != M2)
			ans = 1;

		System.out.println(ans);

	}

}
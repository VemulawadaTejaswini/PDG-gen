import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		//判定
		String ans ="";
		if (a <= 8 && b <= 8) {
			ans = "Yay!";
		} else {
			ans = ":(";
		}

		// 出力
		System.out.println(ans);
	}
}
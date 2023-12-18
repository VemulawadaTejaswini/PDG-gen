import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int n = sc.nextInt();
		String ans ="";

		if(n < 1000) {
			ans = "ABC";
		} else {
			ans = "ABD";
		}

		// 出力
		System.out.println(ans);
	}
}
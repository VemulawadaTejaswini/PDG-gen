import java.util.Scanner;

public class Main {

	/*
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 文字列の入力
		String s = sc.next();
		// 出力
		System.out.println((a+b+c) + " " + s);

	}
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		
		int bigger = H >= W ? H : W;
		
		int ans = N / bigger;
		if( N % bigger != 0){
			ans++;
		}
		
		System.out.println(ans);
	}	
}
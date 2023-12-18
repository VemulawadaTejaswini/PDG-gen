import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 文字列の入力
		int result = 0;
		if (b > a * n) {
		    result = a * n;
		} else {
		    result = b;
		}
		// 出力
		System.out.println(result);
	}
}
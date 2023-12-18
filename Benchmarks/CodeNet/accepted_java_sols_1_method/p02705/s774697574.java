import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力

		// 半径 x2 * 3.14
		double b = 2 * a * Math.PI;
		// 出力
		System.out.println(b);
	}
}
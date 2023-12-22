import java.util.*;
public class Main {
	public static void main(String[] args){
		// 整数の入力
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 絶対値の差分を取る10
		int c = Math.abs(a - b);

		// 偶数の場合はNG
		if(c % 2 != 0) {
			System.out.println("IMPOSSIBLE");
		}else {
			int k = (a + b) / 2;
			System.out.println(k);
		}
	}
}

import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int k = sc.nextInt();
		// スペース区切りの整数の入力
		int x = sc.nextInt();

		if ( k*500 >= x ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		// 出力
	}
}
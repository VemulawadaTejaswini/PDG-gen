import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = a - b*2;
		//判定
		if (ans <= 0){
			ans = 0 ;
		}
		//出力
		System.out.println(ans);
	}
}

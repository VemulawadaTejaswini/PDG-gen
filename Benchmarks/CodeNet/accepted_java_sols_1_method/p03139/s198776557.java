import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// スペース区切りの整数の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//最大数
		System.out.print(Math.min(a, b));
		
		//半角スペース
		System.out.print(" ");
		
		//最小数
		System.out.print((a + b - n) < 0 ? 0 : (a + b - n));
		
	}
}
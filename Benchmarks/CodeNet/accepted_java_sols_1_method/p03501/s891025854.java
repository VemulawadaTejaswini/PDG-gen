import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		int ans = b;

		if(n*a < b){
		ans = n*a;
		}
		// 出力
		System.out.println(ans);
	}
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		
        int m = x%n==0 ? x/n : x/n+1;
      // 出力
		System.out.println("" + (m*t));
	}
}
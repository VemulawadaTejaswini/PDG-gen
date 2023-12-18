import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int x = sc.nextInt();
		int t = sc.nextInt();
		int a = 0;
      	int b = 0;
      	while (b < n){
          a += t;
          b += x;
        }
        // 出力
		System.out.println(a);
	}
}
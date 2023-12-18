import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
        int ans = a + b;
        if (ans > 23) {
          ans -= 24;
        }
    
		// 出力
		System.out.println(ans);
	}
}
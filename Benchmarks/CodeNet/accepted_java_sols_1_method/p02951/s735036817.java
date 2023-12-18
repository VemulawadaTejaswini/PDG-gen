import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
    
		int aCap = a - b;
        int ans = c - aCap;
        if (ans < 0) {
          ans = 0;
        }
    
		// 出力
		System.out.println(ans);
	}
}

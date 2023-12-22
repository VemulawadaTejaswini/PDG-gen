import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
        String ans = "YES";
        if ((n - n % 2) / 2 + n % 2 < k ) {
		  ans = "NO";
        }
    
		// 出力
		System.out.println(ans);
	}
}
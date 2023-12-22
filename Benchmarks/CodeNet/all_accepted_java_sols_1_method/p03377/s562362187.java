import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
        String ans = "";
        if (a > x) {
          ans = "NO";
        } else if (a + b > x) {
          ans = "YES";
        } else {
          ans = "NO";
        }
    
		// 出力
		System.out.println(ans);
	}
}

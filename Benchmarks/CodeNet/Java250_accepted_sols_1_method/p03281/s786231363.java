import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int ans = 0;
        if (n >= 105) {
          ans++;
        }
        if (n >= 135) {
          ans++;
        }
        if (n >= 165) {
          ans++;
        } 
        if (n >= 189) {
          ans++;
        } 
        if (n >= 195) {
          ans++;
        }

		// 出力
		System.out.println(ans);
	}
}

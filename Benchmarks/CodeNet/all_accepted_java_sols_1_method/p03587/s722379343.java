import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int ans = 0;
		// 文字列の入力
		String[] s = sc.next().split("");
        for(String v : s) {
          if (v.equals("1")) {
            ans++;
          }
        }
		// 出力
		System.out.println(ans);
	}
}
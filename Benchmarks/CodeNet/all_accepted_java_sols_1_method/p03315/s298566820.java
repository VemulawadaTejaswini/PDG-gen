import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String[] s = sc.next().split("");
        int ans = 0;
        for(String n : s) {
          if ("+".equals(n)) {
            ans++;
          } else {
            ans--;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}

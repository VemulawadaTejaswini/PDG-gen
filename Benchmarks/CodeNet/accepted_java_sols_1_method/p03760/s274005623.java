import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String[] o = sc.next().split("");
        String[] e = sc.next().split("");
        String ans = "";
        for(int i = 0; i < o.length; i++) {
          ans += o[i];
          if (i <= e.length - 1) {
            ans += e[i];
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}
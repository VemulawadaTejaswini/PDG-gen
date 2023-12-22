import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String[] s = sc.next().split("");
        String ans = "";
        for(String n : s) {
          if (n.equals("1")) {
            ans += "9";
          } else if (n.equals("9")) {
            ans += "1";
          } else {
            ans += n;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}

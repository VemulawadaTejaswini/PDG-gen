import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String[] s = sc.next().split("");
      
        String ans = "";
        if (!s[1].equals(s[2])) {
          ans = "No";
        } else {
          ans = s[0].equals(s[1]) || s[1].equals(s[3]) ? "Yes" : "No";
        }
        
    
		// 出力
		System.out.println(ans);
	}
}

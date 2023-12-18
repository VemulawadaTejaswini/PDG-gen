import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
		// 文字列の入力
		String[] s = sc.next().split("");
        boolean hasC = false;
        String ans = "No";
        for (int i = 0; i < s.length; i++) {
          if (s[i].equals("C")) {
            hasC = true;
          } else if (s[i].equals("F") && hasC) {
            ans = "Yes";
            break;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}
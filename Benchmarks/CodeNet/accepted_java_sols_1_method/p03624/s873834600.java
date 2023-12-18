import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String[] s = sc.next().split("");
        List<String> list = Arrays.asList(s);
        String[] alphabets = { "a", "b", "c", "d", "e", 
                              "f", "g", "h", "i", "j", 
                              "k", "l", "m", "n", "o", "p",
                              "q", "r", "s", "t", "u", 
                              "v", "w", "x", "y", "z"};
        String ans = "None";
        for(String v : alphabets) {
          if (list.indexOf(v) == -1) {
            ans = v;
            break;
          }
        }
        // 出力
        System.out.println(ans);
	}
}
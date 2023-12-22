import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
       
        String[] list = {"a", "i", "u", "e", "o"};
      
		// 文字列の入力
		String s = sc.next();
        String ans = "consonant";
        for(String vowel : list) {
          if (vowel.equals(s)) {
            ans = "vowel";
            break;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}
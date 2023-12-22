import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int h = sc.nextInt();
		int w = sc.nextInt();
        String edge = "";
        for(int i = 0; i < w + 2; i++) {
          edge += "#";
        }
        // 出力
		System.out.println(edge);
       
        for(int i = 0; i < h; i++) {
          // 文字列の入力
		  String s = sc.next();
          String ans = "#";
          ans += s + "#";
          // 出力
		  System.out.println(ans);
        }
      
        // 出力
		System.out.println(edge);
	}
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		// 文字列の入力
		String S = sc.next();
      	String output = "";
      for(int i = 0; i < S.length(); i++) {
        if (i == K - 1) {
          output += String.valueOf(S.charAt(i)).toLowerCase();
        } else {
          output += S.charAt(i);
        }
      }
      System.out.println(output);
	}
}
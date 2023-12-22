import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int N = sc.nextInt(); // 合計値
      String S = sc.next();
      S = S.replaceAll("ABC", "");
      int diff = N - S.length();
      if(diff > 0){
      	System.out.println(diff / 3);
      } else {
        System.out.println(0);
      }
   }
}

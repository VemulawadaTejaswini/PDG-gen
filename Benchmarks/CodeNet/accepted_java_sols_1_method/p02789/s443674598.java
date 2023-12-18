import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int N = sc.nextInt(); // 合計値
      int S = sc.nextInt();
      if(N <= S){
      	System.out.println("Yes");
      } else {
        System.out.println("No");
      }
   }
}

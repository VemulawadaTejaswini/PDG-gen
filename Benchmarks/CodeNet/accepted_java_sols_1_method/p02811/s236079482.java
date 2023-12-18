import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 枚数の入力
		int K = sc.nextInt();
		// 合計金額の入力
		int X = sc.nextInt();
		
		// 出力
		if(K*500 >= X){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      
	}
}
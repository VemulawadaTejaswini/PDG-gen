import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		// 出力
      if(( b / a == 2 || b / a == 3 || b == 4 * a) && b % 2 == 0){
      		System.out.println("Yes");
      }else{
		System.out.println("No");
      }
	}
}

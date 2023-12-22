import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 文字列の出力
		String s = "Odd";
      	if (a*b%2==0) {
          s="Even";
        }
		// 出力
		System.out.println(s);
	}
}
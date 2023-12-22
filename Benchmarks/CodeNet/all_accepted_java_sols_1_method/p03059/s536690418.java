import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		
		// ビスケットの合計枚数
		int number = ((t-(t%a))/a)*b;
		
		// 出力
		System.out.println(number);
	}
}

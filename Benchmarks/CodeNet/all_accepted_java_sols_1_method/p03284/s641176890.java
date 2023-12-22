import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int k = sc.nextInt();
	//	int c = sc.nextInt();
		// 文字列の入力
	//	String s = sc.next();

		// 出力
		if(n%k==0)System.out.println("0");
		else System.out.println("1");
	}
}
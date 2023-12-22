import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 文字列の入力
		int max = a;
		
		if(max < b){
			max = b;
		}
		if(max < c){
			max = c;
		}
		
		// 出力
		int total = a + b + c;
		if(max == total - max){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
}
}
import java.util.Scanner;
import java.util.regex.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int a = sc.nextInt();
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
		//1文字ずつ
		//s.atChar(i);
		// 出力
		//System.out.println("");
		//double countx=0;

		int R=sc.nextInt();
		
		if(R<1200){
			System.out.println("ABC");
		}else if(R<2800){
			System.out.println("ARC");
		}else{
			System.out.println("AGC");
		}
	
	}
}
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
	
		String S;
		S=sc.next();
		int leng =S.length();
		//boolean x=false;
		Pattern p= Pattern.compile("^A[a-z][a-z]*C[a-z]*[a-z]$");
		Matcher m = p.matcher(S);
		boolean b = m.matches();
		
		if(b){
			System.out.println("AC");
		}else{
			System.out.println("WA");
		}
	
	
	}
}
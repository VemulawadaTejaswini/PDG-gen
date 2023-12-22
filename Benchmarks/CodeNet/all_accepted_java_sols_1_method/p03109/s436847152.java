import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;
import java.math.*;
import java.util.HashMap;

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
		//int n=sc.nextInt();
		
		String s = sc.next();
		
		int yy=Integer.parseInt(s.substring(0,4));
		int mm=Integer.parseInt(s.substring(5,7));
		int dd=Integer.parseInt(s.substring(9,10));
		//System.out.print(mm);
		
		boolean x=false;//false=heisei
	
		
		if(yy==2019){
			if(mm>4){
				x=true;
				
			}
		}
		
		if(yy > 2019){
			x=true;
		}
		
		if(x){
			System.out.println("TBD");
		}else{

			System.out.println("Heisei");
		}
		
	}
		
}

/*
 * 二つの整数 A, B が入力されます。A+B の値を出力してください。
 * 
 * ただし、A+B が 10 以上の場合は、代わりに error と出力してください。
 */

import java.util.*;
	public class Main{
		public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            
            if(a+b<10){
            	System.out.println(a+b);
            }else{
            	System.out.println("error");
            }
            sc.close();
		}
    }
	
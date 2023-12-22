/*
 * N 以下の正の整数の 10 進法での各桁の和の最大値を求めてください。
 */

import java.util.*;
	public class Main{
		public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 入力
            long n = Long.parseLong(sc.next());
            int nLen = String.valueOf(n).length();
            
            // 出力
            if((n+1)%(long)(Math.pow(10, nLen-1))==0){
            	System.out.println(9*(nLen-1) + n/(long)(Math.pow(10, nLen-1)));
            }else{
            	System.out.println(9*(nLen-1) + n/(long)(Math.pow(10, nLen-1)) - 1);
            }
            sc.close();
        }
    }
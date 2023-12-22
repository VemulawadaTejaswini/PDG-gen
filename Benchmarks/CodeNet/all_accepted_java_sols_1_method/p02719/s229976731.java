

import java.util.*;

public class Main {
	//static boolean f;
	static long min;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 入力の受け取り
		 * String s = sc.next();
		 * int a = sc.nextInt();
		 * long a = sc.nextLong();
		 */
		
		// 文字列(String)を文字(char)に分解
		// char[] s_char = s.toCharArray();
		
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		min = n%k;
		min = Math.min(min, Math.abs(min-k));
		
		System.out.println(min);
		
		/*
		 * if(f)
		 *	System.out.println("Yes");
		 * else
		 * 	System.out.println("No");
		 */
	}
}

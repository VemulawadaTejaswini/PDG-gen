

import java.util.*;

public class Main {
	static boolean f;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 入力の受け取り
		 * String s = sc.next();
		 * int a = sc.nextInt();
		 * long a = sc.nextLong();
		 */
		
		// 文字列(String)を文字(char)に分解
		// char[] s_char = s.toCharArray();
		
		int n = sc.nextInt();
		long sum = 0;
		
		for(int i=1;i<=n;i++) {
			if(i%3!=0 && i%5!=0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		
		/*
		 * if(f)
		 *	System.out.println("Yes");
		 * else
		 * 	System.out.println("No");
		 */
	}
}

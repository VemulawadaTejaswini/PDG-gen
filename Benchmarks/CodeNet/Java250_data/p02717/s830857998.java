//https://atcoder.jp/contests/abc161/tasks/abc161_a

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tmp;
		//箱に入っている整数の読み込み
		int box_a = sc.nextInt();
		int box_b = sc.nextInt();
		int box_c = sc.nextInt();
		
		tmp = box_a;
		box_a = box_b;
		box_b = tmp;
		
		tmp = box_a;
		box_a = box_c;
		box_c = tmp;
		
		System.out.println(box_a + " " + box_b + " " + box_c);
	}
	
	
// プリミティブ型の入れ替えの方法わからん。。。
// 	private static void _swap(Integer i1, Integer i2) {
// 		int tmp;
// 		
// 		tmp = i1.intValue();
// 		i1 = i2;
// 		i2 = tmp;
// 	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		// 入力
		Scanner sc = new Scanner(System.in);
		Long A = sc.nextLong();
		Long B = sc.nextLong();
		Long X = sc.nextLong();
		
		// 割り切れる個数の算出
		Long count0toB = B / X + 1L;
		Long count0toA = 0L;
		if(A > 0){
			count0toA = (A-1) / X + 1L;
		}
		Long countAtoB = count0toB - count0toA;
		
		// 出力
		System.out.println(countAtoB);
	}

}

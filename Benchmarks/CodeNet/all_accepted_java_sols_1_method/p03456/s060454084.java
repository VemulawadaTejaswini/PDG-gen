import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 計算
		String result = "No";
		int c = Integer.valueOf(Integer.toString(a) + Integer.toString(b));
		for(int i = 0; i < c; i++){
		    if(i*i == c) result = "Yes";
		}
		
		// 出力
		System.out.println(result);
	}
}


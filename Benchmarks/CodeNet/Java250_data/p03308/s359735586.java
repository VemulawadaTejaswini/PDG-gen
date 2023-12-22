import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int max = 0;
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    min = min(min, a);
		    max = max(max, a);
		}
		
		// 計算
		int result = max - min;
		
		// 出力
		System.out.println(result);
	}
}

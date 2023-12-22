import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int w[] = new int[n];
		
		// 計算
		int result = Integer.MAX_VALUE;
		int sum = 0;
		for(int i = 0; i < n; i++){
		    w[i] = sc.nextInt();
		    sum += w[i];
		}
		int temp = 0;
		for(int i = 0; i < n; i++){
		    temp += w[i];
		    result = min(result, abs((sum - temp) - temp));
		}
		
		// 出力
		System.out.println(result);
		
	}
}

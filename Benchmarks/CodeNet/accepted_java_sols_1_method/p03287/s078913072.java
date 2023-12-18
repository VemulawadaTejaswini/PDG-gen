import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] sum = new long[n+1];
		sum[0] = 0;
		for(int i = 0; i < n; i++){
		    sum[i+1] = (sum[i] + sc.nextLong())%m;
		}
		
		// 計算
		long result = 0;
		HashMap<Integer, Integer> cnt = new HashMap<Integer, Integer>();
		for(int i = 0; i < n+1; i++){
		    result += cnt.getOrDefault((int)sum[i], 0);
		    cnt.put((int)sum[i], cnt.getOrDefault((int)sum[i], 0) + 1);
		}
		// 出力
		System.out.println(result);
	}
}

import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++){
		    h[i] = sc.nextInt();
		}

		// 計算
	    int result = 0;
	    Arrays.sort(h);
	    int min = Integer.MAX_VALUE;
	    for(int i = k - 1; i < n; i++){
		    min = min(min, h[i] - h[i - k + 1]);
		}
		result = min;

		// 出力
		System.out.println(result);
        
	}
}

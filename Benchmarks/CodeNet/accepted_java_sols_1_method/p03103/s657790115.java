import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] d = new int[n][2];
		for(int i = 0; i < n; i++){
		    d[i][0] = sc.nextInt();
		    d[i][1] = sc.nextInt();
		}
		
		// 計算
		long result = 0;
		Arrays.sort(d, (a,b) -> Integer.compare(a[0], b[0]));
		for(int i = 0; i < n; i++){
		    if(m == 0) break;
		    result += (long)d[i][0] * min(m, d[i][1]);
		    m = max(0, m - d[i][1]);
		}
		
		// 出力
		System.out.println(result);
        
	}
}

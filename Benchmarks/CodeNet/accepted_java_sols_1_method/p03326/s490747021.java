import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
    static int n;
    static int m;
    static long[][] xyz;
    static long max = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		n = sc.nextInt();
		m = sc.nextInt();
		xyz = new long[n][3];
		for(int i = 0; i < n; i++){
		    xyz[i][0] = sc.nextLong();
		    xyz[i][1] = sc.nextLong();
		    xyz[i][2] = sc.nextLong();
		}
		
		// 計算
		long result = 0;
		for(int i = 0; i < 8; i++){
		    int[] sgn = new int[3];
		    for(int j = 0; j < 3; j++){
		        if((i>>j & 1) == 1){
		            sgn[j] = -1;
		        }else{
		            sgn[j] = 1;
		        }
		    }
		    Arrays.sort(xyz, (s, t) -> {
		        return Long.signum(s[0]*sgn[0] + s[1]*sgn[1] + s[2]*sgn[2] - t[0]*sgn[0] - t[1]*sgn[1] - t[2]*sgn[2]);
		    });
		    long[] sum = new long[3];
		    for(int k = 0; k < m; k++){
		        sum[0] += xyz[n-1-k][0];
		        sum[1] += xyz[n-1-k][1];
		        sum[2] += xyz[n-1-k][2];
		    }
		    max = max(max, abs(sum[0]) + abs(sum[1]) + abs(sum[2]));
		}
		result = max;
		
		// 出力
		System.out.println(result);
	}
}

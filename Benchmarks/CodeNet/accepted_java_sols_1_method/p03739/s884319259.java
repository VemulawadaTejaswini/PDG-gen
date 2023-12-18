import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long[] sum = new long[n+1];
		for(int i = 0; i < n; i++){
		    long a = sc.nextLong();
		    if(i == 0){
		        sum[i+1] = a;
		    }else{
		        sum[i+1] = sum[i] + a;
		    }
		}
		
		// 計算
		long result = 0;
		long cnt = 0;
		long plus = 0;
		sum[0] = -1;
		for(int i = 0; i < n; i++){
		    long prev = sum[i] + plus;
		    long now = sum[i+1] + plus;
		    if(Long.signum(prev)*Long.signum(now) == -1) continue;
		    cnt += abs(now) + 1;
		    plus += (abs(now) + 1)*Long.signum(prev)*(-1);
		}
		result = cnt;
		cnt = 0;
		plus = 0;
		sum[0] = 1;
		for(int i = 0; i < n; i++){
		    long prev = sum[i] + plus;
		    long now = sum[i+1] + plus;
		    if(Long.signum(prev)*Long.signum(now) == -1) continue;
		    cnt += abs(now) + 1;
		    plus += (abs(now) + 1)*Long.signum(prev)*(-1);
		}
		result = min(result, cnt);
		
		// 出力
		System.out.println(result);
	}
}


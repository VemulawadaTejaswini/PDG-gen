import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n]; 
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt()-1;
		}
		
		
		// 計算
		int result = 0;
		result = func(a, new boolean[n], 0, 0);
		
		// 出力
		System.out.println(result);
	}
	
	public static int func(int[] a, boolean[] flg, int now, int cnt) {
	    if(now == 1) return cnt;
	    if(flg[a[now]]) return -1;
	    flg[a[now]] = true;
	    return func(a, flg, a[now], cnt + 1);
	}
}

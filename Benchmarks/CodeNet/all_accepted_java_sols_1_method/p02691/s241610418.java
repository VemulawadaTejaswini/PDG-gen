import java.util.*;
import static java.lang.Math.*;

public class Main {
    
    static int[] a;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = 2*100000;
		long result = 0;
		int[] cnt = new int[max + 1];
		int[] minus = new int[max + 1];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		    if(a[i] > max) continue;
		    int chk = i - a[i];
		    if(chk >= 0){
		        result += cnt[chk];
		    }
		    if(a[i]+i > max) continue;
		    cnt[a[i]+i]++;
		}
		// 計算
		//int result = 0;
		
		
		
		// 出力
		System.out.println(result);
	}
}

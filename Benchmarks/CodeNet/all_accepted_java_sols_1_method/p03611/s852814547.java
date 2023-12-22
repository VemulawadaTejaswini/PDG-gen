import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[100005];
		for(int i = 0; i < n; i++){
		    int k = sc.nextInt();
		    a[k]++;
		}
		
		// 計算
		int result = 0;
		for(int i = 0; i < 100001; i++){
		    int sum = a[i] + a[i+1] + a[i+2];
		    result = max(result, sum);
		}
		
		// 出力
		System.out.println(result);
	}
}



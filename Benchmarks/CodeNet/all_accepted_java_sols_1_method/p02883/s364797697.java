import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] a = new int[n];
		Integer[] f = new Integer[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
		    f[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(f, Comparator.reverseOrder());
		
		// 計算
		long result = 0;
		long l = -1;
		long r = 1001001001001L;
		while(l+1 < r){
		    long c = (l + r)/2;
		    long sum = 0;
		    for(int i = 0; i < n; i++){
		        sum += max(a[i] - c/f[i], 0);
		    }
		    if(sum <= k){
		        r = c;
		    }else{
		        l = c;
		    }
		}
		result = r;
		
		// 出力
		System.out.println(result);
		
	}
}
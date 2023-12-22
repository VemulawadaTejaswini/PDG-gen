import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextLong();
		}
		
		// 計算
		int result = 0;
		for(int i = 0; i < n; i++){
		    while(a[i]%2 == 0){
		        result++;
		        a[i] /= 2;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}

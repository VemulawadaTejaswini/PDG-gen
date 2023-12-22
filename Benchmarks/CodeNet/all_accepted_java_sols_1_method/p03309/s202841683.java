import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt() - (i + 1);
		}
		Arrays.sort(a);
		
		// 計算
		long result = 0;
		long b = a[(n-1)/2];
		for(int i = 0; i < n; i++){
		    result += abs(a[i] - b);
		}
		
		// 出力
		System.out.println(result);
	}
}

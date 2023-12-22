import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n];
		
		for(int i = 0; i < n+1; i++){
		    a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
		    b[i] = sc.nextInt();
		}
		
		// 計算
		long result = 0;
		for(int i = 0; i < n; i++){
		    result = result + min(a[i], b[i]);
		    result = result + min(a[i+1], max(0, b[i] - a[i]));
		    a[i+1] = a[i+1] - min(a[i+1], max(0, b[i] - a[i]));
		}
		
		// 出力
		System.out.println(result);
	}
}

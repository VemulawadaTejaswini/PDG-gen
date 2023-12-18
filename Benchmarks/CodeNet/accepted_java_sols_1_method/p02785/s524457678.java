import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h= new int[n];
		for(int i = 0; i < n; i++){
		    h[i] = sc.nextInt();
		}
		Arrays.sort(h);
		
		// 計算
		long result = 0;
		for(int i = 0; i < n - k; i++){
		    result += h[i];
		}
		
		// 出力
		System.out.println(result);
	}
}

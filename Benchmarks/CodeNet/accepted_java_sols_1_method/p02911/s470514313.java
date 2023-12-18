import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < q; i++){
		    int ans = sc.nextInt();
		    p[ans - 1]++;
		}
		
		// 計算
		String[] result = new String[n];
		for(int i = 0; i < n; i++){
		    if(k - q + p[i] > 0){
		        result[i] = "Yes";
		    }else{
		        result[i] = "No";
		    }
		}
		// 出力
		for(int i = 0; i < n; i++){
		    System.out.println(result[i]);
		}
		//System.out.println(result);
		
	}
}

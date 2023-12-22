import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] like = new int[m];
		for(int i = 0; i < n; i++){
		    int k = sc.nextInt();
		    for(int j = 0; j < k; j++){
		        int a = sc.nextInt() - 1;
		        like[a]++;
		    }
		}

		// 計算
		int result = 0;
		for(int i = 0; i < m; i++){
		    if(like[i] == n) result++;
		}
		
		// 出力
		System.out.println(result);
        
	}
}

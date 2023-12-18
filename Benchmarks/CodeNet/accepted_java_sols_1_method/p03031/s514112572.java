import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] light = new int[m];
		int[] p = new int[m];
		
		for(int i = 0; i < m; i++){
		    int k = sc.nextInt();
		    for(int j = 0; j < k; j++){
		        int s = sc.nextInt();
		        light[i] |= 1<<(s-1); 
		    }
		}
		for(int i = 0; i < m; i++){
		    p[i] = sc.nextInt();
		}
		// 計算
		int result = 0;
		for(int i = 0; i < 1<<n; i++){
		    int temp = 0;
		    for(int j = 0; j < m; j++){
		        if(Integer.bitCount(i & light[j])%2 == p[j]){
		            temp++;
		            continue;
		        }
		        break;
		    }
		    if(temp == m) result++;
		}
		
		// 出力
		System.out.println(result);
	}
}
import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] x = new int[n][d];
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < d; j++){
		        x[i][j] = sc.nextInt();
		    }
		}
		
		// 計算
		int result = 0;
		for(int i = 0; i < n; i++){
		    for(int j = i+1; j < n; j++){
		        long dist = 0;
		        for(int k = 0; k < d; k++){
		            dist += (x[i][k] - x[j][k])*(x[i][k] - x[j][k]);
		        }
		        boolean flg = false;
		        for(int k = 0; k <= sqrt(dist); k++){
		            if(dist == k*k){
		                flg = true;
		                break;
		            } 
		        }
		        if(flg) result++;
		    }
		}

		// 出力
		System.out.println(result);
	}
}

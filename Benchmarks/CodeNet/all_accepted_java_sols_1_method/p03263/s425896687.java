import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] a = new int[h][w];
	    for(int i = 0; i < h; i++){
	        for(int j = 0; j < w; j++){
	            a[i][j] = sc.nextInt()%2;
	        }
	    }
	    
		// 計算
		int result = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < h; i++){
	        for(int j = 0; j < w-1; j++){
	            if(a[i][j] == 1){
	                sb.append(i+1).append(" ").append(j+1).append(" ").append(i+1).append(" ").append(j+2).append("\n");
	                a[i][j+1] += a[i][j];
	                result++;
	            }
	        }
	    }
	    for(int i = 0; i < h-1; i++){
	        if(a[i][w-1]%2 == 1){
	            sb.append(i+1).append(" ").append(w).append(" ").append(i+2).append(" ").append(w).append("\n");
	            a[i+1][w-1] += a[i][w-1];
	            result++;
	        }
	    }
		
		// 出力
		System.out.println(result);
		System.out.println(sb);
	}
}

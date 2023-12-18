import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h];
		for(int i = 0; i < h; i++){
		    s[i] = sc.next();
		}
		// 計算
		int result = 0;
		int[][] l = new int[h][w];
		int[][] r = new int[h][w];
		int[][] u = new int[h][w];
		int[][] d = new int[h][w];
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        if(s[i].charAt(j) == '.'){
		            if(i == 0){
		                u[i][j] = 1;
		            }else{
		                u[i][j] = u[i-1][j] + 1;
		            }
		            if(j == 0){
		                l[i][j] = 1;
		            }else{
		                l[i][j] = l[i][j-1] + 1;
		            }
		        }
		    }
		}
		for(int i = h - 1; i >= 0; i--){
		    for(int j = w - 1; j >= 0; j--){
		        if(s[i].charAt(j) == '.'){
		            if(i == h - 1){
		                d[i][j] = 1;
		            }else{
		                d[i][j] = d[i+1][j] + 1;
		            }
		            if(j == w - 1){
		                r[i][j] = 1;
		            }else{
		                r[i][j] = r[i][j+1] + 1;
		            }
		        }
		    }
		}
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        int temp = u[i][j] + d[i][j] + l[i][j] + r[i][j] - 3;
		        result = max(result, temp);
		    }
		}
		// 出力
		System.out.println(result);
		
	}
}

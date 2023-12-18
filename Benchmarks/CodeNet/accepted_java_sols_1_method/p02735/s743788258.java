import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] grid = new char[h][w];
		for(int i = 0; i < h; i++){
		    String s = sc.next();
		    grid[i] = s.toCharArray();
		}
		
		// 計算
		int result = 0;
		int[][] dist = new int[h][w];
		if(grid[0][0] == '#') dist[0][0] = 1;
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        if(j > 0){
		            int d = dist[i][j-1];
		            if(grid[i][j] == '#' && grid[i][j-1] == '.') d++;
		            dist[i][j] = d;
		        }
		        if(i > 0){
		            int d = dist[i-1][j];
		            if(grid[i][j] == '#' && grid[i-1][j] == '.') d++;
		            if(j == 0){
		                dist[i][j] = d;
		            }else{
		                dist[i][j] = min(dist[i][j], d);
		            }
		        }
		    }
		}
		
		result = dist[h-1][w-1];
		
		// 出力
		System.out.println(result);
	}
	
}

import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] grid = new char[h+2][w+2];
		for(int i = 0; i < h+2; i++){
		    Arrays.fill(grid[i], '#');
		}
		for(int i = 0; i < h; i++){
		    String s = sc.next();
		    for(int j = 0; j < w; j++){
		        grid[i+1][j+1] = s.charAt(j);
		    }
		}
		
		// 計算
		//String result = "No";
		
		// 出力
		for(int i = 0; i < h+2; i++){
		    for(int j = 0; j < w+2; j++){
		        System.out.print(grid[i][j]);
		    }
		    System.out.println();
		}
		//System.out.println(result);
	}
}

import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[] resH = new int[h];
		int[] resW = new int[w];
		char[][] grid = new char[h][w];
		for(int i = 0; i < h; i++){
		    String s = sc.next();
		    char[] c = s.toCharArray();
		    for(int j = 0; j < w; j++){
		        grid[i][j] = c[j];
		        if(c[j] == '#'){
		            resH[i] = 1;
		            resW[j] = 1;
		        }
		    }
		}
		
		// 計算
		
		// 出力
		for(int i = 0; i < h; i++){
		    if(resH[i] == 0) continue;
		    for(int j = 0; j < w; j++){
		        if(resW[j] == 0) continue;
		        System.out.print(grid[i][j]);
		    }
		    System.out.println("");
		}
	}
}

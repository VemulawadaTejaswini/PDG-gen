import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		
		// 計算
		//String result = "No";
		int[][] grid = new int[h][w];
		int indexH = 0;
		int indexW = 0;
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < a[i]; j++){
		        grid[indexH][indexW] = i+1;
		        if(indexH%2 == 0 && indexW < w-1){
		            indexW++;
		        }else if(indexH%2 != 0 && indexW > 0){
		            indexW--;
		        }else{
		            indexH++;
		        }
		    }
		}
		
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        System.out.print(grid[i][j]);
		        if(j < w-1){
		            System.out.print(" ");
		        }else{
		            System.out.print("\n");
		        }
		    }
		}
		// 出力
		//System.out.println(result);
	}
}


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
		ArrayList<Integer[]> result = new ArrayList<Integer[]>();
		for(int i = 0; i < h; i++){
	        for(int j = 0; j < w-1; j++){
	            if(a[i][j] == 1){
	                Integer[] move = {i+1, j+1, i+1, j+2};
	                result.add(move);
	                a[i][j+1] += a[i][j];
	            }
	        }
	    }
	    for(int i = 0; i < h-1; i++){
	        if(a[i][w-1]%2 == 1){
	            Integer[] move = {i+1, w, i+2, w};
	            result.add(move);
	            a[i+1][w-1] += a[i][w-1];
	        }
	    }
		
		// 出力
		System.out.println(result.size());
		for(Integer[] move : result){
		    System.out.println(move[0] + " " + move[1] + " " + move[2] + " " + move[3]);
		}
		
	}
}

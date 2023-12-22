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
		for(int i = 0; i < h; i++){
		    Arrays.fill(dist[i], -1);
		}
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		if(grid[0][0] == '#'){
		    dist[0][0] = 1;
		}else{
		    dist[0][0] = 0;
		}
		q.push(0);
		while(!q.isEmpty()){
		    int now = q.pop();
		    int i = now/w;
		    int j = now%w;
		    if(j+1 < w && (grid[i][j+1] == grid[i][j] || grid[i][j+1] == '.')){
		        if(dist[i][j+1] == -1){
		            dist[i][j+1] = dist[i][j];
		            q.push(now+1);
		        }else if(dist[i][j+1] > dist[i][j]){
		            dist[i][j+1] = dist[i][j];
		            q.push(now+1);
		        }
		    }
		    if(j+1 < w && grid[i][j+1] == '#' && grid[i][j] == '.'){
		        if(dist[i][j+1] == -1){
		            dist[i][j+1] = dist[i][j]+1;
		            q.push(now+1);
		        }else if(dist[i][j+1] > dist[i][j]+1){
		            dist[i][j+1] = dist[i][j]+1;
		            q.push(now+1);
		        }
		    }
		    if(i+1 < h && (grid[i+1][j] == grid[i][j] || grid[i+1][j] == '.')){
		        if(dist[i+1][j] == -1){
		            dist[i+1][j] = dist[i][j];
		            q.push(now+w);
		        }else if(dist[i+1][j] > dist[i][j]){
		            dist[i+1][j] = dist[i][j];
		            q.push(now+w);
		        }
		    }
		    if(i+1 < h && grid[i+1][j] == '#' && grid[i][j] == '.'){
		        if(dist[i+1][j] == -1){
		            dist[i+1][j] = dist[i][j]+1;
		            q.push(now+w);
		        }else if(dist[i+1][j] > dist[i][j]+1){
		            dist[i+1][j] = dist[i][j]+1;
		            q.push(now+w);
		        }
		    }
		}
		result = dist[h-1][w-1];
		//System.out.println(Arrays.deepToString(grid));
		//System.out.println(Arrays.deepToString(dist));
		
		// 出力
		System.out.println(result);
	}
	
}

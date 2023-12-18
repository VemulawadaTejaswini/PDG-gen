import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int x = sc.nextInt()-1;
		int y = sc.nextInt()-1;
		
		// 計算
		int result = 0;
		int[][] dist = new int[n][n];
		for(int i = 0; i < n; i++){
		    boolean[] visited = new boolean[n];
		    ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		    q.add(i);
		    visited[i] = true;
		    while(!q.isEmpty()){
		        int now = q.poll();
		        if(now == x){
		            if(!visited[y]){
		                q.add(y);
		                visited[y] = true;
		                dist[i][y] = dist[i][now] + 1;
		                //System.out.println("now:" + now + " next:" + y + " dist:" + (dist[i][now] + 1));
		            }
		        }
		        if(now == y){
		            if(!visited[x]){
		                q.add(x);
		                visited[x] = true;
		                dist[i][x] = dist[i][now] + 1;
		                //System.out.println("now:" + now + " next:" + x + " dist:" + (dist[i][now] + 1));
		            }
		        }
		        if(now > 0){
		            if(!visited[now-1]){
		                q.add(now-1);
		                visited[now-1] = true;
		                dist[i][now-1] = dist[i][now] + 1;
		                //System.out.println("now:" + now + " next:" + (now-1) + " dist:" + (dist[i][now] + 1));
		            }
		        }
		        if(now < n-1){
		            if(!visited[now+1]){
		                q.add(now+1);
		                visited[now+1] = true;
		                dist[i][now+1] = dist[i][now] + 1;
		                //System.out.println("now:" + now + " next:" + (now+1) + " dist:" + (dist[i][now] + 1));
		            }
		        }
		    }
		}
		//System.out.println(Arrays.deepToString(dist));
		int[] cnt = new int[n];
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		        cnt[dist[i][j]]++;
		    }
		}
		for(int i = 1; i < n; i++){
		    System.out.println(cnt[i]/2);
		}
		
		// 出力
		//System.out.println(result);
	}
}


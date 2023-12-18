import java.awt.Point;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
    
	static int N, M;
	static int S, G;
	static int[][] D, C;
	
    static void start()
    {
    	double[][][] times = new double[N+1][N+1][31];
    	boolean[][][] check = new boolean[N+1][N+1][31];
    	
    	for (int n = 0; n < N+1; n++) {
			for (int pren = 0; pren < N+1; pren++) {
				for (int c = 0; c < 31; c++) {
					times[n][pren][c] = Double.MAX_VALUE;
					check[n][pren][c] = false;
				}
			}
		}
    	
    	times[S][0][1] = 0;
    	
    	while(true)
    	{
    		int now_n = 0, now_pren = 0, now_c = 0;
    		
    		// スタート位置の決定
    		double min = Double.MAX_VALUE;
    		for (int n = 1; n < N+1; n++) {
    			for (int pren = 0; pren < N+1; pren++) {
    				for (int c = 1; c < 31; c++) {
    					if(check[n][pren][c] == true) continue;
    					if(times[n][pren][c] < min)
    					{
    						min = times[n][pren][c];
    						now_n = n;
    						now_pren = pren;
    						now_c = c;
    					}
    				}
    			}
    		}
    		if(min == Double.MAX_VALUE) break;
    		
    		// 処理
    		check[now_n][now_pren][now_c] = true;
    		
    		for (int n = 1; n <= N; n++) {
    			if(now_n == n) continue;
				if(now_pren == n) continue;
				if(D[now_n][n] < 0) continue;
				
				// 速度-1
				if(1 < now_c)
				{
					if((now_c-1) <= C[now_n][n])
					{
						double ntime = times[now_n][now_pren][now_c] + (double)D[now_n][n] / (double)(now_c-1);
						times[n][now_n][now_c-1] = Math.min(times[n][now_n][now_c-1], ntime);
					}
				}
				
				// 速度そのまま
				if(true)
				{
					if(now_c <= C[now_n][n])
					{
						double ntime = times[now_n][now_pren][now_c] + (double)D[now_n][n] / (double)now_c;
						times[n][now_n][now_c] = Math.min(times[n][now_n][now_c], ntime);
					}
				}
				
				if(now_n == S && now_c == 1) continue;
				
				// 速度+1
				if(now_c < 30)
				{
					if((now_c+1) <= C[now_n][n])
					{
						double ntime = times[now_n][now_pren][now_c] + (double)D[now_n][n] / (double)(now_c+1);
						times[n][now_n][now_c+1] = Math.min(times[n][now_n][now_c+1], ntime);
					}
				}
			}
    	}
    	
    	double min = Double.MAX_VALUE;
    	for (int pren = 1; pren <= N; pren++) {
			min = Math.min(min, times[G][pren][1]);
		}
    	
    	if(min == Double.MAX_VALUE)
    		System.out.println("unreachable");
    	else {
			System.out.printf("%.05f\n", min);
		}
    }
     
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
        	N = sca.nextInt();
        	M = sca.nextInt();
        	if(N == 0) break;
        	
        	S = sca.nextInt();
        	G = sca.nextInt();
        	
        	D = new int[N+1][N+1];
        	C = new int[N+1][N+1];
        	for (int i = 0; i <= N; i++) {
				for (int j = 0; j <= N; j++) {
					D[i][j] = C[i][j] = -1;
				}
			}
        	
        	for (int i = 0; i < M; i++) {
				int x = sca.nextInt();
				int y = sca.nextInt();
				int d = sca.nextInt();
				int c = sca.nextInt();
				
				D[y][x] = D[x][y] = d;
				C[y][x] = C[x][y] = c;
			}
            
            start();
        }
        
    }
}
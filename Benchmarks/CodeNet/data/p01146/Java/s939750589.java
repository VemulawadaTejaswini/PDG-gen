import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			int k = sc.nextInt();
			int a = sc.nextInt();
			int h = sc.nextInt();
			if(n == 0 && m == 0 && l == 0 && k == 0 && a == 0 && h == 0)break;
			else calc(n, m, l, k, a, h);
			
		}
	}
	public void calc(int n, int m, int l, int k, int a, int h){
		int[] freezeTown = new int[n];
		int[][] roads = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				roads[i][j] = Integer.MAX_VALUE;
			}
		}
		for(int i = 0; i < l; i++){
			int town = sc.nextInt();
			freezeTown[town] = 1;
		}
		freezeTown[a] = 1;
		freezeTown[h] = 1;
		for(int i = 0; i < k; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int t = sc.nextInt();
			roads[x][y] = t;
			roads[y][x] = t;
		}
		
		//ワーシャるフロイド
		for(int t = 0; t < n; t++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					int pk;
					if(roads[i][t] == Integer.MAX_VALUE || roads[t][j] == Integer.MAX_VALUE) 
						pk = Integer.MAX_VALUE;
					else pk = roads[i][t] + roads[t][j];
					
					if(pk < roads[i][j]) roads[i][j] = pk;
				}
			}
		}
		
		int[][] p = new int[n][n];
		
		//初期化
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(freezeTown[i] == 1 && freezeTown[j] == 1 && roads[i][j] <= m){
					p[i][j] = roads[i][j];
				}
				else p[i][j] = Integer.MAX_VALUE;
			}
		}
		
		//ワーシャルフロイドもういっちょ
		for(int t = 0; t < n; t++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					int pk;
					if(p[i][t] == Integer.MAX_VALUE || p[t][j] == Integer.MAX_VALUE)
						pk = Integer.MAX_VALUE;
					else pk = p[i][t] + p[t][j];
					
					if(pk < p[i][j]) p[i][j] = pk;	
				}
			}
		}
		if(p[a][h] == Integer.MAX_VALUE) System.out.println("Help!");
		else {
			int pk = p[a][h];
			if(pk > m) pk = pk + p[a][h] - m;
			System.out.println(pk);
		}
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}
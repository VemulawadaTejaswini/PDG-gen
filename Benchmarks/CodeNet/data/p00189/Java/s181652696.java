import java.util.Scanner;



public class Main {
	
	int d[];
	boolean used[];
	int g[][];
	final int INF = 1 << 28;
	
	int die(int s, int n){
		used = new boolean[n];
		d = new int[n];
		for(int j=0; j<n; ++j){ d[j] = INF; }
		
		d[s] = 0;
		while(true){
			int u = -1;
			for(int v=0; v<n; ++v){
				if(!used[v] && (u==-1 || d[v] < d[u])){
					u = v;
				}
			}
			if(u==-1){ break; }
			used[u] = true;
			for(int v=0; v<n; ++v){
				if(d[v] > d[u] + g[u][v]){
					d[v] = d[u] + g[u][v];
				}
			}
		}
		int val = 0;
		for(int i=0; i<n; ++i){
			val += d[i];
		}
		return val;
	}
	
	void io(){
		java.util.Scanner sc = new Scanner(System.in);
		while(true){
			int max = 0;	//町の数最大値
			g = new int[10][10];
			for(int i=0; i<10; ++i){
				for(int j=0; j<10; ++j){
					g[i][j] = i==j ? 0 : INF;
				}
			}
			final int n = sc.nextInt();
			for(int i=0; i<n; ++i){
				final int a = sc.nextInt();  final int b = sc.nextInt();  final int c = sc.nextInt();
				g[a][b] = c;
				g[b][a] = c;
				if(max < a+1){
					max = a+1;
				}
				if(max < b+1){
					max = b+1;
				}
			}
			
			
			int min = INF;
			int num = -1;
			for(int i=0; i<max; ++i){
				
				int res = die(i, max);
				if(res < min){
					min = res;
					num = i;
				}
			}
			System.out.println(num + " " + min);
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
}
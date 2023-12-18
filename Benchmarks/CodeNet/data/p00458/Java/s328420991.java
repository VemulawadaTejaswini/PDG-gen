import java.util.*;


public class Main {
	//template
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		new Main().aoj0532();
		new Main().aoj0535();
	}

	int min(int[] arr){
		int ret = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(ret>arr[i])ret = arr[i];
		}
		return ret;
	}
	
	int max(int[] arr){
		int ret = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(ret<arr[i])ret = arr[i];
		}	
		return ret;
	}
	
	int sum(int[] array){
		int sum = 0;
		for(int v : array){
			sum += v;
		}
		return sum;
	}
	
	
	//--------------------------
	
	void aoj0532(){
		for(int i = 0; i < 3; i++){
			int in = sc.nextInt()*60*60+sc.nextInt()*60+sc.nextInt();
			int out = sc.nextInt()*60*60+sc.nextInt()*60+sc.nextInt();
			int diff = out - in;
			
			int h = diff/(60*60);
			diff -= h*60*60;
			int m = diff/60;
			diff -= m*60;
			int s = diff;
			
			System.out.println(h+" "+m+" "+s);
		}
	}
	
	void aoj0533(){
		int[] wp = new int[10];
		int[] kp = new int[10];
		for(int i=0; i<10; i++){ wp[i] = sc.nextInt(); }
		for(int i=0; i<10; i++){ kp[i] = sc.nextInt(); }
		
		Arrays.sort(wp); Arrays.sort(kp);
		System.out.println((wp[9]+wp[8]+wp[7]) + " " + (kp[9]+kp[8]+kp[7]));
	}
	
	
	int aoj0535_dfs(int[][] f, int y, int x, int n, int m){
		int[] dxs = {1, 0, -1, 0};
		int[] dys = {0, 1, 0, -1};
		
		int mx = -1;
		for(int i=0; i<4; i++){
			int dx = x+dxs[i], dy = y+dys[i];
			if (0 <= dx && dx < m && 0 <= dy && dy < n){
				if (f[dy][dx] == 1){
					f[dy][dx] = 0;
					int v = aoj0535_dfs(f, dy, dx, n, m);
					if (v > mx) mx = v;
					f[dy][dx] = 1;
				}
			}
		}
		
		return mx + 1;
	}
	void aoj0535(){
		while(true){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[][] field = new int[n][m];
			
			if (m==0 && n==0) break;
			
			//in
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
//					System.out.println(i + " " + j);
					field[i][j] = sc.nextInt();
				}
			}
			
			int mx = 0;
			for(int i=0; i<n; i++) { //i=y
				for(int j=0; j<m; j++) { //j=x
					if(field[i][j] == 1){
						int v = aoj0535_dfs(field, i, j, n, m); //その座標からたどれる区画数
						if (v > mx) mx = v;
					}
				}
			}
			System.out.println(mx);
		}
	}
	
}
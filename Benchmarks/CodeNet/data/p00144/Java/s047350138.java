import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, r, k, p;
	static int[][] router, packet;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		n = sc.nextInt();
		router = new int[n+1][n+1];
		for(int[] init : router)Arrays.fill(init, 1<<29);
		for(int i = 0; i < n; i++){
			r = sc.nextInt();
			k = sc.nextInt();
			for(int j = 0; j < k; j++){
				int t = sc.nextInt();
				router[r][t] = 1;
			}
		}
		p = sc.nextInt();
		packet = new int[p+1][3];
		for(int i = 1; i <= p; i++){
			for(int j = 0; j < 3; j++){
				packet[i][j] = sc.nextInt();
			}
		}
		return true;
	}
	
	static void solve(){
		for(int k = 1; k <= n; k++){
			for(int i = 1; i <= n; i++){
				for(int j = 1; j <= n; j++){
					router[i][j] = Math.min(router[i][j], router[i][k] + router[k][j]);
				}
			}
		}
		for(int i = 1; i <= p; i++){
			int source = packet[i][0];
			int destination = packet[i][1];
			int TTL = packet[i][2];
			if( router[ source ][ destination ] < TTL ){
				System.out.println(router[ source ][ destination ]+1);
			}else{
				System.out.println("NA");
			}
		}
	}
}
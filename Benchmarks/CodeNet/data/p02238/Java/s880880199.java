import java.util.Scanner;

public class Main {
	int t = 1;
	int[] in;
	int[] out;
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			in = new int[n];
			out = new int[n];
			calc(n);
		}
		
	}
	public void calc(int n){
		int[][] gyouretsu = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				gyouretsu[i][j] = 0;
			}
		}
		for(int i = 0; i < n; i++){
			int u = sc.nextInt();
			int k = sc.nextInt();
			for(int j = 0; j < k; j++){
				int v = sc.nextInt();
				gyouretsu[u-1][v-1] = 1;
			}
		}
		
		for(int i = 0; i < n; i ++){
			in[i] = 0;
			out[i] = 0;
		}
		
			for(int i = 0; i < n; i++){
				if(in[i] == 0)  rec(gyouretsu, in, out, i);
			}
			
		for(int i = 0; i < n; i++){
			System.out.println(i+1 + " " + in[i] + " " + out[i]);
		}
	}
	public void rec(int[][] gyouretsu, int[] in, int[] out, int now){
		in[now] = t;
		t = t + 1;
		for(int i = 0; i < gyouretsu[now].length; i++){
			if(gyouretsu[now][i] == 1){
				if(in[i] == 0){
					rec(gyouretsu, in, out, i);
				}
			}
		}
		out[now] = t;
		t = t + 1;
	}
	public static void main(String[] args) {
		new Main().run();
	}
}
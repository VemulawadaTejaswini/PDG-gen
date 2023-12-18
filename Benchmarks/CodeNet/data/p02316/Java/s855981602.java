package aoj;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().start();
	}
	boolean[][] done;
	int[][] memo;
	int[]vs,ws;
	int N;
	void start(){
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		final int W = in.nextInt();
		done = new boolean[N+1][W+1];
		memo = new int[N+1][W+1];
		vs = new int[N];
		ws = new int[N];
		for(int i = 0; i < N;i++){
			vs[i] = in.nextInt();
			ws[i] = in.nextInt();
		}
		System.out.println(getValue(0,W));
		in.close();
	}
	int getValue(int i, int u){
		if(done[i][u])return memo[i][u];
		int res = 0;
		if(i == N){

		}else if(u < ws[i]){
			res = getValue(i+1,u);
		}else{
			int res1 = getValue(i+1,u);
			int res2 = getValue(i+1,u-ws[i])+vs[i];
			res = max(res1,res2);
		}
		done[i][u] = true;
		memo[i][u] = res;
		return res;
	}
	int max(int a, int b){
		return a > b ? a : b;
	}


}
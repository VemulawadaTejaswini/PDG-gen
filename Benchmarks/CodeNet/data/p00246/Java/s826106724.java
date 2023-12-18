import java.util.Arrays;
import java.util.Scanner;

//Bara-Bara Manju
public class Main{
	
	int res, num, ID;
	int[][] div;
	int[] c, u;
	
	void f(int k, int rest){
		if(rest==0){
			for(int i=1;i<10;i++)div[ID][i] = u[i];
			ID++;
			return;
		}
		if(k<=0)return;
		for(int use=0;use*k<=rest;use++){
			u[k] = use;
			f(k-1, rest-use*k);
			u[k] = 0;
		}
	}
	
	void dfs(int k, int num){
		res = Math.max(res, num);
		if(k==ID)return;
		int t = 1000;
		for(int i=1;i<10;i++)if(div[k][i]>0)t = Math.min(t, c[i]/div[k][i]);
		for(int use=0;use<=t;use++){
			for(int i=1;i<10;i++)c[i]-=use*div[k][i];
			dfs(k+1, num+use);
			for(int i=1;i<10;i++)c[i]+=use*div[k][i];
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		div = new int[50][11];
		u = new int[11];
		f(9, 10);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			c = new int[11];
			for(int i=0;i<n;i++)c[sc.nextInt()]++;
			int g = c[5]/2;
			c[5]%=2;
			for(int i=6;i<10;i++){
				int t = Math.min(c[i], c[10-i]);
				g+=t;
				c[i]-=t;
				c[10-i]-=t;
			}
			res = 0;
			dfs(0, g);
			System.out.println(res);
		}
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
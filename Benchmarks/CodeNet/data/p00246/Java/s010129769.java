import java.util.Arrays;
import java.util.Scanner;

//Bara-Bara Manju
public class Main{

	int[] c, u, limit, tmp;
	int res;
	
	boolean f(int x, int rest){
		if(rest<0)return false;
		if(rest==0)return true;
		for(int i=Math.min(x, rest);i>0;i--)if(c[i]-u[i]>0){
			u[i]++;
			int nx = rest-i;
			if(rest==10 && i>=5)nx--;
			if(f(i, nx))return true;
			u[i]--;
		}
		return false;
	}
	
	int greedy(){
		Arrays.fill(u, 0);
		int ret = 0;
		while(f(9, 10)){
			for(int i=1;i<=9;i++)c[i]-=u[i];
			Arrays.fill(u, 0);
			ret++;
		}
		return ret;
	}
	
	void dfs(int k, int sum){
		if(k==10){
			for(int i=1;i<=9;i++)tmp[i]=c[i];
//			debug(c);
			int g = greedy();
//			System.out.println("SUM:"+sum+" G:"+g);
//			debug(c);
			res = Math.max(res, sum+g);
			for(int i=1;i<=9;i++)c[i]=tmp[i];
			return;
		}
		for(int i=limit[k];i>=0;i--){
			c[k]-=i;
			c[10-k]-=i;
			dfs(k+1, sum+i);
			c[k]+=i;
			c[10-k]+=i;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			c = new int[11];
			limit = new int[11];
			u = new int[11];
			tmp = new int[11];
			for(int i=0;i<n;i++)c[sc.nextInt()]++;
//			debug(c);
//			System.out.println(greedy());
			limit[5] = c[5]/2;
			for(int i=6;i<=9;i++)limit[i] = Math.min(c[i], c[10-i]);
			dfs(5, 0);
//			debug(c);
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
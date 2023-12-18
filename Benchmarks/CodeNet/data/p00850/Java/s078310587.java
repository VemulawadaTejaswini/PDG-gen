import java.util.Arrays;
import java.util.Scanner;

//Power Calculus
public class Main{

	int n;
	int[] k;
	boolean[] u;

	boolean reach(long b, long x, int rest){
		long r = b+x;
		while(rest--!=0)r+=r;
		return n<=r;
	}

	boolean dfs(int d, int x, int max, int len){
		if(d==0){
			return u[n];
		}
		if(d==1){
			return u[Math.abs(x-n)];
		}
//		if(!reach(x, max, d))return false;
		for(int i=len-1;i>=0;i--){
			int s = k[i]+x;
			if(!(2*n<s||u[s]||!reach(s, Math.max(max, s), d-1))){
				if(d!=1||u[Math.abs(s-n)]){
					u[s] = true;
					k[len] = s;
					if(dfs(d-1, s, Math.max(max, s), len+1))return true;
					u[s] = false;
				}
			}
			s = x-k[i];
			if(!(s<0||!reach(s, max, d-1)||u[s])){
				if(d!=1||u[Math.abs(s-n)]){
					u[s] = true;
					k[len] = s;
					if(dfs(d-1, s, max, len+1))return true;
					u[s] = false;
				}
			}
			s = k[i] - x;
			if(!(s<0||!reach(s, max, d-1)||u[s])){
				if(d!=1||u[Math.abs(s-n)]){
					u[s] = true;
					k[len] = s;
					if(dfs(d-1, s, max, len+1))return true;
					u[s] = false;
				}
			}
		}
		return false;
	}

	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}

	void run(){
//		long T = System.currentTimeMillis();
//		for(n=1;n<=1000;n++){
//			long t = System.currentTimeMillis();
//			int x = 1, res = 0;
//			while(x<n){
//				x*=2; res++;
//			}
//			for(;;){
//				u = new boolean[2500];
//				k = new int[res+1];
//				u[1] = true;
//				k[0] = 1;
//				if(dfs(res, 1, 1, 1)){
//					System.out.println("N:"+n+" ANS:"+res+" Time:"+(System.currentTimeMillis()-t)); break;
//				}
//				res++;
//			}
//		}
//		System.out.println("Time:"+(System.currentTimeMillis()-T));
				Scanner sc = new Scanner(System.in);
				for(;;){
					n = sc.nextInt();
					if(n==0)break;
					int x = 1, res = 0;
					while(x<n){
						x*=2; res++;
					}
					for(;;){
						u = new boolean[2500];
						k = new int[res+1];
						u[1] = true;
						k[0] = 1;
						if(dfs(res, 1, 1, 1)){
							System.out.println(res); break;
						}
						res++;
					}
				}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
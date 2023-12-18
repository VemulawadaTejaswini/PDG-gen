import java.util.Scanner;

public class Main {
	static final double ESP = 0.0000000001;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int Q = in.nextInt();
		long[][] obs = new long[N][5];
		for(int i=0;i<N;i++){
			for(int j=0;j<5;j++){
				obs[i][j] = in.nextLong();
			}
		}
		
		for(int k=0;k<Q;k++){
			long ans = 0;
			int[] start = {in.nextInt(),in.nextInt(),in.nextInt()};
			int[] goal = {in.nextInt(),in.nextInt(),in.nextInt()};
			for(int i=0;i<N;i++){
//				System.out.println("l: "+obs[i][3]*obs[i][3]);
				if(dis_p2(start,goal,obs[i]) < obs[i][3]*obs[i][3]+ESP){
					ans += obs[i][4];
				}
			}
			System.out.println(ans);
		}
	}
	
	public static double dis_p2(int[] s,int[] g,long[] p){
		double[] h = new double[3];
		long[] sg = {g[0]-s[0],g[1]-s[1],g[2]-s[2]};
		long[] sp = {p[0]-s[0],p[1]-s[1],p[2]-s[2]};
		double exp = ((double)(sg[0]*sp[0] + sg[1]*sp[1] + sg[2]*sp[2]))
				/ (sg[0]*sg[0] + sg[1]*sg[1] + sg[2]*sg[2]);
		if(exp<0 || exp>1) return Double.MAX_VALUE;
		h[0] = s[0] + exp*sg[0];
		h[1] = s[1] + exp*sg[1];
		h[2] = s[2] + exp*sg[2];
/*		System.out.println("dis: "+(Math.pow(h[0]-p[0],2)
		+Math.pow(h[1]-p[1],2)
		+Math.pow(h[2]-p[2],2)));*/
		return Math.pow(h[0]-p[0],2)
				+Math.pow(h[1]-p[1],2)
				+Math.pow(h[2]-p[2],2);
	}
}
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		double[][] cost = new double[n][n];
		for(int i=0;i<n;i++) Arrays.fill(cost[i], -1);
		double all = 0;
		for(int j=0;j<m;j++){
			int p = sc.nextInt()-1;
			int q = sc.nextInt()-1;
			double c = Math.sqrt((y[p]-y[q])*(y[p]-y[q])+(x[p]-x[q])*(x[p]-x[q]));
			cost[p][q] = c;
			cost[q][p] = c;
			all += c;
		}
	
		boolean[] f = new boolean[n];
		double sum = 0;
		int r = 0;
		while(true){
			boolean flag = false;
			for(int i=0;i<n;i++){
				if(!f[i]){
					f[i] = true;
					flag = true;
					break;
				}
			}
			if(flag==false) break;

			while(true){
				double t = -1;
				for(int i=0;i<n;i++){
					if(f[i]){
						for(int j=0;j<n;j++){
							if(!f[j] && t<cost[i][j]){
					  			t = cost[i][j];
								r = j;
							}
						}
					}
				}
				if(t==-1) break;
				f[r] = true;
				sum += t;
			}
		}
		System.out.println(all-sum);
	}
	
}
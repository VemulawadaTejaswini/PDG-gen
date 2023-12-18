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
		for(int i=0;i<n;i++) Arrays.fill(cost[i], 0);
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
		ArrayList<Integer> list = new ArrayList<Integer>();
		double sum = 0;
		int s;
		int r = 0;
		double t;
		while(true){
			boolean flag = false;
			for(int i=0;i<n;i++){
				if(!f[i]){
					list = new ArrayList<Integer>();
					list.add(i);
					f[i] = true;
					flag = true;
					break;
				}
			}
			if(flag==false) break;
			
			for(int i=1;i<n;i++){
				t = 0;
				for(int j=0;j<i;j++){
					s = list.get(j);
					for(int k=0;k<n;k++){
						if(list.contains(k)==false && t<cost[s][k]){
			  				t = cost[s][k];
							r = k;
						}
					}
				}
				list.add(r);
				f[r] = true;
			 	sum += t;
			}
		}
		System.out.println(all-sum);
	}
	
}
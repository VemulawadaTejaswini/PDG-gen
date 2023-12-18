import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int[][] e = new int[n][4];
		long sum = 0;
		for(int i=0;i<n;i++){
			e[i][0] = sc.nextInt();
			e[i][1] = sc.nextInt() - c;
			e[i][2] = b - sc.nextInt();
			e[i][3] = sc.nextInt();
			sum += e[i][1];
		}
		Arrays.sort(e, new Comparator<int[]>(){
			public int compare(int[] o1, int[] o2) {
				return o2[3] - o1[3];
			}
		});
		
		double[][] f = new double[n][2];
		int g;
		for(int i=0;i<n;i++){
			g = e[i][0]/e[i][2];
			if(e[i][0]%e[i][2]!=0) g++;
			f[i][0] = i;
			f[i][1] = (double)e[i][1]/g;
		}
		Arrays.sort(f, new Comparator<double[]>(){
			public int compare(double[] o1, double[] o2) {
				if(o2[1]-o1[1]>0) return 1;
				else return -1;
			}
		});
		
		long dmg = 0;
		int p = -1;
		int cnt = 0;
		for(int i=0;i<n;i++){
			if(e[i][3]<=d) break;
			dmg += e[i][1];
		}
		
		while(true){
			g = (int)f[cnt][0];
			e[g][0] -= e[g][2];
			if(e[g][0]<=0){
				cnt++;
				sum -= e[g][1];
			}
			if(cnt==n){
				System.out.println(dmg);
				break;
			}
			dmg += sum;
			if(dmg>=a){
				System.out.println(-1);
				break;
			}
		}		
	}	
}
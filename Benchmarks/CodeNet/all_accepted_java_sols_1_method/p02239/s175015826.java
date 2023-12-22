import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		boolean[][] judg = new boolean[n+1][n+1];
		for(int i=0;i<n+1;i++){
			Arrays.fill(judg[i],false);
		}
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<2;i++){
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0;i<n;i++){
			int u = stdIn.nextInt();
			int k = stdIn.nextInt();
			for(int j=0;j<k;j++){
				int v = stdIn.nextInt();
				judg[u][v] = true;
			}
		}
		
		int[] d = new int[n+1];
		Arrays.fill(d,-1);
		d[1] = 0;
		
		for(int i=0;i<n;i++){
			for(int k=1;k<=n;k++){
				if(d[k]==i){
					for(int j=1;j<=n;j++){
						if(judg[k][j] && d[j]==-1){
							d[j] = d[k] + 1;
						}
					}
				}
			}
		}
		
		for(int i=1;i<=n;i++){
			System.out.println(i+" "+d[i]);
		}
	}
}
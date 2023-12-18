import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			double[][] cost = new double[n][n];
			for(int i=0;i<n;i++){
				Arrays.fill(cost[i], Integer.MAX_VALUE);
				cost[i][i] = 0;
			}
			
			int[] id = new int[n];
			int[] x = new int[n];
			int[] y = new int[n];
			double p;
			for(int i=0;i<n;i++){
				id[i] = sc.nextInt();
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				for(int j=i-1;j>=0;j--){
					p = Math.sqrt((x[i]-x[j])*(x[i]-x[j]) + (y[i]-y[j])*(y[i]-y[j]));
					if(p<=50){
						cost[i][j] = p;
						cost[j][i] = p;
					}
				}
			}

			
			int m = sc.nextInt();
			int s = -1;
			int g = -1;
			for(int z=0;z<m;z++){
				int ins = sc.nextInt();
				int ing = sc.nextInt();
				for(int i=0;i<n;i++){
					if(id[i]==ins) s = i;
					if(id[i]==ing) g = i;
				}
				
				ArrayDeque<Integer> que = new ArrayDeque<Integer>();
				int[] path = new int[n];
				Arrays.fill(path, -1);
				double[] min = new double[n];
				Arrays.fill(min, Integer.MAX_VALUE);
				que.offer(s);
				min[s] = 0;
				while(que.size()!=0){
					int q = que.poll();
					for(int i=0;i<n;i++){
						if(cost[i][q]!=Integer.MAX_VALUE && min[i] > min[q] + cost[i][q]){
							min[i] = min[q] + cost[i][q];
							path[i] = q;
							que.offer(i);
						}
					}
				}
				
				LinkedList<Integer> list = new LinkedList<Integer>();

				int h;
				boolean flag = false;
				while(g!=s){
					if(g==-1){
						flag = true;
						break;
					}
					list.push(path[g]);
					h = path[g];
					g = h;
				}
				if(flag==true) System.out.println("NA");
				else{
					while(list.size()!=0)  System.out.print(id[list.pollFirst()] + " ");
					System.out.println(ing);
				}
			}
		}	
	}	
}
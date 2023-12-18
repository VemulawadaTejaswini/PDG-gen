
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int c=cin.nextInt();
			int n=cin.nextInt();
			int m=cin.nextInt();
			int start=cin.nextInt();
			int goal=cin.nextInt();
			if(c+n+m+start+goal==0){
				break;
			}
			int[][] cost=new int[n+1][n+1];
			for(int i=0;i<m;i++){
				int a=cin.nextInt();
				int b=cin.nextInt();
				cost[a][b]=cost[b][a]=cin.nextInt();
			}
			PriorityQueue<int[]> q=				new PriorityQueue<int[]>(10000,new Comparator<int[]>(){

				public int compare(int[]a,int[]b){
					return a[1]-b[1];
				}
			});
			boolean[][] already=new boolean[n+1][c+1];
			q.add(new int[]{start,0,0});
			int ans=1<<30;
			while(!q.isEmpty()){
				int a=q.peek()[0];
				int cc=q.peek()[1];
				int num=q.poll()[2];
//				System.out.println(a+" "+cc+" "+num);
				if(already[a][num])continue;
				already[a][num]=true;
				if(a==goal){
					ans=Math.min(ans, cc);
					continue;
				}
				for(int i=0;i<=n;i++){
					if(cost[a][i]>0&&!already[i][num]){
						q.add(new int[]{i,cc+cost[a][i],num});
						if(num<c){
							q.add(new int[]{i,cc+(cost[a][i])/2,num+1});
						}
					}
				}
			}
			System.out.println(ans);
		}

	}

}
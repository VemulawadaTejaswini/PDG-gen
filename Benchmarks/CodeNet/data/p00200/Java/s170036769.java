
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
			int line=cin.nextInt();
			int n=cin.nextInt();
			if(line==0)break;
			int[][][] cost=new int[n+1][n+1][2];
			for(int i=0;i<line;i++){
				int a=cin.nextInt();
				int b=cin.nextInt();
				int c=cin.nextInt();
				int t=cin.nextInt();
				cost[a][b][0]=cost[b][a][0]=c;
				cost[a][b][1]=cost[b][a][1]=t;
			}
			for(int i=0;i<=n;i++){
				for(int j=0;j<=n;j++){
//					System.out.print(cost[i][j][0]+" ");
				}
//				System.out.println();
			}
			for(int k=cin.nextInt();k--!=0;){
				MyComparator comparator = new MyComparator();
				PriorityQueue<int[]> q = new PriorityQueue<int[]>(10000,comparator);
				int start=cin.nextInt();
				int goal=cin.nextInt();
				int type=cin.nextInt();
				boolean[]already=new boolean[n+1];
				q.add(new int[]{start,0});
				while(!q.isEmpty()){

					int[] array=q.poll();
					int a=array[0];
					int c=array[1];
//					System.out.println(a+" "+c);
					if(already[a])continue;
					already[a]=true;
					if(a==goal){
						System.out.println(c);
						break;
					}
					for(int i=0;i<=n;i++){
						if(cost[a][i][type]>0&&!already[i]){
							//						int[] next={i,c+cost[a][i][type]};
							q.add(new int[]{i,c+cost[a][i][type]});
							//						q.add(next);

						}
					}
				}
			}

		}
	}
	static class MyComparator implements Comparator<int[]>{

		public int compare(int[] a, int[]b ){
			return a[1]-b[1];
		}

	}

}
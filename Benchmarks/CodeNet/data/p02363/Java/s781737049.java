import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int v=sc.nextInt();
			int e=sc.nextInt();
			int[][] cost=new int[v][v];
			int INF=100000000;
			for(int i=0; i<v; i++) {
				for(int j=0; j<v; j++) {
					cost[i][j]=(i==j)? 0:INF;
				}
			}
			
			for(int i=0; i<e; i++) {
				int s=sc.nextInt();
				int t=sc.nextInt();
				int d=sc.nextInt();
				cost[s][t]=d;
			}
			boolean minor=false;
			for(int k=0; k<v; k++) {
				for(int i=0; i<v; i++) {
					for(int j=0; j<v; j++) {
						if(cost[i][j]>cost[i][k]+cost[k][j] && cost[i][k]!=INF && cost[k][j]!=INF)
						cost[i][j]=Math.min(cost[i][j], cost[i][k]+cost[k][j]);
						//System.out.println("cost["+i+"]["+k+"]="+cost[i][k]+" cost["+k+"]["+j+"]="+cost[k][j]);
						//System.out.println("cost["+i+"]["+j+"]="+cost[i][j]);
					}
					if(cost[i][i]<0) minor=true;
				}
			}
			if(minor) System.out.println("NEGATIVE CYCLE");
			else {
				for(int i=0; i<v; i++) {
					for(int j=0; j<v; j++) {
						if(j>0) System.out.print(" ");
						System.out.print((cost[i][j]>=INF)? "INF":cost[i][j]);
					}
					System.out.println();
				}
			}
			
		}
	}
}

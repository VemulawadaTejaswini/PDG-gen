import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOj0144().doIt();
	}
	
	class AOj0144{
		int n,d[][];
		
		void print(){
			for(int i=1;i<=n;i++){
				System.out.print(i+": ");for(int s=1;s<=n;s++)System.out.printf("%7d ",d[i][s]);
				System.out.println();
			}
		}
		
		void doIt(){
			n = Integer.parseInt(in.nextLine());			
			d = new int[n+1][n+1];
			for(int i=0;i<=n;i++)Arrays.fill(d[i],100000);
			for(int i=0;i<n;i++)d[i][i] = 0;
			for(int i=0;i<n;i++){
				int num = in.nextInt();
				int w = in.nextInt();
				for(int s=0;s<w;s++)d[num][in.nextInt()] = 1;
			}
			for(int k=1;k<=n;k++)for(int i=1;i<=n;i++)for(int j=1;j<=n;j++){
				d[i][j] = Math.min(d[i][j],d[i][k]+d[k][j]);
			}
			
//			print();
			
			int packet = in.nextInt();
			for(int s=0;s<packet;s++){
				int start = in.nextInt();
				int end = in.nextInt();
				int ttl = in.nextInt();
				if(d[start][end]==100000||d[start][end]>=ttl)System.out.println("NA");
				else System.out.println(d[start][end]+1); 
			}
		}
		
	}
}
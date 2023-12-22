import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),link[][]=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				link[i][j]=Integer.parseInt(in.next());
			}
		}
		
		int visit[]=new int[n],parent[]=new int[n],d[]=new int[n];
		List<Integer> G=new ArrayList<>();
		for(int i=0;i<n;i++) {
			parent[i]=-1; d[i]=Integer.MAX_VALUE;
		}
		d[0]=0;
		
		while(true) {
			int u=-1,min=Integer.MAX_VALUE;
			
			for(int i=0;i<n;i++) {
				if(visit[i]<2 && d[i]<min) {
					min=d[i];
					u=i;
				}
			}
			
			if(u==-1)break;
			visit[u]=2;
			
			for(int i=0;i<n;i++) {
				if(visit[i]<2 && link[u][i]>=0 && link[u][i]<d[i]) {
					d[i]=link[u][i];
					parent[i]=u;
					visit[i]=1;
				}
			}
		}
		
		int sum=0;
		for(int i=0;i<n;i++) {
//			System.out.print(d[i]+" ");
			if(d[i]!=Integer.MAX_VALUE)sum+=d[i];
		}
		System.out.println(sum);
	}

}


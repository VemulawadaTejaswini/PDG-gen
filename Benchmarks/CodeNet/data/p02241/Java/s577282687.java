import java.util.Scanner;

public class Main {
	private final static int WHITE=0;
	private final static int BLACK=1;
	private static int[][] mat;
	private static int n;

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int i,j;
		n=sc.nextInt();
		mat = new int[n][n];
		for(i=0;i<n;i++){
			for (j=0;j<n;j++){
				mat[i][j]=sc.nextInt();
				if(mat[i][j]==-1) mat[i][j]=Integer.MAX_VALUE;
			}
		}
		System.out.println(Prim());
	}

	public static int Prim(){
		int sum=0;
		int u,min,i,j;
		int[] d=new int[100];
		int[] p=new int[100];
		int[] color=new int[100];
		for(i=0;i<n;i++){
			d[i]=Integer.MAX_VALUE;
			p[i]=-1;
			color[i]=WHITE;
		}
		d[0]=0;
		while(true){
			min=Integer.MAX_VALUE;
			u=-1;
			for(i=0;i<n;i++){
				if(min>d[i] && color[i]!=BLACK){
					u=i;
					min=d[i];
				}
			}
			if(u==-1) break;
			color[u]=BLACK;
			for(j=0;j<n;j++){
				if(color[j]!=BLACK && mat[u][j]!=Integer.MAX_VALUE){
					if(d[j]>mat[u][j]){
						d[j]=mat[u][j];
						p[j]=u;
					}
				}
			}
		}
		for(i=0;i<n;i++) if(p[i]!=-1) sum+=mat[i][p[i]];
		return sum;
	}
}
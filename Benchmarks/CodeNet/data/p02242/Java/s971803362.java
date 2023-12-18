import java.util.Scanner;

public class Main{
static int n;
static int[] check;//checked ->1,yet-> 0checking->2
static int[][] m;
final static int MAX=100; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i,j,k,u,v;
     Scanner sca=new Scanner(System.in);
     m=new int[MAX][MAX];
     n=sca.nextInt();
     for(i=0;i<n;i++){
    	 for(j=0;j<n;j++){
    		 m[i][j]=-1;
    	 }
     }
     for(i=0;i<n;i++){
    	 u=sca.nextInt();
    	 k=sca.nextInt();
    	 for(j=0;j<k;j++){
    		 v=sca.nextInt();
    		 m[u][v]=sca.nextInt();
    	 }
     }
     dijkstra();
	}
	public static void dijkstra(){
		int i,u,min;
		int d[]= new int[MAX];
		check=new int[MAX];
		for(i=0;i<n;i++){
			d[i]=Integer.MAX_VALUE;
		}
		d[0]=0;
		check[0]=2;
		while(true){
			min=Integer.MAX_VALUE;
			u=-1;
			for(i=0;i<n;i++){
				if(min>d[i]&&check[i]!=1){
					u=i;
					min=d[i];
				}
			}
			if(u==-1)break;//finished
			check[u]=1;
			for(i=0;i<n;i++){
				if(check[i]!=1&&m[u][i]!=-1){
					if(d[i]>m[u][i]+d[u]){
						d[i]=m[u][i]+d[u];
						check[i]=2;
					}
				}
			}
		}
		for(i=0;i<n;i++){
			if(d[i]==Integer.MAX_VALUE)d[i]=-1;
			System.out.println(i+" "+d[i]);
		}
	}
}


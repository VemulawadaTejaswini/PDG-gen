import java.util.Scanner;

public class Main {
static int n;
static int[] check;//checked ->1,yet-> 0checking->2
static int[][] m;
final static int MAX=100; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i,j;
     Scanner sca=new Scanner(System.in);
     m=new int[MAX][MAX];
     n=sca.nextInt();
     for(i=0;i<n;i++){
    	 for(j=0;j<n;j++){
    		 m[i][j]=sca.nextInt();
    	 }
     }
     System.out.println(prim());
	}
	public static int prim(){
		int i,u,min,sum=0;
		int d[]= new int[MAX];
		int  p[]=new int[MAX];
		check=new int[MAX];
		for(i=0;i<n;i++){
			d[i]=Integer.MAX_VALUE;
			p[i]=-1;
		}
		d[0]=0;
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
					if(d[i]>m[u][i]){
						d[i]=m[u][i];
						p[i]=u;
						check[i]=2;
					}
				}
			}
		}
		sum=0;
		for(i=0;i<n;i++){
			if(p[i]!=-1)sum+=m[i][p[i]];
		}
		return sum;
	}
}



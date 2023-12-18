import java.util.*;
public class Graph{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int u,k;
	int[][] a=new int[n][n];
	for(int i=0;i<n;i++){
	    u=sc.nextInt();
	    k=sc.nextInt();
	    int[] v=new int[k];
	    for(int j=0;j<k;j++){
		v[j]=sc.nextInt();
		a[i][v[j]-1]=1;
	    }
	}
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
		if(j!=n-1){
		    System.out.print(a[i][j]+" ");
		}else{
		    System.out.println(a[i][j]);
		}
	    }
	}
    }
}

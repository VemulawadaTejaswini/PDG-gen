import java.util.Scanner;



public class Main {


  public static void main(String[] args) {

	  Scanner sc=new Scanner(System.in);
	  int n=Integer.parseInt(sc.next());
	 int a[][]=new int[n+1][n+1];
	 
	 for(int i=0;i<n+1;i++){
	for(int j=0;j<n+1;j++){	 
	 a[i][j]=0;
	}
	
	 }
	  for(int i=1;i<=n;i++){
		  int u=Integer.parseInt(sc.next());
		  int k=Integer.parseInt(sc.next());
		  for(int j=1;j<=k;j++){
			  int v=Integer.parseInt(sc.next());
		  a[i][v]=1;
		  }
	  }
	  
	  for(int i=1;i<=n;i++){
		  for(int j=1;j<=n;j++){
			  System.out.print(a[i][j]);
			  System.out.print((j==n) ? "\n" : " ");
		  }
	  }
	  
	 
  }
}
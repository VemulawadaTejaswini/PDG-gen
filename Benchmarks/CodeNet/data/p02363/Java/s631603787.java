import java.util.*;

public class Main {
	static long INT=1000000000;
	static long dis[][]=new long[105][105];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      for(int i=0;i<n;i++) {
    	  for(int j=0;j<n;j++) {
    		  if(i==j) {
    			  dis[i][j]=0;
    		  }else {
    			  dis[i][j]=INT;
    		  }
    	  }
      }
      for(int i=0;i<m;i++) {
    	  int x=sc.nextInt();
    	  int y=sc.nextInt();
    	  int v=sc.nextInt();
    	  dis[x][y]=v;
      }
      for(int k=0;k<n;k++) {
    	  for(int i=0;i<n;i++) {
    		  if(dis[i][k]==INT) {continue;}
    		  for(int j=0;j<n;j++) {
    			  if(dis[k][j]==INT) {continue;}
    			  dis[i][j]=Math.min(dis[i][j], dis[i][k]+dis[k][j]);
    					  
    		  }
    	  }
      }
      int flag=0;
      for(int i=0;i<n;i++) {
    	  if(dis[i][i]<0) {
    		  flag=1;
    		  break;
    	  }
      }
      if(flag==1) {
    	  System.out.println("NEGATIVE CYCLE");
      }else {
    	  for(int i=0;i<n;i++) {
    		  for(int j=0;j<n;j++) {
    			  if(j!=0) {System.out.print(" ");}
    			  if(dis[i][j]==INT) {
    				  System.out.print("INT");
    			  }else {
    				  System.out.print(dis[i][j]);
    			  }
    		  }
    		  System.out.println();
    	  }
      }
   }
}


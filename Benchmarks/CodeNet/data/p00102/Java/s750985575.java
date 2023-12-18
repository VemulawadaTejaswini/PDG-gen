import java.util.*;

class Main{
   public static void main(String arg[]) throws java.io.IOException{
       Scanner scan =new Scanner (System.in);
    
       while(true){
    	   int n=scan.nextInt();
    	   int sum=0;
    	   int [][] m=new int[n+1][n+1];
    	   for(int i=0;i<n;i++){
    		   for(int j=0;j<n;j++){
    			   sum+=m[i][j]=scan.nextInt();
    		   }
    	   }
    	   for(int i=0;i<n;i++){
    		   for(int j=0;j<n;j++){
    			   m[i][n]+=m[i][j];
    			   m[n][i]+=m[j][i];
    		   }
    	   }
    	   m[n][n]=sum;
    	   
    	   for(int i=0;i<n+1;i++){
    		   for(int j=0;j<n+1;j++){
    			  System.out.printf("%5d",m[i][j]);
    		   }
    		   System.out.println();
    	   }
   
       }
    
}
}
    
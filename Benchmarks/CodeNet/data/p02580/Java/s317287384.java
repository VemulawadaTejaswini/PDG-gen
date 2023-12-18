import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	   // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=1;
	  //  t=sc.nextInt();
	    //int t=Integer.parseInt(br.readLine());
	    while(--t>=0){
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        int k=sc.nextInt();
	        int a[][]=new int[n][m];
	        for(int i=0;i<k;i++){
	            a[sc.nextInt()-1][sc.nextInt()-1]=1;
	        }
	        int row[]=new int[n];
	        int coolumn[]=new int[m];
	        
	        for(int i=0;i<n;i++){
	            int c=0;
	            for(int j=0;j<m;j++){
	                c=c+a[i][j];
	            }
	            row[i]=c;
	            c=0;
	        }
	        for(int i=0;i<m;i++){
	            int c=0;
	            for(int j=0;j<n;j++){
	                c=c+a[j][i];
	            }
	            coolumn[i]=c;
	            c=0;
	        }
	        
	        int max=0;
	        
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                int c=row[i]+coolumn[j];
	                if(a[i][j]==1)
	                c--;
	                max=Math.max(max,c);
	            }
	        }
	        System.out.println(max);
	        
	        
	        
	       //  for(int i=0;i<n;i++)
	      //  System.out.print(arr[i]+" ");
	        
	     
	        
	    }
	    
	}
}
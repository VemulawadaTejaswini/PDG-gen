import java.util.*;
public class Main{


public static void main (String []args)
{
	Scanner scan=new Scanner(System.in);
	//long t=scan.nextLong();
	//long ways[]=new long[1000000000];
	//ways[1]=1;
	//ways[i]=ways[i-1]*2;
	
	//while(t-->0){
         int r=scan.nextInt();
         int c=scan.nextInt();
         char m[][]=new char[r][c];
      //   long v[]=new long[n];
         // int c[]=new int[n];
        // int dp[]=new int[n];
        for(int i=0;i<r;i++)
       {  String str=scan.next();
		   for(int j=0;j<c;j++)
		   m[i][j]=str.charAt(j);
          
            }
       
	long dp[][]=new long[r][c];
		
       
	 for(int i=0;i<r;i++)
	 {for( int j=0;j<c;j++ )
		 { if(m[i][j]!='#')
			{ if(i==0&& j==0)dp[i][j]=1;
			 
			 if(i==0&&j>0)
			 dp[i][j]=dp[i][j-1];
			 if(j==0&&i>0)
			 dp[i][j]=dp[i-1][j];
			 if(i>0&&j>0)
			 dp[i][j]=(dp[i-1][j]+dp[i][j-1])%1000000007;
			 
		    }
			 }   
		}
	
	
         
         System.out.println(dp[r-1][c-1]);
//}//
}
}

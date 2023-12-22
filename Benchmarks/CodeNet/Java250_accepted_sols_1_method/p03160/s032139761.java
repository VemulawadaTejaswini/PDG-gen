import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) throws IOException
	{
	   BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));
	   int n= Integer.parseInt(br.readLine());
	   int arr[]= new int[n];
	   
	   String line=br.readLine();
	   String strs[]=line.trim().split("\\s+");
	   
	   for(int i=0; i<n ;i++)
	   arr[i]=Integer.parseInt(strs[i]);
	   
	   int calc[][]=new int[n][2];
	   calc[0][0]=0;
	   calc[0][1]=0;
	   
	   if(n>1)
	   {
	       calc[1][0]=Math.abs( arr[1]-arr[0] );
	       calc[1][1]=Math.abs( arr[1]-arr[0] );
	   }
	   for(int i=2;i<n ; i++)
	   {
	       calc[i][0]=Math.min(calc[i-1][0] , calc[i-1][1]) + Math.abs(arr[i]- arr[i-1]) ;
	       calc[i][1]=Math.min(calc[i-2][0] , calc[i-2][1]) + Math.abs(arr[i]- arr[i-2]) ;
	   }
	   System.out.println( Math.min( calc[n-1][0] , calc[n-1][1]));
		//code
	}
}
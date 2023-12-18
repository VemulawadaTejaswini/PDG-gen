/* package whatever; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class main
{
	public static void main (String[] args) throws IOException
	{
	  BufferedReader br =new BufferedReader(new 
	  InputStreamReader(System.in));
	  int n=Integer.parseInt(br.readLine());
	  String[] who=new String[n];
	  who=br.readLine().split(" ");
	  int num[]=new int[n];
               int i;
	  for(i=0;i<n;i++){
	  	num[i]=Integer.parseInt(who[i]);
	  }
	  Arrays.sort(num);
	  for(i=0;i<n-1;i++){
	  	System.out.print(num[i]+" ");
	  }
               System.out.println(num[i]);
 	}
}
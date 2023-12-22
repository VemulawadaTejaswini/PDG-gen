import java.util.*;
import java.io.*;

public class Main{
	static PrintWriter out=new PrintWriter(System.out);
	public static void main (String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().trim().split(" ");
		
		
		int a=Integer.parseInt(input[0]);
		int b=Integer.parseInt(input[1]);
		int c=Integer.parseInt(input[2]);
		int k=Integer.parseInt(input[3]);
		
		
		out.println(maxSum(a,b,c,k));
		
		out.flush();
		out.close();
	}
	public static int maxSum(int a,int b,int c,int k)
	{
	   int ans=0;
	   if(a>=k){
	       ans+=k;
	   }
	   else{
	       ans+=a;
	       k-=a;
	       if(b>=k){
	           
	       }
	       else{
	           k-=b;
	           ans-=k;
	       }
	   }
	   return ans;
	}
}
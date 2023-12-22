import java.io.*;
import java.util.*;


public class Main {


	public static void main(String[] args) throws Exception{
		BufferedReader  jk =  new BufferedReader(new InputStreamReader( System.in))  ; 
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)) ; 
		StringTokenizer ana = new StringTokenizer(jk.readLine()) ;
		int n = Integer.parseInt(ana.nextToken()) ; 
		int t[]= new int[n] ; 
		ana = new StringTokenizer(jk.readLine()) ;
		for(int i=0 ; i<n ;i++)
		{
			t[i]= Integer.parseInt(ana.nextToken()) ; 
		}
		int cost[]=new int[n] ; 
		cost[0]=0 ; cost[1]= Math.abs(t[1]-t[0]) ; 
		for(int i=2 ;i<n ;i++)
		{
			int y1 = cost[i-1]+Math.abs(t[i]-t[i-1]) ; 
			int y2 = cost[i-2]+ Math.abs(t[i]-t[i-2]) ; 
			cost[i] =Integer.min(y1, y2)  ;
		}
		out.println(cost[n-1]);
		














		out.flush();
	}
}


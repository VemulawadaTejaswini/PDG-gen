
import java.util.*;
import java.io.*;

public class Main {

	private static final long mod =(long)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	      long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong();
	      long max=Math.max(a,b);
	      long min=Math.min(a,b);
	      long max2=Math.max(c,d);
	      long min2=Math.min(c, d);
	      long o1=0;
	      long o2=0;
	      long o3=0;
	      long o4=0;
//	   if(a>=0&&b>=0) {
//	     o1=Math.max(a, b);
//	     if(c>=0||d>=0) {
//	       o2=Math.max(c, d);
//	       System.out.prlongln(o1*o2*1l);
//	     }
//	    
//	   }else if(a<=0||)
	      if(min<0&&min2<0) {
	        System.out.println(Math.max(min*min2*1l,max*max2*1l));
	      }else if(min>=0&&min2>=0) {
	        System.out.println(Math.max(min*min2*1l,max*max2*1l));
	      }else if(min>=0&&max2<=0) {
	        System.out.println(Math.max(min*max2*1l,min2*max));
	      }else if(min<=0&&max2>=0) {
	        System.out.println(Math.max(min*max2*1l,min2*max));
	      }
	    out.flush();
	    }
//	    static long binarySearch(long i,long j,long a[]) {
//	      
//	    }
	
	static boolean vis[]=new boolean[10001];
	      static long gcd(long a, long b) 
	      { 
	          if (a == 0) 
	              return b; 
	          return gcd(b % a, a); 
	      } 
//	    static  void dfs(long n,boolean flag,ArrayList<ArrayList<longeger>> adj,long src,boolean vis[],ArrayList<longeger> centroid,long size[]) {
//	        vis[src]=true;
//	        size[src]=1;
//	        for(long i:adj.get(src)) {
//	          if(vis[i]==false){
//	            dfs(n,flag,adj,i,vis,centroid,size);
//	            size[src]+=size[i];
//	            if(size[i]>n/2) {
//	              flag=false;
//	            }
//	          }
//	        }
//	        if(n-size[src]>n/2) {
//	          flag=false;
//	        }
//	        if(flag==true) {
//	          centroid.add(src);
//	        }
//	    }
//	
//	     
//	      
}
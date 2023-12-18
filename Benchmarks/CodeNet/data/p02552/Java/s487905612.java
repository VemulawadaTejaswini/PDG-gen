
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	      int x=sc.nextInt();
	    if(x==0) {
	      out.println(1);
	    }else {
	      out.println(0);
	    }
	      out.flush();
	    }
//	    static int binarySearch(int i,int j,int a[]) {
//	      
//	    }
	
	static boolean vis[]=new boolean[10001];
	      static int gcd(int a, int b) 
	      { 
	          if (a == 0) 
	              return b; 
	          return gcd(b % a, a); 
	      } 
	    static  void dfs(int n,boolean flag,ArrayList<ArrayList<Integer>> adj,int src,boolean vis[],ArrayList<Integer> centroid,int size[]) {
	        vis[src]=true;
	        size[src]=1;
	        for(int i:adj.get(src)) {
	          if(vis[i]==false){
	            dfs(n,flag,adj,i,vis,centroid,size);
	            size[src]+=size[i];
	            if(size[i]>n/2) {
	              flag=false;
	            }
	          }
	        }
	        if(n-size[src]>n/2) {
	          flag=false;
	        }
	        if(flag==true) {
	          centroid.add(src);
	        }
	    }
	
	     
	      
}
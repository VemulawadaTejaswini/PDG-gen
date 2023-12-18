import java.util.*;
import java.io.*;

 public class Main{
// taking inputs
static BufferedReader s1;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}
static int int_v (String s1){return Integer.parseInt(s1);}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split(" ");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split(" ");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}

//......................................@uthor_Alx..............................................

   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  	int n=int_v(read());
	        		  	int[] arr=int_arr();
	        		  	Arrays.sort(arr);
	        		  	int[] f=new int[arr[n-1]+1];
	        		  	for(int x:arr){f[x]++;}
	        		  	boolean[] b=new boolean[arr[n-1]+1];
	        		    boolean[] b1=new boolean[arr[n-1]+1];
	        		    Arrays.fill(b,true);
	        		   for(int i=0;i<n;i++){
	        		   	    if(!b[arr[i]]||b1[arr[i]]) continue;
	        		   	    b1[arr[i]]=true;
	        		   		for(int j=2*arr[i];j<arr[n-1]+1;j+=arr[i]){
	        		   			b[j]=false;
	        		   		}
	        		   }
	        		   int res=0;
	        		   for(int i=0;i<n;i++){
	        		   		if(b[arr[i]]&&f[arr[i]]==1){
	        		   			res++;
	        		   		}
	        		   }
	        		  	out.write(res+"");
                      out.flush();
	        		 
	}
}
	       
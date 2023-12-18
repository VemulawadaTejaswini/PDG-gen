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
	        		  	int[] x=int_arr();
	        		  	int[] arr=int_arr();
	        		  	Arrays.sort(arr);
	        		  	int res=0;
	        		  	for(int i=1;i<=x[1];i++){
	        		  		res+=arr[i-1];
	        		  	}
	        		  	
	        		  	out.write(res+"");
                      out.flush();
	        		 
	}
}
	       
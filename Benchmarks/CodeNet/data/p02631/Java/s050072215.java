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
	        		  	int x=0;
	        		  	for(int z:arr){x^=z;}
	        		  	int[] res=new int[n];
	        		  	for(int i=0;i<n;i++){
	        		  		for(int j=0;j<32;j++){
	        		  			int b=arr[i]&1<<j;
	        		  			int xb=x&1<<j;
	        		  			if((b==0&&xb!=0)||(b!=0&&xb==0)){
	        		  				res[i]+=1<<j;
	        		  			}
	        		  		}
	        		  	}
	        		  	for(int i:res){out.write(i+" ");}

	        		  	//out.write(res+"");
                      	out.flush();
	        		 
	}
}
	       
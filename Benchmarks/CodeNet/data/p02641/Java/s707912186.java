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
	        		  	int[] a=int_arr();
	        		  	int x=a[0],n=a[1];
	        		  	if(n==0){out.write(x+"");out.flush();return;}
	        		  	int[] p=int_arr();

	        		  	Set<Integer> s=new HashSet<>();
	        		  	for(int xz:p){s.add(xz);}
	        		  	int res=100000,kk=0;
	        		   for(int i=-1000;i<=1000;i++){
	        		   	   if(!s.contains(i)){
	        		   	   	 if(res>Math.abs(x-i)){
	        		   	   	 	res=Math.abs(x-i);
	        		   	   	 	kk=i;
	        		   	   	 }
	        		   	   	 //else if(res==Math.abs(x-i)&&kk){}
	        		   	   }
	        		   }
	        		  	out.write(kk+"");
                      out.flush();
	        		 
	}
}
	       
	          



	
  





	
  




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
 static List<Character> l;
 static void rec(long n,String s){
 	if(n<=0l) return;
 	if(n>0)n--;
 	long k=n/26l;int r=(int)(n%26l);
 	
 	 l.add(s.charAt(r));
 	rec(k,s);
 }
   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  	long n=long_v(read());
	        		  	l=new ArrayList<>();
	        		  	String s="abcdefghijklmnopqrstuvwxyz";
	        		  	rec(n,s);
	        		  	for(int i=l.size()-1;i>=0;i--){
	        		  		out.write(l.get(i));
	        		  	}
	        		  	
	        		  	//out.write(res+"");
                      	out.flush();
	        		 
	}
}
	       

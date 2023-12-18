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
static long Modpow(long a,long p,long m){long res=1;while(p>0){if((p&1)!=0){res=(res*a)%m;}p >>=1;a=(a*a)%m;}return res;}
static long Modmul(long a,long b,long m){return ((a%m)*(b%m))%m;}
static long ModInv(long a,long m){return Modpow(a,m-2,m);}
static long nck(int n,int r,long m){if(r>n){return 0l;}return Modmul(f[n],ModInv(Modmul(f[n-r],f[r],m),m),m);}
static long[] f;
//......................................@uthor_Alx..............................................

   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  	int[] x=int_arr();
	        		  	int n=x[0],m=x[1],k=x[2];
	        		  	long[] a=long_arr();
	        		  	long[] b=long_arr();
	        		  	for(int i=1;i<n;i++){
	        		  		a[i]+=a[i-1];
	        		  	}
	        		  	for(int j=1;j<m;j++){
	        		  		b[j]+=b[j-1];
	        		  	}
	        		  	int max=0;
	        		  	for(int i=0,j=m-1;i<n;i++){
	        		  		long xx=(long)k-a[i];
	        		  		while(j>=0&&xx<b[j]){
	        		  			j--;
	        		  		}
	        		  		long tmp=i>=0?a[i]:0;
	        		  		tmp+=j>=0?b[j]:0;
	        		  	   if(tmp<=(long)k){
	        		  	   	max=Math.max(max,j+1+i+1);
	        		  	   }
	        		  	}
	        		  	if(a[n-1]<=k){max=Math.max(max,n);}
	        		  	if(b[m-1]<=k){max=Math.max(max,m);}
	        		  	
	        		  	out.write(max+"");
                      	out.flush();
	        		 
	}
}
	       

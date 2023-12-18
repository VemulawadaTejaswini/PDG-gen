import java.util.*;
import java.io.*;

public class Main{

static BufferedReader s1;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}
static int int_v (String s1){return Integer.parseInt(s1);}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split("\\s+");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split("\\s+");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}
static long Modpow(long a,long p,long m){long res=1;while(p>0){if((p&1)!=0){res=(res*a)%m;}p >>=1;a=(a*a)%m;}return res;}
static long Modmul(long a,long b,long m){return ((a%m)*(b%m))%m;}

//......................................@uthor_Alx..............................................
static long mod=(long)1e9+7;

public static void main(String[] args) throws  IOException{
                assign();
               int n=int_v(read());
               long[] a=long_arr();
               long[] b=a.clone();
               for(int i=n-2;i>=0;i--){
                    a[i]+=a[i+1];
                    a[i]%=mod;
               }
               long res=0;
               for(int i=0;i<n-1;i++){
                    res+=Modmul(b[i],a[i+1],mod);
                    res%=mod;
               }
                out.write((res%mod)+"");
                out.flush();

    }
}
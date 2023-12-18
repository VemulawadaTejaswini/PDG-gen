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
//......................................@uthor_Alx..............................................
static long mod=(long)1e9+7;

public static void main(String[] args) throws  IOException{
                assign();
                int n=int_v(read());
                int[] a=int_arr();
                long[][] dp=new long[n+1][4];
                dp[0][0]=1000l;
                for(int i=1;i<=n;i++){
                    dp[i][2]=dp[i-1][3]+(long)a[i-1]*dp[i-1][1];//sell all
                    long max=Math.max(dp[i-1][0],Math.max(dp[i-1][2],dp[i][2]));
                    dp[i][0]=max;// doing nothing
                    dp[i][1]= max/a[i-1];//buy all
                    dp[i][3]=max-(long)dp[i][1]*a[i-1];
                }
                /*for(int i=1;i<=n;i++){
                    out.write(dp[i][0]+" "+dp[i][1]+" "+dp[i][2]+" "+dp[i][3]+"\n");
                }*/
                out.write(Math.max(dp[n][0],dp[n][2])+"");
                out.flush();

    }
}

import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main
{
    static int l_eq(long x,long arr[],int l,int r){
        int ret=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]<=x){
                ret=mid;
                l=mid+1;
            }
            else
                r=mid-1;
        }

        return ret;
    }

    public static void process()throws IOException
    {
        int n=ni(),m=ni(),k=ni(),res=0;

        long a[]=new long[n+1],b[]=new long[m+1];
        for(int i=1;i<=n;i++) a[i]=a[i-1]+nl();
        for(int i=1;i<=m;i++) b[i]=b[i-1]+nl();

        for(int i=0;i<=n;i++){
            if(a[i]>k)
                break;

            long rem=k-a[i];

            int idx=l_eq(rem,b,0,m);
            res=Math.max(res, i+idx);
        }

        for(int i=0;i<=m;i++){
            if(b[i]>k)
                break;

            long rem=k-b[i];

            int idx=l_eq(rem,a,0,n);
            res=Math.max(res, i+idx);
        }

        pn(res);
    }
 
 
    static FastReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        out = new PrintWriter(System.out);
        sc=new FastReader();
 
        long s = System.currentTimeMillis();
        int t=1;
        //t=ni();
        while(t-->0)
            process();
 
        out.flush();
        System.err.println(System.currentTimeMillis()-s+"ms");
    }
    
    
    static void pn(Object o){out.println(o);}
    static void p(Object o){out.print(o);}
    static int ni()throws IOException{return Integer.parseInt(sc.next());}
    static long nl()throws IOException{return Long.parseLong(sc.next());}
    static double nd()throws IOException{return Double.parseDouble(sc.next());}
    static String nln()throws IOException{return sc.nextLine();}
    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));}
    
    static long mod=(long)1e9+7l;
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 
    } 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
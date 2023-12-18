import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main
{
    static long div_count(long n){
        long cnt=0l,ret=1l;
        while(n%2==0){
            cnt++;
            n/=2;
        }

        ret*=(cnt+1l);

        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i!=0)
                continue;
            cnt=0l;
            while(n%i==0){
                cnt++;
                n/=i;
            }
            ret*=(cnt+1l);
        }

        if(n>2) ret*=2l;
        return  ret;
    }

    public static void process()throws IOException
    {
        int n=ni();

        long res=0l;
        for(long i=1;i<=n;i++){
            long x =  div_count(i) * i;
            res+=x;
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
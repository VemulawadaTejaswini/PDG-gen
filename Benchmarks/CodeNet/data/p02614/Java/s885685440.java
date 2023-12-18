import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main
{
    static void fill(char arr[][], int i, int j, int h, int w){
        for(int k = 1; k <= h; k++) arr[k][j] = '.';
        for(int k = 1; k <= w; k++) arr[i][k] = '.';
       
    }

    static int count_blacks(char arr[][], int h, int w){
        int ret = 0;
        for(int i = 1; i <= h; i++) for(int j =1; j <= w; j++) ret += ((arr[i][j] == '#')? 1 : 0);

        return ret;
    }

    public static void process()throws IOException
    {
        int h = ni(), w = ni(), k = ni(), res = 0;
        char arr[][] = new char[h+1][w+1], aux[][] = new char[h+1][w+1];

        for(int i = 1; i <= h; i++)
            arr[i] = (" "+nln()).toCharArray();

        for(int i = 0; i <  Math.pow(2, h); i++){
            for(int j = 0; j < Math.pow(2, w); j++){

                for(int p = 0; p <= h; p++) for(int q = 0; q <=w; q++) aux[p][q] = arr[p][q];
                
                int mask_i = i, mask_j, take_i, take_j;

                for(int p = 1; p <= h; p++){
                    mask_j = j;
                    take_i = ((mask_i & 1) == 1)? p : 0;
                    for(int q = 1; q <= w; q++){
                        take_j = ((mask_j & 1) == 1)? q : 0;
                        fill(aux, take_i, take_j, h, w);
                        mask_j = mask_j >> 1;
                    }
                    mask_i = mask_i >> 1;
                }

                int c = count_blacks(aux, h, w);
                if(c == k)
                    res++;
            }
        }

        pn(res);
    }
 
    static final long mod=(long)1e9+7l;

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
}
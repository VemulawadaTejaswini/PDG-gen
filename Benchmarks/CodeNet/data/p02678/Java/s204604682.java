import java.util.*;import java.io.*;import java.math.*;
public class Main
{
    static ArrayList<Integer>g[];
    static boolean vis[];
    static int par[];
    static int dis[];
    public static void process()throws IOException
    {
        int n=ni();
        int m=ni();
        g=new ArrayList[n+1];
        par=new int[n+1];
        dis=new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        vis=new boolean[n+1];
        for(int i=0;i<=n;i++)
            g[i]=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            int x=ni(),y=ni();
            g[x].add(y);
            g[y].add(x);
        }
        bfs(1);
        for(int i=2;i<=n;i++)
            if(dis[i]==Integer.MAX_VALUE)
            {
                pn("No");
                return;
            }
        pn("Yes");
        for(int i=2;i<=n;i++)
            pn(par[i]);
    }
    static void bfs(int src)
    {
        vis[src]=true;
        Queue<Integer>q=new LinkedList<>();
        q.add(src);
        while(!q.isEmpty())
        {
            int x=q.poll();
            for(Integer v:g[x])
            {
                if(!vis[v])
                    q.add(v);
                if(dis[v]>dis[x]+1)
                {
                    dis[v]=dis[x]+1;
                    par[v]=x;
                }
                vis[v]=true;
            }
        }
    }
    static AnotherReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        boolean oj =true;
        if(oj){sc=new AnotherReader();out=new PrintWriter(System.out);}
        else{sc=new AnotherReader(100);out=new PrintWriter("output.txt");}
        int t=1;
        // t=ni();
        while(t-->0) {process();}
        out.flush();out.close();  
    }

    static void pn(Object o){out.println(o);}
    static void p(Object o){out.print(o);}
    static void pni(Object o){out.println(o);out.flush();}
    static int ni()throws IOException{return sc.nextInt();}
    static long nl()throws IOException{return sc.nextLong();}
    static double nd()throws IOException{return sc.nextDouble();}
    static String nln()throws IOException{return sc.nextLine();}
    static int[] nai(int N)throws IOException{int[]A=new int[N];for(int i=0;i!=N;i++){A[i]=ni();}return A;}
    static long[] nal(int N)throws IOException{long[]A=new long[N];for(int i=0;i!=N;i++){A[i]=nl();}return A;}
    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

    static class AnotherReader{BufferedReader br; StringTokenizer st;
    AnotherReader()throws FileNotFoundException{
    br=new BufferedReader(new InputStreamReader(System.in));}
    AnotherReader(int a)throws FileNotFoundException{
    br = new BufferedReader(new FileReader("input.txt"));}
    String next()throws IOException{
    while (st == null || !st.hasMoreElements()) {try{
    st = new StringTokenizer(br.readLine());}
    catch (IOException  e){ e.printStackTrace(); }}
    return st.nextToken(); } int nextInt() throws IOException{
    return Integer.parseInt(next());}
    long nextLong() throws IOException
    {return Long.parseLong(next());}
    double nextDouble()throws IOException { return Double.parseDouble(next()); }
    String nextLine() throws IOException{ String str = ""; try{
    str = br.readLine();} catch (IOException e){
    e.printStackTrace();} return str;}}
   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

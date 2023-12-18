import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main
{
    static class Graph{
        ArrayList<Integer> l[];
        boolean visited[];
        int par[],V;

        public Graph(int v){
            V=v;
            l=new ArrayList[V+1];
            par=new int[V+1];
            visited=new boolean[V+1];
            for(int i=0;i<=V;i++) l[i]=new ArrayList<>();
        }

        void addEdge(int u,int v){
            l[u].add(v);
            l[v].add(u);
        }

        void bfs(){
            visited[1]=true;
            Queue<Integer> q=new LinkedList<>();
            q.add(1);
            int cnt=0;

            while(!q.isEmpty()){
                Integer n=q.poll();

                for(Integer child : (l[n])){
                    if(visited[child])
                        continue;
                    visited[child]=true;
                    par[child]=n;
                    cnt++;
                    q.add(child);
                }
            }

            if(cnt!=V-1){ pn("No"); return; }

            pn("Yes");
            for(int i=2;i<=V;i++) pn(par[i]);
        } 
    }
    public static void process()throws IOException
    {
        int n=ni(),m=ni();
        Graph g=new Graph(n);
        for(int i=1;i<=m;i++) g.addEdge(ni(),ni());
        g.bfs();
    }
 
 
    static FastReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        out = new PrintWriter(System.out);
        sc=new FastReader();
 
        long s = System.currentTimeMillis();
        int t=1;
       // t=ni();
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
 
    static<T> void r_sort(T arr[],int n){
        Random r = new Random(); 
        for (int i = n-1; i > 0; i--){ 
            int j = r.nextInt(i+1); 
                  
            T temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp; 
        } 
        Arrays.sort(arr); 
    }
    
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
import java.io.*;
import java.util.*;

//AtCoder D
class DoubleDots
{
    public static ArrayList<ArrayList<Integer>> adj;
    public static int[] par;
    public static void main(String args[]) throws IOException
    {
        IO io=new IO(System.in, System.out);
        int n=io.i(), m=io.i();

        par=new int[n+1];
        adj=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int i=1;i<=m;i++)
        {
            int u=io.i(), v=io.i();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        var q=new LinkedList<Integer>();
        Boolean[] seen=new Boolean[n+1];
        Arrays.fill(seen, false);
        q.add(1);
        seen[0]=seen[1]=true;

        while(!q.isEmpty())
        {
            int u=q.poll();

            for(int v : adj.get(u)) if(!seen[v])
            {
                par[v]=u;
                q.add(v);
                seen[v]=true;
            }
        }

        if(Arrays.stream(seen).anyMatch(b -> !b))
        {
            io.pln("No");
        }
        else
        {
            io.pln("Yes");
            for(int i=2;i<=n;i++)
            {
                io.pln(par[i]);
            }
        }
        io.flush();
    }

    public static class IO
    {
        private BufferedReader br;
        private StringTokenizer tok;
        private PrintWriter pw;

        IO(InputStream inputStream, OutputStream outputStream)
        {
            br=new BufferedReader(new InputStreamReader(inputStream));
            pw=new PrintWriter(new OutputStreamWriter(outputStream));
        }

        public String s()
        {
            while(tok == null || !tok.hasMoreElements())
            {
                try
                {
                    tok=new StringTokenizer(br.readLine());
                }
                catch(IOException exc)
                {
                    exc.printStackTrace();
                }
            }
            return tok.nextToken();
        }

        public int i()
        {
            return Integer.parseInt(s());
        }

        public long l()
        {
            return Long.parseLong(s());
        }

        @SuppressWarnings("unchecked") public<T> void p(T... out)
        {
            for(T e : out) pw.print(e);
        }

        @SuppressWarnings("unchecked") public<T> void pln(T... out)
        {
            for(T e : out) pw.println(e);
        }

        public void pln()
        {
            pw.println();
        }

        public void flush()
        {
            pw.flush();
        }
    }    
}
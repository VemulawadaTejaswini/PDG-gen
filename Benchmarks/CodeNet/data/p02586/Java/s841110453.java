import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int t, n, i, j, k, r, c, a, b;
    public static int[][] mat = new int[3002][3002];
    public static long[][] dist = new long[3002][3002];
    public static int[] x = {1, 0}, y = {0, 1};
    public static void main(String[] args) throws IOException
    {
        FastScanner sc = new FastScanner();
        r = sc.nextInt();
        c = sc.nextInt();
        k = sc.nextInt();
        for(i = 0; i < k; i ++)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            mat[a][b] = n;
        }
        dijkstra();
        out.write(dist[r][c]+"");
        out.flush();
    }

    public static void dijkstra()
    {
        PriorityQueue<Node> pq = new PriorityQueue<Node>(new NodeComparator());
        pq.add(new Node(1, 1, mat[1][1]));
        boolean vis[][] = new boolean[r+1][c+1];
        while(!pq.isEmpty())
        {
            Node source = pq.poll();
            for(k = 0; k < 2; k++)
            {
                a = source.x + x[k];
                b = source.y + y[k];
                if(valid(a, b))
                {
                    dist[a][b] = Math.max(dist[a][b], source.dist + mat[a][b]);
                    if(!vis[a][b])
                    {
                        vis[a][b] = true;
                        pq.add(new Node(a, b, dist[a][b]));
                    }
                }
            }
        }
    }

    public static boolean valid(int a, int b)
    {
        return (a >= 1 && a <= r) && (b >= 1 && b <= c);
    }

    public static class NodeComparator implements Comparator<Node>
    {

        @Override
        public int compare(Node o1, Node o2)
        {
            if(o1.dist > o2.dist)
                return 1;
            else if(o1.dist < o2.dist)
                return -1;
            return 0;
        }
    }

    static class Node
    {
        int x, y;
        long dist;
        Node(int x, int y, long dist)
        {
            this.dist = dist;
            this.x = x;
            this.y = y;
        }
    }

    static class FastScanner
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next()
        {
            while (!st.hasMoreTokens())
                try
                {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }
        int[] readArray(int n)
        {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong()
        {
            return Long.parseLong(next());
        }
    }
}

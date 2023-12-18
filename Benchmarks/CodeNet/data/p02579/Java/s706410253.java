import java.util.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        //Reader in = new Reader();
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = in.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        char[][] A = new char[n][m];
        s1 = in.readLine().split(" ");
        int cr = Integer.parseInt(s1[0]) - 1;
        int cc = Integer.parseInt(s1[1]) - 1;
        s1 = in.readLine().split(" ");
        int dr = Integer.parseInt(s1[0]) - 1;
        int dc = Integer.parseInt(s1[1]) - 1;
        for (int i=0;i<n;i++)
        {
            A[i] = in.readLine().toCharArray();
        }
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        ArrayDeque<Integer> X = new ArrayDeque<>();
        ArrayDeque<Integer> Y = new ArrayDeque<>();
        int[][] min = new int[n][m];
        for (int i=0;i<n;i++)
            Arrays.fill(min[i], Integer.MAX_VALUE);
        min[cr][cc] = 0;
        boolean[][] visited = new boolean[n][m];
        X.add(cr);
        Y.add(cc);
        while (X.size() > 0)
        {
            int xx = X.pollFirst();
            int yy = Y.pollFirst();
            if (visited[xx][yy])
                continue;
            visited[xx][yy] = true;
            if (A[xx][yy] == '#')
                continue;
            for (int i=0;i<4;i++)
            {
                int xxx = xx + dx[i];
                int yyy = yy + dy[i];
                if (xxx >= 0 && xxx < n && yyy >= 0 && yyy < m)
                {
                    X.addLast(xxx);
                    Y.addLast(yyy);
                    min[xxx][yyy] = Math.min(min[xxx][yyy], min[xx][yy]);
                }
            }
            for (int i=xx - 2;i<xx + 3;i++)
            {
                for (int j=yy - 2;j<yy + 3;j++)
                {
                    if (i >= 0 && i < n && j >= 0 && j < m)
                    {
                        X.addLast(i);
                        Y.addLast(j);
                        min[i][j] = Math.min(min[i][j], min[xx][yy] + 1);
                    }
                }
            }
        }
        if (min[dr][dc] == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(min[dr][dc]);

    }

}
class Reader
{
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader()
    {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public Reader(String file_name) throws IOException
    {
        din = new DataInputStream(new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public String readLine() throws IOException
    {
        byte[] buf = new byte[64]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1)
        {
            if (c == '\n')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }

    public int nextInt() throws IOException
    {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do
        {
            ret = ret * 10 + c - '0';
        }  while ((c = read()) >= '0' && c <= '9');

        if (neg)
            return -ret;
        return ret;
    }

    public long nextLong() throws IOException
    {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }

    public double nextDouble() throws IOException
    {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();

        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');

        if (c == '.')
        {
            while ((c = read()) >= '0' && c <= '9')
            {
                ret += (c - '0') / (div *= 10);
            }
        }

        if (neg)
            return -ret;
        return ret;
    }

    private void fillBuffer() throws IOException
    {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }

    private byte read() throws IOException
    {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }

    public void close() throws IOException
    {
        if (din == null)
            return;
        din.close();
    }
}

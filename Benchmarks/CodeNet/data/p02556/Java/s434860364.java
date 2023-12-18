import java.util.*;
import java.io.*;

public class Main {

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next()
        {
            while(st==null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        String nextLine()
        {
            String str = "";

            try
            {
                str = br.readLine();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class Reader
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
            } while ((c = read()) >= '0' && c <= '9');

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

    static long power(long x, long y, long p)
    {
        long res = 1;

        x = x % p;

        while (y > 0) {

            if (y % 2 == 1)
                res = (res * x) % p;

            y = y >> 1;
            x = (x * x) % p;
        }

        return res;
    }

    static long modInverse(long n, long p)
    {
        return power(n, p - 2, p);
    }

    static long nCrModPFermat(long n, long r, long p)
    {

        if (r == 0)
            return 1;

        long[] fac = new long[(int) (n + 1)];
        fac[0] = 1;

        for (int i = 1; i <= n; i++)
            fac[i] = fac[i - 1] * i % p;

        return (fac[(int) n] * modInverse(fac[(int) r], p) % p * modInverse(fac[(int) (n - r)], p) % p) % p;
    }

    public static void main(String[] args) throws java.lang.Exception
    {
        try
        {
            //FastReader fr = new FastReader();
            Reader fr = new Reader();
            OutputStream out = new BufferedOutputStream(System.out);


            int n = fr.nextInt();

            List<Long> a = new ArrayList<>();
            List<Long> b = new ArrayList<>();

            List<Long> ans = new ArrayList<>();

            for (int i=0;i<n;i++)
            {
                long p1 = fr.nextLong();
                long p2 = fr.nextLong();

                long sm = p1+p2;

                ans.add(sm);
                a.add(p1);
                b.add(p2);
            }

            long mn = Collections.min(ans);
            long mx = Collections.max(ans);

            int i1 = 0;
            int i2 = 0;

            List<Integer> index1 = new ArrayList<>();
            List<Integer> index2 = new ArrayList<>();

            for (int i=0;i<n;i++)
            {
                long ele = ans.get(i);

                if (ele ==mn)
                {
                    i1 = i;
                    index1.add(i1);
                }

                if (ele == mx)
                {
                    i2 = i;
                    index2.add(i2);
                }
            }


            if (index1.size() == 1 && index2.size() == 1) {
                long res = Math.abs(a.get(i1) - a.get(i2)) + Math.abs(b.get(i1) - b.get(i2));

                out.write((res + "\n").getBytes());
            }
            else
            {
                List<Long> finalSolution = new ArrayList<>();

                for (int i=0;i<index1.size();i++)
                {
                    for (int j=0;j<index2.size();j++)
                    {
                        i1 = index1.get(i);
                        i2 = index2.get(i);

                        long res = Math.abs(a.get(i1) - a.get(i2)) + Math.abs(b.get(i1) - b.get(i2));

                        finalSolution.add(res);
                    }
                }

                long res = Collections.max(finalSolution);

                out.write((res+"\n").getBytes());
            }


            out.flush();
            out.close();
        }

        catch(Exception e){e.printStackTrace();}
        finally{}
    }
}

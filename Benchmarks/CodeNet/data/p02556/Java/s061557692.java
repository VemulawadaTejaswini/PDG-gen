

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
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
    public static void main(String[] args)throws IOException {
        Reader s=new Reader();
        int n=s.nextInt();
        ArrayList<Point> first=new ArrayList<>();
        ArrayList<Point> second=new ArrayList<>();
        ArrayList<Point> third=new ArrayList<>();
        ArrayList<Point> fourth=new ArrayList<>();
        for(int i=1;i<=n;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            first.add(new Point(x,y));
            second.add(new Point(x,y));
            third.add(new Point(x,y));
            fourth.add(new Point(x,y));
        }
        Collections.sort(first,new First());
        Collections.sort(second,new Second());
        Collections.sort(third,new Third());
        Collections.sort(fourth,new Fourth());
        long max=0;
        for(int i=0;i<n;i++){
            int x=first.get(i).x;
            int y=first.get(i).y;
            long op1=1l*x+1l*y-(1l*first.get(0).x+1l*first.get(0).y);
            long op2=1l*x-1l*y-(1l*second.get(0).x-1l*second.get(0).y);
            long op3=1l*y-1l*x-(1l*third.get(0).y-1l*third.get(0).x);
            long op4=-(1l*x+1l*y)-(1l*fourth.get(0).x+1l*fourth.get(0).y);
            max=Math.max(max,op1);
            max=Math.max(max,op2);
            max=Math.max(max,op3);
            max=Math.max(max,op4);
        }
        System.out.println(max);
    }
}

class Point{
    int x,y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class First implements Comparator<Point>{
    @Override
    public int compare(Point o1, Point o2) {
        return (o1.x+o1.y)-(o2.x+o2.y);
    }
}

class Second implements Comparator<Point>{
    @Override
    public int compare(Point o1, Point o2) {
        return (o1.x-o1.y)-(o2.x-o2.y);
    }
}

class Third implements Comparator<Point>{
    @Override
    public int compare(Point o1, Point o2) {
        return (o1.y-o1.x)-(o2.y-o2.x);
    }
}

class Fourth implements Comparator<Point>{
    @Override
    public int compare(Point o1, Point o2) {
        return (o2.x+o2.y)-(o1.x+o1.y);
    }
}

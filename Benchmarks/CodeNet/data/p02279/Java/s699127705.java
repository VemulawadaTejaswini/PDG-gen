import java.util.Arrays;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

 class FS {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        return hasNextByte() ? buffer[ptr++] : -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public int nextInt() {
        return (int) nextLong();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        FS fs = new FS();
        int n = fs.nextInt();
        int[] ts = new int[n];
        node[] nodes =new node[n];
        for (int i = 0; i <n ; i++) {
            int id = fs.nextInt();
            int n1 = fs.nextInt();
            int[] ints = new int[n1];
            for (int j = 0; j <n1 ; j++) {
                ints[j]=fs.nextInt();
                ts[ints[j]]=id+1;
            }
            int parent=ts[id]==0?-1:ts[id]-1;
            int depth=0;
            int m=id;
            while (ts[m]!=0){
                depth++;
                m=ts[m]-1;
            }
            String type="root";
            if (n1>0&&parent!=-1){
                type="internal node";
            }else if (parent!=-1&&n1<=0){
                type="leaf";
            }
            System.out.println(new node(id, parent, depth, type, ints));
        }
    }

    static class node {
        int id;
        int parent;
        int depth;
        String type;
        int[] son;

        @Override
        public String toString() {
            return "node " + id +
                    ": parent = " + parent +
                    ", depth = " + depth +
                    ", " + type +
                    ", " + Arrays.toString(son);
        }

        public node(int id, int parent, int depth, String type, int[] son) {
            this.id = id;
            this.parent = parent;
            this.depth = depth;
            this.type = type;
            this.son = son;
        }
        
    }
}

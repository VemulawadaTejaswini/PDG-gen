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
        Stuff a[] = new Stuff[n];
        boolean b[]  =new boolean[n];
        for (int i = 0; i < n; i++) {
            int wei = fs.nextInt();
            a[i]=new Stuff(i,wei);
        }
        Arrays.sort(a);
        int min=a[0].weight;
        int wcount=0;
        for (int i = 0; i < a.length; i++) {
            if (min>a[i].weight)min=a[i].weight;
            if (b[i])continue;
            if (a[i].index==i)continue;
            int minw=a[i].weight;
            int k=0;
            for (int j = a[i].index; !b[j]; j=a[j].index,k++){
                if (min>a[j].weight)min=a[j].weight;
                if (minw>a[j].weight)min=a[j].weight;
                b[j]=true;
                wcount+=a[j].weight;
            }
            wcount+=Math.min((k-2)*minw,minw+(k+1)*min);
        }
        System.out.println(wcount);
    }

   static class Stuff implements Comparable<Stuff> {
        int index;
        int weight;

        public Stuff(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }



       @Override
       public int compareTo(Stuff o) {
            if (o.weight>this.weight)return -1;
            else return 1;
       }
   }
}

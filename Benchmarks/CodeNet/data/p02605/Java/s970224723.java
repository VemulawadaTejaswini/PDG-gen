import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TreeSet;



public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        BasicScanner sc = new BasicScanner(System.in);
        int n = sc.nextInt();
        int k = 200001;
        ArrayList<IntPair> ul = new ArrayList<>();
        ArrayList<IntPair> rl = new ArrayList<>();
        TreeSet<Integer>[] dl = new TreeSet[k];
        TreeSet<Integer>[] ll = new TreeSet[k];
        ArrayList<IntPair> um = new ArrayList<>();
        TreeSet<Integer>[] rm = new TreeSet[2 * k];
        ArrayList<IntPair> dm = new ArrayList<>();
        TreeSet<Integer>[] lm = new TreeSet[2 * k];
        ArrayList<IntPair> up = new ArrayList<>();
        TreeSet<Integer>[] rp = new TreeSet[2 * k];
        ArrayList<IntPair> dp = new ArrayList<>();
        TreeSet<Integer>[] lp = new TreeSet[2 * k];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            char u = sc.nextChars()[0];
            if (u == 'U') {
                ul.add(new IntPair(x, y));
                um.add(new IntPair(y - x, x));
                up.add(new IntPair(y + x, x));
            } else if (u == 'R') {
                rl.add(new IntPair(y, x));
                if (rm[y - x + k] == null) rm[y - x + k] = new TreeSet<>();
                rm[y - x + k].add(x);
                if (rp[y + x] == null) rp[y + x] = new TreeSet<>();
                rp[y + x].add(x);
            } else if (u == 'D') {
                if (dl[x] == null) dl[x] = new TreeSet<>();
                dl[x].add(y);
                dm.add(new IntPair(y - x, x));
                dp.add(new IntPair(y + x, x));
            } else if (u == 'L') {
                if (ll[y] == null) ll[y] = new TreeSet<>();
                ll[y].add(x);
                if (lm[y - x + k] == null) lm[y - x + k] = new TreeSet<>();
                lm[y - x + k].add(x);
                if (lp[y + x] == null) lp[y + x] = new TreeSet<>();
                lp[y + x].add(x);
            }
        }
        long min = Long.MAX_VALUE;
        for (IntPair ue : ul) {
            int x = ue.fst;
            if (dl[x] == null) continue;
            int uy = ue.snd;
            Integer dy = dl[x].higher(uy);
            if (dy == null) continue;
            min = Math.min(min, (dy - uy) * 5);
        }
        for (IntPair re : rl) {
            int y = re.fst;
            if (ll[y] == null) continue;
            int rx = re.snd;
            Integer lx = ll[y].higher(rx);
            if (lx == null) continue;
            min = Math.min(min, (lx - rx) * 5);
        }
        for (IntPair ume : um) {
            int m = ume.fst;
            if (lm[m + k] == null) continue;
            int ux = ume.snd;
            Integer lx = lm[m + k].higher(ux);
            if (lx == null) continue;
            min = Math.min(min, (lx - ux) * 10);
        }
        for (IntPair upe : up) {
            int p = upe.fst;
            if (rp[p] == null) continue;
            int ux = upe.snd;
            Integer rx = rp[p].lower(ux);
            if (rx == null) continue;
            min = Math.min(min, (ux - rx) * 10);
        }
        for (IntPair dme : dm) {
            int m = dme.fst;
            if (rm[m + k] == null) continue;
            int dx = dme.snd;
            Integer rx = rm[m + k].lower(dx);
            if (rx == null) continue;
            min = Math.min(min, (dx - rx) * 10);
        }
        for (IntPair dpe : dp) {
            int p = dpe.fst;
            if (lp[p] == null) continue;
            int dx = dpe.snd;
            Integer lx = lp[p].higher(dx);
            if (lx == null) continue;
            min = Math.min(min, (lx - dx) * 10);
        }
        System.out.println(min == Long.MAX_VALUE ? "SAFE" : min);
        Thread.sleep(1000);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class BasicScanner {
    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public BasicScanner(InputStream in) {this.in = in;}
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buf);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    private StringBuilder nextSequence() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb;
    }
    public char nextChar() {
        return (char) readByte();
    }
    public String next() {
        return nextSequence().toString();
    }
    public String next(int len) {
        return new String(nextChars(len));
    }
    public char[] nextChars() {
        final StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
        if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntPair {
    public int fst, snd;
    public IntPair(final int fst, final int snd) {this.fst = fst; this.snd = snd;}
    @Override @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof IntPair)) return false;
        final IntPair p = (IntPair) o;
        return this.fst == p.fst && this.snd == p.snd;
    }
    @Override
    public int hashCode() {return Objects.hash(this.fst, this.snd);}
    @Override
    public String toString() {return "(" + this.fst + ", " + this.snd + ")";}
}

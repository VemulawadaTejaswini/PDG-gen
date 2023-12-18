import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

  private static final long MAX = 1000000;

  long getId(long x, long y) {
    return x * MAX + y;
  }

  long x(long id) {
    return id / MAX;
  }

  long y(long id) {
    return id % MAX;
  }

  private void solve(FastScanner in, PrintWriter out) {
    int N = in.nextInt();
    int M = in.nextInt();
    int K = in.nextInt();

    TreeMap<Long, Integer> idMap = new TreeMap<>();
    ArrayList<Long> ids = new ArrayList<>();

    long wallUpRight = 10000000000000L;
    ids.add(wallUpRight);
    idMap.put(wallUpRight, 0);

    long wallDownLeft = 10000000000001L;
    ids.add(wallDownLeft);
    idMap.put(wallDownLeft, 1);

    UnionFind unionFind = new UnionFind(10 * K);
    for (int i = 0; i < K; i++) {
      long x = in.nextInt();
      long y = in.nextInt();

      long id = getId(x, y);
      if (!idMap.containsKey(id)) {
        idMap.put(id, idMap.size());
        ids.add(id);
      }
    }

    for (int idx = 2; idx < ids.size(); idx++) {
      long id = ids.get(idx);
      long x = x(id);
      long y = y(id);

      for (int dx = -1; dx <= 1; dx++) {
        for (int dy = -1; dy <= 1; dy++) {
          if (dx == dy && dx == 0) {
            continue;
          }

          long nx = dx + x;
          long ny = dy + y;
          if (ny < 0 || nx < 0) {
            continue;
          }

          long nid = getId(nx, ny);
          if (idMap.containsKey(nid)) {
            int nidIdx = idMap.get(nid);
            unionFind.unite(nidIdx, idx);
          }
        }
      }

      if (x == 0 || y == M - 1) {
        unionFind.unite(0, idx);
      }
      if (y == 0 || x == N - 1) {
        unionFind.unite(1, idx);
      }
    }

    if (unionFind.isSame(0, 1)) {
      out.println(0);
      return;
    }

    TreeSet<Long> abstractIds = new TreeSet<>();
    for (int idx = 2; idx < ids.size(); idx++) {
      long id = ids.get(idx);
      long x = x(id);
      long y = y(id);

      for (int dx = -1; dx <= 1; dx++) {
        for (int dy = -1; dy <= 1; dy++) {
          if (dx == dy && dx == 0) {
            continue;
          }

          long nx = dx + x;
          long ny = dy + y;
          if (ny < 0 || nx < 0) {
            continue;
          }

          long nid = getId(nx, ny);
          if (!idMap.containsKey(nid)) {
            abstractIds.add(nid);
          }
        }
      }
    }

    for (long nid : abstractIds) {
      long x = x(nid);
      long y = y(nid);
      TreeSet<Integer> neighbors = new TreeSet<>();

      for (int dx = -1; dx <= 1; dx++) {
        for (int dy = -1; dy <= 1; dy++) {
          if (dx == dy && dx == 0) {
            continue;
          }

          long nx = dx + x;
          long ny = dy + y;
          if (ny < 0 || nx < 0) {
            continue;
          }

          long next = getId(nx, ny);
          if (idMap.containsKey(next)) {
            int nextIdx = idMap.get(next);
            neighbors.add(nextIdx);
          }
        }
      }

      for (int idx1 : neighbors) {
        for (int idx2 : neighbors) {
          if (unionFind.isSame(idx1, 0) && unionFind.isSame(idx2, 1)) {
            out.println(1);
            return;
          }
          if (unionFind.isSame(idx1, 1) && unionFind.isSame(idx2, 0)) {
            out.println(1);
            return;
          }
        }
      }
    }
    out.println(2);
  }

  class UnionFind {

    // par[i]????????????i????±?????????¨??????????????????i == par[i]?????¨???????????????i?????¨?????????????????§??????
    private int[] par;
    // sizes[i]???????????????i?????¨?????????????????????????????°???i?????????????????§????????´???????????????????????¨??????
    private int[] sizes;

    // ??¨?????°
    private int size;

    UnionFind(int n) {
      par = new int[n];
      sizes = new int[n];
      size = n;
      Arrays.fill(sizes, 1);
      // ???????????¨???????????????i?????°?????????i????????¨??????????????¨???????????????
      for (int i = 0; i < n; i++) {
        par[i] = i;
      }
    }

    /**
     * ?????????x????±?????????¨???????????????
     */
    int find(int x) {
      if (x == par[x]) {
        return x;
      }
      return par[x] = find(par[x]);  // ????????????????????????????????°???????????????????????¢???
    }

    /**
     * 2???????????????x, y????±?????????¨?????????????????????
     * ???????????????????????? true ?????????
     */
    boolean unite(int x, int y) {
      // ?????????????????????????????????
      x = find(x);
      y = find(y);

      // ??¢???????????¨????±?????????????????????????????????????
      if (x == y) {
        return false;
      }

      // x?????¨???y?????¨????????§???????????????????????????
      if (sizes[x] < sizes[y]) {
        int tx = x;
        x = y;
        y = tx;
      }

      // x???y??????????????????????????£?????????
      par[y] = x;
      sizes[x] += sizes[y];
      sizes[y] = 0;  // sizes[y]????????????????????¨???????????§0?????\????????????????????????

      size--;
      return true;
    }

    /**
     * 2???????????????x, y????±?????????¨???????????????true?????????
     */
    boolean isSame(int x, int y) {
      return find(x) == find(y);
    }

    /**
     * ?????????x?????????????????¨?????§???????????????
     */
    int partialSizeOf(int x) {
      return sizes[find(x)];
    }

    /**
     * ??¨?????°?????????
     */
    int size() {
      return size;
    }
  }

  public static void main(String[] args) {
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(new FastScanner(), out);
    out.close();
  }

  private static class FastScanner {

    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int bufferLength = 0;

    private boolean hasNextByte() {
      if (ptr < bufferLength) {
        return true;
      } else {
        ptr = 0;
        try {
          bufferLength = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (bufferLength <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) {
        return buffer[ptr++];
      } else {
        return -1;
      }
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
        ptr++;
      }
    }

    boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    long nextLong() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
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

    double nextDouble() {
      return Double.parseDouble(next());
    }

    double[] nextDoubleArray(int n) {
      double[] array = new double[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextDouble();
      }
      return array;
    }

    double[][] nextDoubleMap(int n, int m) {
      double[][] map = new double[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextDoubleArray(m);
      }
      return map;
    }

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int n) {
      int[] array = new int[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextInt();
      }
      return array;
    }

    public long[] nextLongArray(int n) {
      long[] array = new long[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextLong();
      }
      return array;
    }

    public String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++) {
        array[i] = next();
      }
      return array;
    }

    public char[][] nextCharMap(int n) {
      char[][] array = new char[n][];
      for (int i = 0; i < n; i++) {
        array[i] = next().toCharArray();
      }
      return array;
    }

    public int[][] nextIntMap(int n, int m) {
      int[][] map = new int[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextIntArray(m);
      }
      return map;
    }
  }
}
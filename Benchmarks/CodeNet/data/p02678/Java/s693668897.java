import java.util.*;
import java.io.*;
 
public class Main {
  public static void main(String[] args) throws Exception{
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    Graph g = new Graph(n, m);
    for(int i = 0; i < m; ++i) {
      int x = sc.nextInt() - 1;
      int y = sc.nextInt() - 1;
      g.link(x, y);
      g.link(y, x);
    }
    new Solution(n, m, g);
  }
}

class Solution {
  public Solution(int n, int m, Graph g) {
    int[] visited = new int[n];
    int[] gt = new int[n];
    Queue<Integer> q = new LinkedList<>();
    q.add(0);
    while(!q.isEmpty()) {
      int now = q.poll();
      for(int cur = g.node[now]; cur != -1; cur = g.next[cur]) {
        if(g.to[cur] != 0 && visited[g.to[cur]] == 0) {
          visited[g.to[cur]] = visited[now] + 1;
          gt[g.to[cur]] = now;
          q.add(g.to[cur]);
        }
      }
    }
    Boolean check = true;
    for(int i = 1; i < n; ++i) {
      if(visited[i] == 0) {
        check = false;
        break;
      }
    }
    if(!check) System.out.println("No");
    else {
      System.out.println("Yes");
      for(int i = 1; i < n; ++i) {
        System.out.println(gt[i] + 1);
      }
    }
    // System.out.println(visited[0]);
    // System.out.println(res);
  }
}

    
    
class Graph {
  public int[] next;
  public int[] to;
  public int[] node;
  public int pos = 0;

  public Graph(int vertex, int edge) {
    vertex++;
    edge++;
    next = new int[edge * 2 + 1];
    to = new int[edge * 2 + 1];
    node = new int[vertex];
    Arrays.fill(next, -1);
    Arrays.fill(to, -1);
    Arrays.fill(node, -1);
  }

  public boolean link(int u, int v) {
    if(pos > next.length) return false;
    next[pos] = node[u];
    to[pos] = v;
    node[u] = pos++;
    return true;
  }
}

class FastScanner {
  private final InputStream in;
  private final byte[] buffer = new byte[1024];
  private int ptr = 0;
  private int buflen = 0;

  public FastScanner(InputStream source) {
    in = source;
  }

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
    if (hasNextByte()) return buffer[ptr++];
    else return -1;
  }

  private static boolean isPrintableChar(int c) {
    return 33 <= c && c <= 126;
  }

  public boolean hasNext() {
    while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
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

  public int nextInt() {
    long nl = nextLong();
    if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
      throw new NumberFormatException();
    return (int) nl;
  }

  public double nextDouble() {
    return Double.parseDouble(next());
  }
}
import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
  final int x, y, cost;

  Node(int x, int y, int cost) {
    this.x = x;
    this.y = y;
    this.cost = cost;
  }

  public int compareTo(Node node) {
    return this.cost - node.cost;
  }
}

class Solver {
  final int h, w, k, x1, y1, x2, y2;
  final char[][] cm;

  private static final int[] DXS = new int[]{1, 0, -1, 0};
  private static final int[] DYS = new int[]{0, 1, 0, -1};

  Solver(int h, int w, int k, int x1, int y1, int x2, int y2, char[][] cm) {
    this.h = h;
    this.w = w;
    this.k = k;
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.cm = cm;
  }

  public int solve() {
    int[][] countBlockerY = new int[h + 1][w + 1];
    for (int i = 1; i <= h; i++) {
      countBlockerY[i][0] = 0;
      for (int j = 0; j < w; j++) {
        countBlockerY[i][j + 1] = countBlockerY[i][j] + (cm[i - 1][j] == '@' ? 1 : 0);
      }
    }
    int[][] countBlockerX = new int[h + 1][w + 1];
    for (int j = 1; j <= w; j++) {
      countBlockerX[0][j] = 0;
      for (int i = 0; i < h; i++) {
        countBlockerX[i + 1][j] = countBlockerX[i][j] + (cm[i][j - 1] == '@' ? 1 : 0);
      }
    }

    boolean[][] enqued = new boolean[h + 1][w + 1];
    PriorityQueue<Node> queue = new PriorityQueue<>();
    enqued[x1][y1] = true;
    queue.add(new Node(x1, y1, 0));

    while (!queue.isEmpty()) {
      Node node = queue.poll();
      int x = node.x;
      int y = node.y;
      int cost = node.cost;
//      System.err.printf("%d %d %d\n", x, y, cost);
      if (x2 == x && y2 == y) {
        return cost;
      }
      for (int t = 0; t < 4; t++) {
        int dx = DXS[t];
        int dy = DYS[t];
        int kMax = k + 1;
        int kMin = 0;
        while (kMax - kMin > 1) {
          int kMid = (kMax + kMin) / 2;
          int nextX = x + kMid * dx;
          int nextY = y + kMid * dy;
          if (nextX < 1 || h < nextX || nextY < 1 || w < nextY) {
            kMax = kMid;
          } else if (dx != 0 && countBlockerX[x][y] != countBlockerX[nextX][nextY]) {
            kMax = kMid;
          } else if (dy != 0 && countBlockerY[x][y] != countBlockerY[nextX][nextY]) {
            kMax = kMid;
          } else if (cm[nextX - 1][nextY - 1] == '@') {
            kMax = kMid;
          } else {
            kMin = kMid;
          }
        }
//        System.err.printf("%d %d %d %d %d\n", x, y, dx, dy, kMin);
        for (int s = kMin; s > 0; s--) {
          int nextX = x + s * dx;
          int nextY = y + s * dy;
          if (enqued[nextX][nextY]) {
            break;
          }
          queue.add(new Node(nextX, nextY, cost + 1));
          enqued[nextX][nextY] = true;
        }
      }
    }
    return -1;
  }
}

public class Main {
  private static void execute(ContestReader reader, ContestWriter out) {
    int h = reader.nextInt();
    int w = reader.nextInt();
    int k = reader.nextInt();
    int x1 = reader.nextInt();
    int y1 = reader.nextInt();
    int x2 = reader.nextInt();
    int y2 = reader.nextInt();
    char[][] cm = reader.nextCharArray(h);
    out.println(new Solver(h, w, k, x1, y1, x2, y2, cm).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    ContestWriter out = new ContestWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestWriter extends PrintWriter {
  ContestWriter(PrintStream printStream) {
    super(printStream);
  }

  public void printList(List<? extends Object> list) {
    for (Object object : list) {
      println(object);
    }
  }

  public void printListOneLine(List<? extends Object> list) {
    List<String> stringList = new ArrayList<>();
    for (Object object : list) {
      stringList.add(object.toString());
    }
    println(String.join(" ", stringList));
  }
}

class ContestReader {
  private static final int BUFFER_SIZE = 1024;
  
  private final InputStream stream;
  private final byte[] buffer;
  private int pointer;
  private int bufferLength;
  
  ContestReader(InputStream stream) {
    this.stream = stream;
    this.buffer = new byte[BUFFER_SIZE];
    this.pointer = 0;
    this.bufferLength = 0;
  }
  
  private boolean hasNextByte() {
    if (pointer < bufferLength) {
      return true;
    }
    
    pointer = 0;
    try {
      bufferLength = stream.read(buffer);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return bufferLength > 0;
  }
  
  private int readByte() {
    if (hasNextByte()) {
      return buffer[pointer++];
    } else {
      return -1;
    }
  }
  
  private static boolean isPrintableChar(int c) {
    return 33 <= c && c <= 126;
  }
  
  public boolean hasNext() {
    while (hasNextByte() && !isPrintableChar(buffer[pointer])) {
      pointer++;
    }
    return hasNextByte();
  }
  
  public String next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    StringBuilder sb = new StringBuilder();
    while(true) {
      int b = readByte();
      if (!isPrintableChar(b)) {
        break;
      }
      sb.appendCodePoint(b);
    }
    return sb.toString();
  }
  
  public String nextLine() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    StringBuilder sb = new StringBuilder();
    while(true) {
      int b = readByte();
      if (!isPrintableChar(b) && b != 0x20) {
        break;
      }
      sb.appendCodePoint(b);
    }
    return sb.toString();
  }
  
  public char nextChar() {
    return next().charAt(0);
  }
  
  public int nextInt() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    
    int n = 0;
    boolean minus = false;
    
    {
      int b = readByte();
      if (b == '-') {
        minus = true;
      } else if ('0' <= b && b <= '9') {
        n = b - '0';
      } else {
        throw new NumberFormatException();
      }
    }
    
    while(true){
      int b = readByte();
      if ('0' <= b && b <= '9') {
        n *= 10;
        n += b - '0';
      } else if (b == -1 || !isPrintableChar(b)) {
        return minus ? -n : n;
      } else {
        throw new NumberFormatException();
      }
    }
  }
  
  public long nextLong() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    
    long n = 0;
    boolean minus = false;
    
    {
      int b = readByte();
      if (b == '-') {
        minus = true;
      } else if ('0' <= b && b <= '9') {
        n = b - '0';
      } else {
        throw new NumberFormatException();
      }
    }
    
    while(true){
      int b = readByte();
      if ('0' <= b && b <= '9') {
        n *= 10;
        n += b - '0';
      } else if (b == -1 || !isPrintableChar(b)) {
        return minus ? -n : n;
      } else {
        throw new NumberFormatException();
      }
    }
  }
  
  public double nextDouble() {
    return Double.parseDouble(next());
  }
  
  public String[] next(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
  }
  
  public String[] nextLine(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLine();
    }
    return array;
  }
  
  public char[] nextChar(int n) {
    char[] array = new char[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextChar();
    }
    return array;
  }
  
  public int[] nextInt(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLong(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public double[] nextDouble(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public char[] nextCharArray() {
    return next().toCharArray();
  }
  
  public String[][] next(int n, int m) {
    String[][] matrix = new String[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = next();
      }
    }
    return matrix;
  }
  
  public int[][] nextInt(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public char[][] nextChar(int n, int m) {
    char[][] matrix = new char[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextChar();
      }
    }
    return matrix;
  }
  
  public long[][] nextLong(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDouble(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
  
  public char[][] nextCharArray(int n) {
    char[][] matrix = new char[n][];
    for (int i = 0; i < n; i++) {
      matrix[i] = next().toCharArray();
    }
    return matrix;
  }
}

class MyAssert {
  public static void myAssert(boolean flag, String message) {
    if (!flag) {
      throw new RuntimeException(message);
    }
  }
 
  public static void myAssert(boolean flag) {
    myAssert(flag, "");
  }
}

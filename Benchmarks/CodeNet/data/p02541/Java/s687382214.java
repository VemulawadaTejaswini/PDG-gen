import java.io.*;
import java.util.*;

// http://www.tbasic.org/reference/old/ExEuclid.html
class ExtendedGcdSolver {
  long x, y, g;

  // Usage: solve(a, b)
  // a * this.x + b * this.y = this.g
  public long solve(long a, long b) {
    long r0 = a;
    long r1 = b;
    long x0 = 1;
    long x1 = 0;
    long y0 = 0;
    long y1 = 1;

    while (r1 > 0) {
      long q1 = r0 / r1;
      long r2 = r0 % r1;
      long x2 = x0 - q1 * x1;
      long y2 = y0 - q1 * y1;
      r0 = r1;
      r1 = r2;
      x0 = x1;
      x1 = x2;
      y0 = y1;
      y1 = y2;
    }
    x = x0;
    y = y0;
    g = r0;
    return g;
  }
}

class Solver {
  final long n;
  List<Long> ps;
  ExtendedGcdSolver extendedGcdSolver;

  Solver(long n) {
    this.n = n;
    this.extendedGcdSolver = new ExtendedGcdSolver();
  }

  /*
  private static long extendGcd(long a, long b, long[] x, long[] y) {
    if (b == 0) {
      x[0] = 1;
      y[0] = 0;
      return a;
    }

    long d = extendGcd(b, a % b, y, x);
    y[0] -= a / b * x[0];
    return d;
  }
  */

  private static long mul(long a, long b) {
    double da = a;
    double db = b;
    if (da * db > 1e16) {
      return Long.MAX_VALUE;
    }
    return a * b;
  }

  private long dfs(int index, long a, long b) {
    if (index == ps.size()) {
      // ax + by = 1
      /*
      long[] x = new long[1];
      long[] y = new long[1];
      extendGcd(a, b, x, y);
      */
      long g = extendedGcdSolver.solve(a, b);
      long x = extendedGcdSolver.x;
      long y = extendedGcdSolver.y;
//      System.err.printf("a: %d, b: %d, x: %d, y: %d, g: %d, a * x + b * y: %d\n", a, b, x, y, g, a * x + b * y);
      long v1 = mul(a, Math.abs(x));
      long v2 = mul(b, Math.abs(y));
      long min = Math.min(v1, v2);
      if (min == 0) {
        return Long.MAX_VALUE;
      }
      return min;
    }
    long p = ps.get(index);
    return Math.min(dfs(index + 1, a * p, b), dfs(index + 1, a, p * b));
  }

  public long solve() {
    if (n == 1) {
      return 1;
    }
    long tempN = 2 * n;
    ps = new ArrayList<>();
    for (long v = 2; v * v <= tempN; v++) {
      if (tempN % v != 0) {
        continue;
      }
      long p = 1;
      while (tempN % v == 0) {
        p *= v;
        tempN /= v;
      }
      ps.add(p);
    }
    if (tempN > 1) {
      ps.add(tempN);
    }
    return dfs(0, 1, 1);
  }
}

public class Main {
  private static void execute(ContestReader reader, ContestWriter out) {
    long n = reader.nextLong();
    out.println(new Solver(n).solve());
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

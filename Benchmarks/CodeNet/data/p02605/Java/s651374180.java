import java.io.*;
import java.util.*;

class OneD implements Comparable<OneD> {
  final int v;
  final boolean positive;

  OneD(int v, boolean positive) {
    this.v = v;
    this.positive = positive;
  }

  public int compareTo(OneD oneD) {
    return this.v - oneD.v;
  }
}

public class Main {
  private static final int XYMax = 200_010;

  private static int solve(List<OneD> list) {
    int min = Integer.MAX_VALUE;
    Collections.sort(list);
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i - 1).positive && !list.get(i).positive) {
        min = Math.min(min, (list.get(i).v - list.get(i - 1).v) * 5);
      }
    }
    return min;
  }

  private static int solve2(List<OneD> list) {
    int min = Integer.MAX_VALUE;
    Collections.sort(list);

    int positiveXMax = Integer.MIN_VALUE;
    for (OneD oneD : list) {
      if (oneD.positive) {
        positiveXMax = oneD.v;
      } else if (positiveXMax != Integer.MIN_VALUE) {
        min = Math.min(min, (oneD.v - positiveXMax) * 10);
      }
    }
    return min;
  }

  private static String solve(int n, String[][] xyus) {
    int[] xs = new int[n];
    int[] ys = new int[n];
    String[] us = new String[n];
    for (int i = 0; i < n; i++) {
      xs[i] = Integer.parseInt(xyus[i][0]);
      ys[i] = Integer.parseInt(xyus[i][1]);
      us[i] = xyus[i][2];
    }

    int min = Integer.MAX_VALUE;
    {
      List<List<OneD>> matrix = new ArrayList<>();
      for (int i = 0; i < XYMax; i++) {
        matrix.add(new ArrayList<>());
      }
      for (int i = 0; i < n; i++) {
        if (us[i].equals("U")) {
          matrix.get(xs[i]).add(new OneD(ys[i], true));
        } else if (us[i].equals("D")) {
          matrix.get(xs[i]).add(new OneD(ys[i], false));
        }
      }
      for (int i = 0; i < XYMax; i++) {
        min = Math.min(min, solve(matrix.get(i)));
      }
    }

    {
      List<List<OneD>> matrix = new ArrayList<>();
      for (int i = 0; i < XYMax; i++) {
        matrix.add(new ArrayList<>());
      }
      for (int i = 0; i < n; i++) {
        if (us[i].equals("R")) {
          matrix.get(ys[i]).add(new OneD(xs[i], true));
        } else if (us[i].equals("L")) {
          matrix.get(ys[i]).add(new OneD(xs[i], false));
        }
      }
      for (int i = 0; i < XYMax; i++) {
        min = Math.min(min, solve(matrix.get(i)));
      }
    }

    {
      List<List<OneD>> matrix1 = new ArrayList<>();
      List<List<OneD>> matrix2 = new ArrayList<>();
      List<List<OneD>> matrix3 = new ArrayList<>();
      List<List<OneD>> matrix4 = new ArrayList<>();
      for (int i = 0; i < 4 * XYMax; i++) {
        matrix1.add(new ArrayList<>());
        matrix2.add(new ArrayList<>());
        matrix3.add(new ArrayList<>());
        matrix4.add(new ArrayList<>());
      }
      for (int i = 0; i < n; i++) {
        if (us[i].equals("U")) {
          matrix1.get(xs[i] + ys[i] + 2 * XYMax).add(new OneD(xs[i], false));
          matrix3.get(xs[i] - ys[i] + 2 * XYMax).add(new OneD(xs[i], true));
        } else if (us[i].equals("R")) {
          matrix1.get(xs[i] + ys[i] + 2 * XYMax).add(new OneD(xs[i], true));
          matrix4.get(xs[i] - ys[i] + 2 * XYMax).add(new OneD(xs[i], true));
        } else if (us[i].equals("D")) {
          matrix2.get(xs[i] + ys[i] + 2 * XYMax).add(new OneD(xs[i], true));
          matrix4.get(xs[i] - ys[i] + 2 * XYMax).add(new OneD(xs[i], false));
        } else if (us[i].equals("L")) {
          matrix2.get(xs[i] + ys[i] + 2 * XYMax).add(new OneD(xs[i], false));
          matrix3.get(xs[i] - ys[i] + 2 * XYMax).add(new OneD(xs[i], false));
        }
      }
      for (int i = 0; i < 4 * XYMax; i++) {
        min = Math.min(min, solve2(matrix1.get(i)));
        min = Math.min(min, solve2(matrix2.get(i)));
        min = Math.min(min, solve2(matrix3.get(i)));
        min = Math.min(min, solve2(matrix4.get(i)));
      }
    }
    if (min == Integer.MAX_VALUE) {
      return "SAFE";
    }
    return String.format("%d", min);
   }

  private static void execute(ContestReader reader, ContestWriter out) {
    int n = reader.nextInt();
    String[][] xyus = reader.next(n, 3);
    out.println(solve(n, xyus));
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

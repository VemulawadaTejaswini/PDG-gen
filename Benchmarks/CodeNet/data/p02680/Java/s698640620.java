import java.io.*;
import java.util.*;

class Solver {
  final int n, m;
  final int[][] abcs, defs;

  Solver(int n, int m, int[][] abcs, int[][] defs) {
    this.n = n;
    this.m = m;
    this.abcs = abcs;
    this.defs = defs;
  }

  private static final int[] DX = new int[]{1, 0, -1, 0};
  private static final int[] DY = new int[]{0, 1, 0, -1};

  public String solve() {
    Set<Integer> xSet = new HashSet<>();
    Set<Integer> ySet = new HashSet<>();
    xSet.add(-2_000_000_000);
    xSet.add(2_000_000_000);
    ySet.add(-2_000_000_000);
    ySet.add(2_000_000_000);
    for (int[] abc : abcs) {
      int a = abc[0];
      int b = abc[1];
      int c = abc[2];
      xSet.add(a);
      xSet.add(b);
      ySet.add(c);
    }
    for (int[] def : defs) {
      int d = def[0];
      int e = def[1];
      int f = def[2];
      xSet.add(d);
      ySet.add(e);
      ySet.add(f);
    }
    int xSize = xSet.size();
    int ySize = ySet.size();
    List<Integer> xList = new ArrayList<>();
    List<Integer> yList = new ArrayList<>();
    xList.addAll(xSet);
    yList.addAll(ySet);
    xSet = null;
    ySet = null;
    Collections.sort(xList);
    Collections.sort(yList);
    Map<Integer, Integer> xMap = new HashMap<>();
    Map<Integer, Integer> yMap = new HashMap<>();
    for (int i = 0; i < xSize; i++) {
      xMap.put(xList.get(i), i);
    }
    for (int i = 0; i < ySize; i++) {
      yMap.put(yList.get(i), i);
    }

    boolean[][] blocker = new boolean[2 * xSize][2 * ySize];
    for (int i = 0; i < xSize; i++) {
      for (int j = 0; j < ySize; j++) {
        blocker[2 * i][2 * j] = true;
      }
    }
    for (int[] def : defs) {
      int d = def[0];
      int e = def[1];
      int f = def[2];
      int xIndex = xMap.get(d);
      int yIndexMin = yMap.get(e);
      int yIndexMax = yMap.get(f);
      for (int y = yIndexMin; y < yIndexMax; y++) {
        blocker[2 * xIndex][2 * y + 1] = true;
      }
    }
    for (int[] abc : abcs) {
      int a = abc[0];
      int b = abc[1];
      int c = abc[2];
      int yIndex = yMap.get(c);
      int xIndexMin = xMap.get(a);
      int xIndexMax = xMap.get(b);
      for (int x = xIndexMin; x < xIndexMax; x++) {
        blocker[2 * x + 1][2 * yIndex] = true;
      }
    }
    xMap = null;
    yMap = null;

    int startXIndex = -1;
    for (int i = 1; i < xSize; i++) {
      if (xList.get(i - 1) < 0 && 0 <= xList.get(i)) {
        startXIndex = 2 * (i - 1) + 1;
        break;
      }
    }

    int startYIndex = -1;
    for (int i = 1; i < ySize; i++) {
      if (yList.get(i - 1) < 0 && 0 <= yList.get(i)) {
        startYIndex = 2 * (i - 1) + 1;
        break;
      }
    }

    long answer = 0;
    Deque<Integer> xIndexStack = new ArrayDeque<>();
    Deque<Integer> yIndexStack = new ArrayDeque<>();
    boolean[][] enqueued = new boolean[2 * xSize][2 * ySize];
    enqueued[startXIndex][startYIndex] = true;
    xIndexStack.add(startXIndex);
    yIndexStack.add(startYIndex);
    while (!xIndexStack.isEmpty()) {
      int xIndex = xIndexStack.pollLast();
      int yIndex = yIndexStack.pollLast();
      if (xIndex == 0 || yIndex == 0 || xIndex == 2 * xSize - 1 || yIndex == 2 * ySize - 1) {
        return "INF";
      }
      if (xIndex % 2 == 1 && yIndex % 2 == 1) {
        long xMax = xList.get(xIndex / 2 + 1);
        long xMin = xList.get(xIndex / 2);
        long yMax = yList.get(yIndex / 2 + 1);
        long yMin = yList.get(yIndex / 2);
        answer += (xMax - xMin) * (yMax - yMin);  
      }
      for (int k = 0; k < 4; k++) {
        int nextXIndex = xIndex + DX[k];
        int nextYIndex = yIndex + DY[k];
        if (!blocker[nextXIndex][nextYIndex] && !enqueued[nextXIndex][nextYIndex]) {
          enqueued[nextXIndex][nextYIndex] = true;
          xIndexStack.add(nextXIndex);
          yIndexStack.add(nextYIndex);
        }
      }
    }
    return Long.toString(answer);
  }
}

public class Main {
  private static void execute(ContestReader reader, ContestWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    int[][] abcs = reader.nextInt(n, 3);
    int[][] defs = reader.nextInt(m, 3);
    out.println(new Solver(n, m, abcs, defs).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    ContestWriter out = new ContestWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestWriter extends PrintWriter {
  ContestWriter(PrintStream printeStream) {
    super(printeStream);
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

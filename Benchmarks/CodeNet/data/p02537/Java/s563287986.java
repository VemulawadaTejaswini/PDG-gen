import java.io.*;
import java.util.*;



public class Main {
  private static final UpdateSingleGetRangeSegmentTree.Operator<Integer> OPERATOR = new UpdateSingleGetRangeSegmentTree.Operator<>() {
    @Override
    public Integer update(Integer originalValue, Integer argumentValue) {
      return argumentValue;
    }

    @Override
    public Integer merge(Integer smallValue, Integer largeValue) {
      return Math.max(smallValue, largeValue);
    }

    @Override
    public Integer getUnitValue() {
      return Integer.valueOf(0);
    }

  };

  private static int solve(int n, int k, int[] as) {
    int aMax = 300_000;
    Integer[] initialValues = new Integer[aMax + 1];
    Arrays.fill(initialValues, Integer.valueOf(0));
    UpdateSingleGetRangeSegmentTree<Integer> segmentTree = new UpdateSingleGetRangeSegmentTree<>(OPERATOR, initialValues);
    for (int a : as) {
      int v1 = segmentTree.getRange(Math.max(0, a - k), Math.min(a + k + 1, aMax + 2));
      int v2 = segmentTree.getRange(a, a + 1);
      if (v2 < v1 + 1) {
        segmentTree.update(a, v1 + 1);
      }
//      segmentTree.dump();
    }
    return segmentTree.getRange(0, n + 1);
  }

  private static void execute(ContestReader reader, ContestWriter out) {
    int n = reader.nextInt();
    int k = reader.nextInt();
    int[] as = reader.nextInt(n);
    out.println(solve(n, k, as));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    ContestWriter out = new ContestWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

// Verify ABC 157 E
// https://atcoder.jp/contests/abc157/tasks/abc157_e

class UpdateSingleGetRangeSegmentTree<T> {
  interface Operator<T> {
    T update(T originalValue, T argumentValue);
    T merge(T smallValue, T largeValue);
    T getUnitValue();
  }
  
  private final Operator<T> operator;
  private final int n;
  private final List<T> values;
  
  UpdateSingleGetRangeSegmentTree(Operator<T> operator, T[] initialValues) {
    this.operator = operator;
    
    int tempN = 1;
    while (tempN < initialValues.length) {
      tempN *= 2;
    }
    n = tempN;
    values = new ArrayList<>();
    for (int i = 0; i < 2 * n - 1; i++) {
      values.add(null);
    }
    for (int i = 0; i < initialValues.length; i++) {
      values.set(i + n - 1, initialValues[i]);
    }
    for (int i = initialValues.length; i < n; i++) {
      values.set(i + n - 1, this.operator.getUnitValue());
    }
    
    for (int i = n - 2; i >= 0; i--) {
      values.set(i, this.operator.merge(values.get(2 * i + 1), values.get(2 * i + 2)));
    }
  }
  
  public void update(int index, T argumentValue) {
    index += n - 1;
    values.set(index, operator.update(values.get(index), argumentValue));
    while (index > 0) {
      index = (index - 1) / 2;
      values.set(index, this.operator.merge(values.get(2 * index + 1), values.get(2 * index + 2)));
    }
  }
  
  private T getRange(int a, int b, int k, int l, int r) {
    if (r <= a || b <= l) {
      return operator.getUnitValue();
    }
    if (a <= l && r <= b) {
      return values.get(k);
    }
    T vl = getRange(a, b, 2 * k + 1, l, (l + r) / 2);
    T vr = getRange(a, b, 2 * k + 2, (l + r) / 2, r);
    return operator.merge(vl, vr);
  }
  
  public T getRange(int a, int b) {
    return getRange(a, b, 0, 0, n);
  }

  public void dump() {
    int sum = 0;
    for (int i = 0; sum + (1 << i) <= 2 * n - 1; sum += 1 << i, i++) {
      for (int j = sum; j < sum + (1 << i); j++) {
        System.err.print(values.get(j));
        System.err.print(" ");
      }
      System.err.println();
    }
    System.err.println();
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

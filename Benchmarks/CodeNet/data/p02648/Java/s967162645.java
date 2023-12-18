import java.io.*;
import java.util.*;

class Solver {
  final int n, q;
  final int[][] vws, vls;

  int height;
  int halfHeight;

  Solver(int n, int[][] vws, int q, int[][] vls) {
    this.n = n;
    this.vws = vws;
    this.q = q;
    this.vls = vls;
  }

  List<Integer> solve() {
    height = 0;
    while ((1 << height) < n + 1) {
      height++;
    }
    halfHeight = height / 2 + 1;
    if (halfHeight >= height) {
      halfHeight--;
    }

    List<TreeMap<Integer, Integer>> treeMapList = new ArrayList<>();
    {
      TreeMap<Integer, Integer> treeMap = new TreeMap<>();
      treeMap.put(0, 0);
      treeMapList.add(treeMap);
    }
    for (int i = 1; i <= (1 << halfHeight); i++) {
      TreeMap<Integer, Integer> treeMap = new TreeMap<>();
      TreeMap<Integer, Integer> parentTreeMap = treeMapList.get(i / 2);
      for (Map.Entry<Integer, Integer> entry : parentTreeMap.entrySet()) {
        treeMap.put(entry.getKey(), entry.getValue());
      }
      for (Map.Entry<Integer, Integer> entry : parentTreeMap.entrySet()) {
        int value = vws[i - 1][0];
        int weight = vws[i - 1][1];
        int key = entry.getKey() + weight;
        int insertValue = entry.getValue() + value;
        if (treeMap.floorEntry(key).getValue() < insertValue) {
          treeMap.put(key, insertValue);
        }
      }
      int prevMaxValue = -1;
      Iterator<Map.Entry<Integer, Integer>> it = treeMap.entrySet().iterator();
      while (it.hasNext()) {
        Map.Entry<Integer, Integer> entry = it.next();
        if (entry.getValue() <= prevMaxValue) {
          it.remove();
        } else {
          prevMaxValue = entry.getValue();
        }
      }
      treeMapList.add(treeMap);
    }

    List<Integer> answers = new ArrayList<>();
    for (int[] vl : vls) {
      int v = vl[0];
      int l = vl[1];
      if (v < treeMapList.size()) {
        answers.add(treeMapList.get(v).floorEntry(l).getValue());
        continue;
      }
      List<Integer> values = new ArrayList<>();
      List<Integer> weights = new ArrayList<>();
      int tempV = v;
      while (tempV >= treeMapList.size()) {
        values.add(vws[tempV - 1][0]);
        weights.add(vws[tempV - 1][1]);
        tempV /= 2;
      }
      v = tempV;
      int answer = 0;
      for (int bitset = 0; bitset < (1 << values.size()); bitset++) {
        int sumWeight = 0;
        int sumValue = 0;
        for (int i = 0; i < values.size(); i++) {
          if (((bitset >> i) & 1) == 1) {
            sumWeight += weights.get(i);
            sumValue += values.get(i);
          }
        }
        if (sumWeight > l) {
          continue;
        }
        answer = Math.max(answer, sumValue + treeMapList.get(v).floorEntry(l - sumWeight).getValue());
      }
      answers.add(answer);
    }
    return answers;
  }
}

public class Main {
  private static void execute(ContestReader reader, ContestWriter out) {
    int n = reader.nextInt();
    int[][] vws = reader.nextInt(n, 2);
    int q = reader.nextInt();
    int[][] vls = reader.nextInt(q, 2);
    out.printList(new Solver(n, vws, q, vls).solve());
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

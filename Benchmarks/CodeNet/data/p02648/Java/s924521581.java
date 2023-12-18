import java.io.*;
import java.util.*;

class QueueItem {
  final int value, weight, index;

  QueueItem(int value, int weight, int index) {
    this.value = value;
    this.weight = weight;
    this.index = index;
  }
}

class Solver {
  private static final int MAX_L = 100_000;

  final int n, q;
  final int[][] vws, vls;
  int[][] halfDpTable;

  Solver(int n, int[][] vws, int q, int[][] vls) {
    this.n = n;
    this.vws = vws;
    this.q = q;
    this.vls = vls;
  }

  public List<Integer> solve() {
    int logN = 0;
    while ((1 << logN) < n) {
      logN++;
    }

    int halfLogN = logN / 2;
    halfDpTable = new int[(1 << halfLogN) + 1][MAX_L + 1];
    Arrays.fill(halfDpTable[0], 0);
    for (int i = 1; i <= (1 << halfLogN); i++) {
      int[] vw = vws[i - 1];
      int v = vw[0];
      int w = vw[1];
      for (int weight = MAX_L; weight >= 0; weight--) {
        if (weight >= w) {
          halfDpTable[i][weight] = Math.max(halfDpTable[i / 2][weight], halfDpTable[i / 2][weight - w] + v);
        } else {
          halfDpTable[i][weight] = halfDpTable[i / 2][weight];
        }
      }
    }

    List<Integer> answers = new ArrayList<>();
    for (int[] vl : vls) {
      int v = vl[0];
      int l = vl[1];

      if (v <= (1 << halfLogN)) {
        answers.add(halfDpTable[v][l]);
        continue;
      }

      List<Integer> itemValueList = new ArrayList<>();
      List<Integer> itemWeightList = new ArrayList<>();
      while (v > (1 << halfLogN)) {
        int[] valueAndWeight = vws[v - 1];
        int itemValue = valueAndWeight[0];
        int itemWeight = valueAndWeight[1];
        itemValueList.add(itemValue);
        itemWeightList.add(itemWeight);
        v /= 2;
      }

      int answer = 0;
      Deque<QueueItem> queue = new ArrayDeque<>();
      queue.addLast(new QueueItem(0, 0, 0));
      while (!queue.isEmpty()) {
        QueueItem queueItem = queue.pollFirst();
        if (queueItem.index >= itemValueList.size()) {
          answer = Math.max(answer, queueItem.value + halfDpTable[v][l - queueItem.weight]);
          continue;
        }
        queue.add(new QueueItem(queueItem.value, queueItem.weight, queueItem.index + 1));
        if (queueItem.weight + itemWeightList.get(queueItem.index) <= l) {
          queue.add(new QueueItem(queueItem.value + itemValueList.get(queueItem.index), queueItem.weight + itemWeightList.get(queueItem.index), queueItem.index + 1));
        }
      }


      /*
      for (int bitset = 0; bitset < (1 << itemValueList.size()); bitset++) {
        int sumValue = 0;
        int sumWeight = 0;
        for (int i = 0; i < itemValueList.size(); i++) {
          if (((bitset >> i) & 1) == 1) {
            sumValue += itemValueList.get(i);
            sumWeight += itemWeightList.get(i);
          }
        }
        if (sumWeight > l) {
          continue;
        }
        answer = Math.max(answer, halfDpTable[v][l - sumWeight] + sumValue);
      }
      */


      /*
      int[] dptable = new int[l + 1];
      while (v > (1 << halfLogN)) {
        int[] valueAndWeight = vws[v - 1];
        int itemValue = valueAndWeight[0];
        int itemWeight = valueAndWeight[1];
        for (int weight = l; weight >= itemWeight; weight--) {
          dptable[weight] = Math.max(dptable[weight], dptable[weight - itemWeight] + itemValue);
        }
        v /= 2;
      }
      int answer = 0;
      for (int weight = 0; weight <= l; weight++) {
        answer = Math.max(answer, halfDpTable[v][weight] + dptable[l - weight]);
      }

      answers.add(answer);
      */
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

import java.io.*;
import java.util.*;

class Solver {
  final int n, m;
  final char[][] cm;

  private MaxFlowSolver maxFlowSolver;

  Solver(int n, int m, char[][] cm) {
    this.n = n;
    this.m = m;
    this.cm = cm;
  }

  private int toNodeIndex(int i, int j) {
    return m * i + j;
  }

  private int getI(int nodeIndex) {
    return nodeIndex / m;
  }

  private int getJ(int nodeIndex) {
    return nodeIndex % m;
  }

  private void addEdge(int i1, int j1, int i2, int j2) {
    int nodeIndex1 = toNodeIndex(i1, j1);
    int nodeIndex2 = toNodeIndex(i2, j2);
    if ((i1 + j1) % 2 == 0) {
      maxFlowSolver.addEdge(nodeIndex1, nodeIndex2, 1);
    } else {
      maxFlowSolver.addEdge(nodeIndex2, nodeIndex1, 1);
    }
  }

  List<String> solve() {
    maxFlowSolver = new MaxFlowSolver(n * m + 2);
    int source = n * m;
    int destination = n * m + 1;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (cm[i][j] == '#') {
          continue;
        }
        int nodeIndex = toNodeIndex(i, j);
        if ((i + j) % 2 == 0) {
          maxFlowSolver.addEdge(source, nodeIndex, 1);
        } else {
          maxFlowSolver.addEdge(nodeIndex, destination, 1);
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 1; j < m; j++) {
        if (cm[i][j - 1] == '#' || cm[i][j] == '#') {
          continue;
        }
        addEdge(i, j, i, j - 1);
      }
    }

    for (int i = 1; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (cm[i - 1][j] == '#' || cm[i][j] == '#') {
          continue;
        }
        addEdge(i, j, i - 1, j);
      }
    }

    int f = maxFlowSolver.flow(n * m, n * m + 1);
//    System.err.println(f);
    MaxFlowSolver.Edge[] edges = maxFlowSolver.getEdges();
    for (MaxFlowSolver.Edge edge : edges) {
//      System.err.printf("%d -> %d: %d / %d\n", edge.fromNodeIndex, edge.toNodeIndex, edge.flow, edge.capacity);
      if (edge.fromNodeIndex == n * m || edge.toNodeIndex == n * m + 1 || edge.flow == 0) {
        continue;
      }
      int minNodeIndex = Math.min(edge.fromNodeIndex, edge.toNodeIndex);
      int maxNodeIndex = Math.max(edge.fromNodeIndex, edge.toNodeIndex);
      int minI = getI(minNodeIndex);
      int maxI = getI(maxNodeIndex);
      int minJ = getJ(minNodeIndex);
      int maxJ = getJ(maxNodeIndex);
      if (minI == maxI) {
        cm[minI][minJ] = '>';
        cm[maxI][maxJ] = '<';
      } else {
        cm[minI][minJ] = 'v';
        cm[maxI][maxJ] = '^';
      }
    }

    List<String> answers = new ArrayList<>();
    for (char[] cs : cm) {
      answers.add(new String(cs));
    }
    return answers;
  }
}

public class Main {
  private static void execute(ContestReader reader, ContestWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    char[][] cm = reader.nextCharArray(n);
    out.printList(new Solver(n, m, cm).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    ContestWriter out = new ContestWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class MaxFlowSolver {
  public class Edge {
    final int fromNodeIndex, toNodeIndex;
    final int capacity, flow;

    Edge(int fromNodeIndex, int toNodeIndex, int capacity, int flow) {
      this.fromNodeIndex = fromNodeIndex;
      this.toNodeIndex = toNodeIndex;
      this.capacity = capacity;
      this.flow = flow;
    }
  }

  private class InternalEdge {
    int id;
    int fromNodeIndex;
    int toNodeIndex;
    InternalEdge reverseEdge;
    int capacity;

    void set(int id, int fromNodeIndex, int toNodeIndex, InternalEdge reverseEdge, int capacity) {
      this.fromNodeIndex = fromNodeIndex;
      this.toNodeIndex = toNodeIndex;
      this.reverseEdge = reverseEdge;
      this.capacity = capacity;
    }
  }

  private final int n;
  private final List<InternalEdge> edges;
//  private final ArrayList[] graph;
  private final List<List<InternalEdge>> graph;

  private final int[] bfsLevel;
  private final Deque<Integer> bfsQueue;

  private final int[] dfsIterators;

  public MaxFlowSolver(int n) {
    this.n = n;
    this.edges = new ArrayList<>();
    this.graph = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      this.graph.add(new ArrayList<>());
    }

    this.bfsLevel = new int[n];
    this.bfsQueue = new ArrayDeque<>();
    this.dfsIterators = new int[n];
  }

  public int addEdge(int fromNodeIndex, int toNodeIndex, int capacity) {
    InternalEdge fromEdge = new InternalEdge();
    InternalEdge toEdge = new InternalEdge();
    int m = edges.size();
    fromEdge.set(m, fromNodeIndex, toNodeIndex, toEdge, capacity);
    toEdge.set(-1, toNodeIndex, fromNodeIndex, fromEdge, 0);
    graph.get(fromNodeIndex).add(fromEdge);
    graph.get(toNodeIndex).add(toEdge);
    edges.add(fromEdge);
    return m;
  }

  Edge getEdge(int edgeIndex) {
    InternalEdge edge = edges.get(edgeIndex);
    InternalEdge reverseEdge = edge.reverseEdge;
    return new Edge(edge.fromNodeIndex, edge.toNodeIndex, edge.capacity + reverseEdge.capacity, reverseEdge.capacity);
  }

  Edge[] getEdges() {
    Edge[] returnEdges = new Edge[edges.size()];
    for (int i = 0; i < edges.size(); i++) {
      returnEdges[i] = getEdge(i);
    }
    return returnEdges;
  }

  void changeEdge(int edgeIndex, int new_capacity, int new_flow) {
    InternalEdge edge = edges.get(edgeIndex);
    InternalEdge reverseEdge = edge.reverseEdge;
    edge.capacity = new_capacity - new_flow;
    reverseEdge.capacity = new_flow;
  }

  private void bfsForFindingPath(int srcNodeIndex, int dstNodeIndex) {
    Arrays.fill(bfsLevel, -1);
    bfsLevel[srcNodeIndex] = 0;
    bfsQueue.clear();
    bfsQueue.add(srcNodeIndex);
    while (!bfsQueue.isEmpty()) {
      int nodeIndex = bfsQueue.poll();
      for (InternalEdge edge : graph.get(nodeIndex)) {
        if (edge.capacity == 0 || bfsLevel[edge.toNodeIndex] >= 0) {
          continue;
        }
        bfsLevel[edge.toNodeIndex] = bfsLevel[nodeIndex] + 1;
        if (edge.toNodeIndex == dstNodeIndex) {
          return;
        }
        bfsQueue.addLast(edge.toNodeIndex);
      }
    }
  }

  private int dfsCalculateFlow(int srcNodeIndex, int nodeIndex, int flowLimit) {
//    System.err.printf("dfs: 0, srcNodeIndex: %d, nodeIndex: %d, flowLimit: %d\n", srcNodeIndex, nodeIndex, flowLimit);
    if (nodeIndex == srcNodeIndex) {
//      System.err.printf("dfs: 1, srcNodeIndex: %d, nodeIndex: %d, flowLimit: %d\n", srcNodeIndex, nodeIndex, flowLimit);
      return flowLimit;
    }
    int flow = 0;
    int level = bfsLevel[nodeIndex];
    for (; dfsIterators[nodeIndex] < graph.get(nodeIndex).size(); dfsIterators[nodeIndex]++) {
      int i = dfsIterators[nodeIndex];
      InternalEdge edge = graph.get(nodeIndex).get(i);
      if (level <= bfsLevel[edge.toNodeIndex] || edge.reverseEdge.capacity <= 0) {
        continue;
      }
      int d = dfsCalculateFlow(srcNodeIndex, edge.toNodeIndex, Math.min(flowLimit - flow, edge.reverseEdge.capacity));
      if (d <= 0) {
        continue;
      }
      edge.capacity += d;
      edge.reverseEdge.capacity -= d;
      flow += d;
      if (flow == flowLimit) {
        break;
      }
    }
    return flow;
  }

  public int flow(int srcNodeIndex, int dstNodeIndex) {
    return flow(srcNodeIndex, dstNodeIndex, Integer.MAX_VALUE);
  }

  public int flow(int srcNodeIndex, int dstNodeIndex, int flowLimit) {
//    System.err.printf("flow: 0: \n");
    int flow = 0;
    while (flow < flowLimit) {
//      System.err.printf("flow: 1: \n");
      bfsForFindingPath(srcNodeIndex, dstNodeIndex);
      if (bfsLevel[dstNodeIndex] == -1) {
//        System.err.printf("flow: 2: \n");
        break;
      }
      Arrays.fill(dfsIterators, 0);
//      System.err.printf("flow: 3: \n");
/*
      for (int i = 0; i < n; i++) {
        System.err.printf("flow: 3: Level[%2d] = %d\n", i, bfsLevel[i]);
      }
      */
      while (flow < flowLimit) {
//        System.err.printf("flow: 4: \n");
        int f = dfsCalculateFlow(srcNodeIndex, dstNodeIndex, flowLimit - flow);
        if (f <= 0) {
//          System.err.printf("flow: 5: \n");
          break;
        }
        flow += f;
      }
    }
//    System.err.printf("flow: 6: \n");
    return flow;
  }

  private List<Boolean> minCut(int srcNodeIndex) {
    return null;
  }
}


/*
class MaxFlowSolver {
  private class InternalEdge {
    int to, rev;
    int cap;

    InternalEdge(int to, int rev, int cap) {
      this.to = to;
      this.rev = rev;
      this.cap = cap;
    }
  }

  public class Edge {
    int from,  to;
    int cap, flow;

    Edge(int from, int to, int cap, int flow) {
      this.from = from;
      this.to = to;
      this.cap = cap;
      this.flow = flow;
    }
  }

  private final int n;
  private List<InternalEdge>[] g;
  private List<Pair> pos;

  @SuppressWarnings("unchecked")
  MaxFlowSolver(int n) {
    this.n = n;
    this.g = (ArrayList<InternalEdge>[])new Object[n];
    for (int i = 0; i < n; i++) {
      g[i] = new ArrayList<>();
    }
    this.pos = new ArrayList<>();
  }

  int addEdge(int from, int to, int cap) {
    assert(0 <= from && from < n);
    assert(0 <= to && to < n);
    assert(0 <= cap);
    int m = pos.size();
    pos.add(new Pair(from, g[from].size()));
    g[from].add(new InternalEdge(to, g[to].size(), cap));
    g[to].add(new InternalEdge(from, g[from].size() - 1, 0));
    return m;
  }

  Edge get(int i) {
    int m = pos.size();
    assert(0 <= i && i < m);
    InternalEdge edge = g[pos.get(i).first].get(pos.get(i).second);
    InternalEdge reverseEdge = g[edge.to].get(edge.rev);
    return new Edge(pos.get(i).first, edge.to, edge.cap + reverseEdge.cap, reverseEdge.cap);
  }






}
*/


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

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    LinkedList<Integer>[] childlist = new LinkedList[n];
    boolean[] rootcheck = new boolean[n];
    boolean[] leafcheck = new boolean[n];
    for(int i = 0; i < n; i++){
      childlist[i] = new LinkedList<Integer>();
    }
    for(int i = 0; i < n; i++){
      rootcheck[i] = true;
    }
    for(int i = 0; i < n; i++){
      leafcheck[i] = false;
    }
    for(int i = 0; i < n; i++){
      int nodenum = sc.nextInt();
      int childnum = sc.nextInt();
      if(childnum == 0){leafcheck[nodenum] = true;}//子を持たない=leaf
      while(childnum > 0){
        childnum--;
        int childind = sc.nextInt();
        childlist[nodenum].add(childind);
        rootcheck[childind] = false;
      }
    }

    int rootind = -1;
    for(int i = 0; i < n; i++){
      if(rootcheck[i]){
        rootind = i;
        break;
      }
    }

    int[] depthlist = new int[n];
    int[] parentlist = new int[n];
    depthlist[rootind] = 0;
    parentlist[rootind] = -1;

    LinkedList<Integer> indexqueue = new LinkedList<Integer>();
    LinkedList<Integer> depthqueue = new LinkedList<Integer>();
    indexqueue.add(rootind);
    depthqueue.add(0);
    while(!indexqueue.isEmpty()){
      int nowindex = indexqueue.poll();
      int nowdepth = depthqueue.poll();
      for(int i = 0; i < childlist[nowindex].size(); i++){
        int nowchildind = childlist[nowindex].get(i);
        depthlist[nowchildind] = nowdepth + 1;
        parentlist[nowchildind] = nowindex;
        indexqueue.add(nowchildind);
        depthqueue.add(nowdepth + 1);
      }
    }

    for(int i = 0; i < n; i++){
      System.out.print("node ");
      System.out.print(i);
      System.out.print(": parent = ");
      System.out.print(parentlist[i]);
      System.out.print(", depth = ");
      System.out.print(depthlist[i]);
      if(rootcheck[i]){
        System.out.print(", root, [");
      }else if(leafcheck[i]){
        System.out.print(", leaf, [");
      }else{
        System.out.print(", internal node, [");
      }
      for(int j = 0; j < childlist[i].size(); j++){
        if(j > 0){
          System.out.print(", ");
        }
        System.out.print(childlist[i].get(j));
      }
      System.out.println("]");
    }

  }
 
//nextChar を追加したよ！
  
// LinkedList<Integer>[] setsu = new LinkedList[n];
// for(int i = 0; i < n; i++){
//   setsu[i] = new LinkedList<Integer>();
// } 

 //ここからテンプレ
  static class InputReader {
      private InputStream stream;
      private byte[] buf = new byte[1024];
      private int curChar;
      private int numChars;
      private SpaceCharFilter filter;

      public InputReader(InputStream stream) {
          this.stream = stream;
      }
 
      public int next() {
          if (numChars == -1)
              throw new InputMismatchException();
          if (curChar >= numChars) {
              curChar = 0;
              try {
                  numChars = stream.read(buf);
              } catch (IOException e) {
                  throw new InputMismatchException();
              }
              if (numChars <= 0)
                  return -1;
          }
          return buf[curChar++];
      }
 
      public String nextStr() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        StringBuffer str = new StringBuffer();
        do{
          str.append((char)c);
          c = next();
        }while(!isSpaceChar(c));
        return str.toString();
      }

      public char nextChar() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        char ret;
        do{
          ret = (char)c;
          c = next();
        }while(!isSpaceChar(c));
        return ret;
      }

      public int nextInt() {
          int c = next();
          while (isSpaceChar(c))
              c = next();
          int sgn = 1;
          if (c == '-') {
              sgn = -1;
              c = next();
          }
          int res = 0;
          do {
              if (c < '0' || c > '9')
                  throw new InputMismatchException();
              res *= 10;
              res += c - '0';
              c = next();
          } while (!isSpaceChar(c));
          return res * sgn;
      }
 
      public boolean isSpaceChar(int c) {
          if (filter != null)
              return filter.isSpaceChar(c);
          return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
      }
 
      public interface SpaceCharFilter {
          public boolean isSpaceChar(int ch);
      }
  }
}
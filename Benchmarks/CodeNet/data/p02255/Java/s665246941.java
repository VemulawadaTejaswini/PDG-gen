import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;

 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    int[] numbers = new int[n];
    for(int i = 0; i < n; i++){
      numbers[i] = sc.nextInt();
    }

    PriorityQueue<Integer> sorted = new PriorityQueue<Integer>();
    for(int ind = 0; ind < n; ind++){
      PriorityQueue<Integer> subqueue = new PriorityQueue<Integer>();
      sorted.add(numbers[ind]);
      for(int i = 0; i <= ind; i++){
        int nownum = sorted.poll();
        System.out.print(nownum);
        if(i < n - 1){
          System.out.print(" ");
        }else{
          System.out.println("");
        }
        subqueue.add(nownum);
      }
      for(int i = ind+1; i < n; i++){
        System.out.print(numbers[i]);
        if(i < n-1){
          System.out.print(" ");
        }else{
          System.out.println("");
        }
      }
      for(int i = 0; i <= ind; i++){
        sorted.add(subqueue.poll());
      }
    }
  }
 
  
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
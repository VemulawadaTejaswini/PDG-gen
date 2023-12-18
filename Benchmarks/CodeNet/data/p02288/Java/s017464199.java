import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
 
// ALDS1_9_B

public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int h = sc.nextInt();
    int[] heapArray = new int[h + 1];
    for(int i = 1; i <= h; i++){
      heapArray[i] = sc.nextInt();
    }

    for(int i = h/2; i >= 1; i--){
      int nowindex = i;
      while(true){
        int largest = heapArray[nowindex];
        int maxindex = nowindex;
        int leftkey = -2000000001;
        int rightkey = -2000000001;
        if(nowindex * 2 <= h && largest < heapArray[nowindex * 2]){
          largest = heapArray[nowindex * 2];
          maxindex = nowindex * 2;
        }
        if(nowindex * 2 + 1 <= h && largest < heapArray[nowindex * 2 + 1]){
          largest = heapArray[nowindex * 2 + 1];
          maxindex = nowindex * 2 + 1;
        }
        if(nowindex == maxindex){break;}
        int keepnum = heapArray[nowindex];
        heapArray[nowindex] = heapArray[maxindex];
        heapArray[maxindex] = keepnum;
        nowindex = maxindex;
      }
    }

    for(int i = 1; i <= h; i++){
      System.out.printf(" %d", heapArray[i]);
    }
    System.out.println("");
  }
 
//nextChar ?????????????????????

//System.out.printf("? %d %d\n", i, j);

  
// LinkedList<Integer>[] setsu = new LinkedList[n];
// for(int i = 0; i < n; i++){
//   setsu[i] = new LinkedList<Integer>();
// } 

 //???????????????????????¬
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
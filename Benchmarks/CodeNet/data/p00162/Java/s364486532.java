import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;


 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int[] dp = new int[1000001];
    for(int i = 0; i < 1000001; i++){
      dp[i] = 0;
    }
    dp[1] = 1;
    for(int i = 1; i * 2 <= 1000000; i++){
      dp[i * 2] |= dp[i];
    }
    for(int i = 1; i * 3 <= 1000000; i++){
      dp[i * 3] |= dp[i];
    }
    for(int i = 1; i * 5 <= 1000000; i++){
      dp[i * 5] |= dp[i];
    }

    while(true){
      int m = sc.nextInt();
      if(m == 0){break;}
      int n = sc.nextInt();

      int answer = 0;
      for(int i = m; i <= n; i++){
        answer += dp[i];
      }
      System.out.println(answer);
    }

  }
 
  
 
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
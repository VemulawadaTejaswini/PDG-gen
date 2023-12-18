import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;


 
public class Main {

  private static int bai(int i){
    if(i < 5){
      return i * 2;
    }else{
      return 2 * (i - 4) - 1;
    }
  }

  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    String id = sc.nextStr();
    int m = sc.nextInt();
    int[] kouho = new int[m];
    for(int i = 0; i < m; i++){
      kouho[i] = sc.nextInt();
    }
    int summod10 = 0;
    
    //奇数番目はそのまま足す
    int oddstar = 0;
    for(int i = n - 1; i >= 0; i = i - 2){
      if(id.charAt(i) == '*'){
        oddstar++;
      }else{
        summod10 += id.charAt(i) - '0';
      }
    }

    //偶数番目は2倍して足す
    int evenstar = 0;
    for(int i = n - 2; i >= 0; i = i - 2){
      if(id.charAt(i) == '*'){
        evenstar++;
      }else{
        summod10 += bai(id.charAt(i) - '0');
      }
    }

    // System.out.println(summod10);

    int[][] dp = new int[oddstar + evenstar + 1][10];
    for(int i = 0; i < oddstar + evenstar + 1; i++){
      for(int j = 0; j < 10; j++){
        dp[i][j] = 0;
      }
    }
    dp[0][summod10 % 10] = 1;
    for(int i = 1; i < oddstar + 1; i++){
      for(int j = 0; j < m; j++){
        for(int k = 0; k < 10; k++){
          dp[i][(k + kouho[j]) % 10] += dp[i - 1][k];
        }
      }
    }
    for(int i = oddstar + 1; i < oddstar + evenstar + 1; i++){
      for(int j = 0; j < m; j++){
        for(int k = 0; k < 10; k++){
          dp[i][(k + bai(kouho[j])) % 10] += dp[i - 1][k];
        }
      }
    }

    System.out.println(dp[oddstar + evenstar][0]);
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
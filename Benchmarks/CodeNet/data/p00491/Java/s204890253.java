import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    int kk = sc.nextInt();
    int[] decided = new int[n+1];
    for(int i = 0; i <= n; i++){
      decided[i] = 0;
    }
    for(int i = 0; i < kk; i++){
      int whatday = sc.nextInt();
      int whatsource = sc.nextInt();
      decided[whatday] = whatsource;
    }
    //ソースが決まってないものは0が、決まっているものにはその番号が入っている

    //過去2日間のパスタの取り出し方
    //dp[i][j]のjに注目
    //j % 3 + 1 = 1日前  (j / 3) + 1 = 2日前 のパスタの番号
    //逆に、1日前がa、2日前がbの場合は、(b - 1) * 3 + (a - 1)となる
    int[][] dp = new int[n+1][9];
    for(int i = 0; i < 9; i++){
      dp[0][i] = 0;
    }
    if(decided[1] == 0){
      for(int i = 0; i < 3; i++){
        dp[1][i] = 1;
      }
      for(int i = 3; i < 9; i++){
        dp[1][i] = 0;
      }
    }else{
      dp[1][decided[1] - 1] = 1;
      for(int i = 0; i < 9; i++){
        if(i != decided[1] - 1){
          dp[1][i] = 0;
        }
      }
    }
    for(int i = 2; i <= n; i++){
      for(int j = 0; j < 9; j++){
        dp[i][j] = 0;
      }
    }


    if(decided[2] == 0){
      for(int j = 1; j <= 3; j++){
        for(int k = 0; k < 3; k++){
          int pastpasta = k + 1;
          dp[2][(pastpasta - 1) * 3 + j - 1] += dp[1][k];
        }
      }
    }else{
      for(int k = 0; k < 3; k++){
        int pastpasta = k + 1;
        dp[2][(pastpasta - 1) * 3 + decided[2] - 1] += dp[1][k];
      }
    }

    for(int i = 3; i <= n; i++){
      if(decided[i] == 0){//食べるパスタが決まっていないなら
        for(int j = 1; j <= 3; j++){
          for(int k = 0; k < 9; k++){
            int pastpasta = k % 3 + 1;
            int pastpastpasta = k / 3 + 1;
            if(pastpasta != j || pastpastpasta != j){
              dp[i][(pastpasta - 1) * 3 + j - 1] += dp[i - 1][k];
              dp[i][(pastpasta - 1) * 3 + j - 1] %= 10000;
            }
          }
        }
      }else{//食べるパスタが決まっているなら
        for(int k = 0; k < 9; k++){
          int pastpasta = k % 3 + 1;
          int pastpastpasta = k / 3 + 1;
          if(pastpasta != decided[i] || pastpastpasta != decided[i]){
            dp[i][(pastpasta - 1) * 3 + decided[i] - 1] += dp[i - 1][k];
            dp[i][(pastpasta - 1) * 3 + decided[i] - 1] %= 10000;
          }
        }
      }
    }

    int ans = 0;
    for(int i = 0; i < 9; i++){
      ans += dp[n][i];
    }
    System.out.println(ans % 10000);

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
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;


 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);

    while(true){
      int n = sc.nextInt();
      if(n == 0){break;}
      int[] colors = new int[n];
      for(int i = 0; i < n; i++){
        colors[i] = sc.nextInt();
      }

      int minnokori = n;

  //端っこの処理だけは、特別に行おう
      if((colors[1] == colors[2] && colors[2] == colors[3]) || (colors[n - 3] == colors[n - 2] && colors[n - 4] == colors[n - 3])){
        minnokori = n - 4;
      }

      for(int i = 1; i < n - 1; i++){
        int allcount = 0;
        int nowcolor = colors[i] % 3 + 1;
        boolean chaining = true;
        int nowleft = i - 1; int nowright = i + 1;
        int count = 1;
        while(chaining){
          while(nowleft >= 0){
            if(colors[nowleft] == nowcolor){
              count++;
              nowleft--;
            }else{
              break;
            }
          }
          while(nowright < n){
            if(colors[nowright] == nowcolor){
              count++;
              nowright++;
            }else{
              break;
            }
          }
          if(count >= 4){
            allcount += count;
            count = 0;
            if(nowleft >= 0 && nowright < n){
              nowcolor = colors[nowleft];
            }
          }else{
            chaining = false;
          }
        }
        if(minnokori > n - allcount){
          minnokori = n - allcount;
        }
      }  

      for(int i = 1; i < n - 1; i++){
        int allcount = 0;
        int nowcolor = 3;
        if(colors[i] >= 2){
          nowcolor = colors[i] - 1;
        }
        boolean chaining = true;
        int nowleft = i - 1; int nowright = i + 1;
        int count = 1;
        while(chaining){
          while(nowleft >= 0){
            if(colors[nowleft] == nowcolor){
              count++;
              nowleft--;
            }else{
              break;
            }
          }
          while(nowright < n){
            if(colors[nowright] == nowcolor){
              count++;
              nowright++;
            }else{
              break;
            }
          }
          if(count >= 4){
            allcount += count;
            count = 0;
            if(nowleft >= 0 && nowright < n){
              nowcolor = colors[nowleft];
            }
          }else{
            chaining = false;
          }
        }
        if(minnokori > n - allcount){
          minnokori = n - allcount;
        }

      }  

      System.out.println(minnokori);
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
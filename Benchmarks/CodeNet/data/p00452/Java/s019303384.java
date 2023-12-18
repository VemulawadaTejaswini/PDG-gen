import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;

class darts implements Comparable{
  int num1 = -1;
  int num2 = -1;
  int point;

  public int compareTo(Object other){
    darts otherdarts = (darts)other;
    return point - otherdarts.point;
  }

  public boolean canuseok(Object other){
    darts otherdarts = (darts)other;
    int num3 = otherdarts.num1;
    int num4 = otherdarts.num2;
    if(num1 >= 0 && num3 >= 0 && num1 == num3){return false;}    
    if(num1 >= 0 && num4 >= 0 && num1 == num4){return false;}    
    if(num2 >= 0 && num3 >= 0 && num2 == num3){return false;}    
    if(num2 >= 0 && num4 >= 0 && num2 == num4){return false;} 
    return true;   
  }
}
 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    while(true){
      int n = sc.nextInt();
      int m = sc.nextInt();
      if(n == 0 && m == 0){break;}

      int[] arr = new int[n];
      for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
      }

      // int lastind = 1 + n + n * (n - 1) / 2;
      int lastind = 1 + n + n * (n + 1) / 2;
      darts[] scores = new darts[lastind];
      darts[] sortedscores = new darts[lastind];
      darts zero = new darts();
      zero.point = 0;
      scores[0] = zero; sortedscores[0] = zero;
      for(int i = 0; i < n; i++){
        darts nowd = new darts();
        nowd.num1 = i;
        nowd.point = arr[i];
        scores[i + 1] = nowd;
        sortedscores[i + 1] = nowd;
      }

      int ind = n + 1;
      for(int i = 0; i < n; i++){
        for(int j = i; j < n; j++){
          darts nowd = new darts();
          nowd.num1 = i;
          nowd.num2 = j;
          nowd.point = arr[i] + arr[j];
          scores[ind] = nowd;
          sortedscores[ind] = nowd;
          ind++;
        }
      }
      // System.out.println(ind);

      Arrays.sort(sortedscores);
      int max = -1;
      for(int i = 1; i < lastind; i++){
        int nowpoint = scores[i].point;
        if(nowpoint > m){continue;}
        int left = 0;
        int right = lastind - 1;
        int upperline = m - nowpoint;
        while(left + 1 < right){
          int center = (left + right) / 2;
          if(sortedscores[center].point <= upperline){
            left = center;
          }else{
            right = center;
          }
          // System.out.println("here");
        }
        // System.out.println("!!!");
        int thischoice = 0;
        for(int j = 0; j < n * n; j++){
          if(/*scores[i].canuseok(sortedscores[right - j]) && */sortedscores[right - j].point <= upperline){
            thischoice = right - j;
            break;
          }
        }
        if(max < nowpoint + sortedscores[thischoice].point){
          max = nowpoint + sortedscores[thischoice].point;
        }
      }
      System.out.println(max);
  }
}
 
  
 

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
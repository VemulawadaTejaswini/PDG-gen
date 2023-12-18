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

    int[] nums = new int[n+1];
    for(int i = 0; i < n; i++){
      nums[i] = sc.nextInt();
    }
    nums[n] = 10000000;

    Arrays.sort(nums);

    int ans = 0;
    if(nums[0] != nums[1]){
      ans++;
    }


    for(int i = 1; i < n; i++){
      if(nums[i-1] == nums[i] || nums[i] == nums[i+1]){continue;}

      int[] yakusu = new int[10000];
      yakusu[0] = 1;
      int count = 1;
      for(int j = 2; j * j <= nums[i]; j++){
        if(nums[i] % j == 0){
          if(j * j == nums[i]){            
            yakusu[count] = j;
            count++;
          }else{
            yakusu[count] = j;
            yakusu[count+1] = nums[i] / j;
            count += 2;
          }
        }
      }


      //ここから二分探索の実装
      boolean exist = false;
      for(int j = 0; j < count; j++){
        int result = Arrays.binarySearch(nums, yakusu[j]);
        // System.out.println(result);
        if(result >= 0){
          exist = true;
          break;
        }
      }
      if(!exist){
        ans++;
      }

    }

    System.out.println(ans);

 
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
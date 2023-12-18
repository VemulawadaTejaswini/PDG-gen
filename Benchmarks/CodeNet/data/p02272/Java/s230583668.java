import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

 

//マージソート
//MergeSort
//mergesort
//Mergesort

public class Main {

  public static int count;

  private static int[] merge(int[] a, int left, int mid, int right){
    int[] res = new int[a.length];
    for(int i = 0; i < a.length; i++){
      res[i] = a[i];
    }
    int n1 = mid - left;
    int n2 = right - mid;
    int[] ll = new int[n1+1];
    int[] rr = new int[n2+1];
    for(int i = 0; i < n1; i++){
      ll[i] = a[left + i];
    }
    for(int i = 0; i < n2; i++){
      rr[i] = a[mid + i];
    }
    ll[n1] = 2000000000;
    rr[n2] = 2000000000;
    int i = 0;
    int j = 0;
    for(int k = left; k < right; k++){
      if(ll[i] <= rr[j]){
        res[k] = ll[i];
        i++;
      }else{
        res[k] = rr[j];
        j++;
      }
      count++;
    }
    return res;
  }

  private static int[] mergeSort(int[] a, int left, int right){
    if(left + 1 < right){
      int mid = (left + right) / 2;
      a = mergeSort(a, left, mid);
      a = mergeSort(a, mid, right);
      a = merge(a, left, mid, right);
    }
    return a;
  }

  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    count = 0;

    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i = 0; i < n; i++){
      nums[i] = sc.nextInt();
    }

    nums = mergeSort(nums, 0, n);
    for(int i = 0; i < nums.length;){
      if(i > 0){
        System.out.print(" ");
      }
      System.out.print(nums[i]);
      i++;
    }
    System.out.println("");
    System.out.println(count);
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
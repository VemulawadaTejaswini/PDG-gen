import java.io.*;

public class InsertionSort {
  public static void main(String[] args) {
    BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
    String count = new String(in.readLine());
    int nCount = Integer.parseInt(count);
    String s = new String(in.readLine());
    System.out.println(s);
    String[] arr = s.split(" ");
    for( int i = 1; i < nCount; i++ ) {
      char v = arr[i];
      int j = i - 1;
      while(j >= 0 && Integer.parseInt(arr[j]) > Integer.parseInt(v)) {
        arr[j+1] = arr[j];
        j--;
        arr[j+1] = v;
      }
      StringBuilder sb = new StringBuilder();
      for( String s : arr ) {
        sb.append(s).append(" ");
      }
      System.out.println(sb.toString());
    }
  }
}
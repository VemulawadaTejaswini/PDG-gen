import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] a = new int[n];
    int[] a_sort = new int[n];
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(in.readLine());
      a_sort[i] = a[i];
    }
    
    Arrays.sort(a_sort);
    
    for(int i=0; i<n; i++) {
      System.out.println(a_sort[n-1]!=a[i]?a_sort[n-1]:a_sort[n-2]);
    }
  }
}
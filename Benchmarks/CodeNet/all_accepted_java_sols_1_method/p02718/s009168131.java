import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    String[] a_str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    Integer[] a = new Integer[n];
    int sum = 0;

    for(int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(a_str[i]);
      sum += a[i];
    }
    
    Arrays.sort(a, Comparator.reverseOrder());
    System.out.println(a[m-1] * 4 * m >= sum?"Yes":"No");
  }
}
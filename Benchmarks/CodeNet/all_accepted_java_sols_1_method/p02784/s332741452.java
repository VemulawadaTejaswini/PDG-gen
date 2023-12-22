import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int h = Integer.parseInt(str[0]);
    int n = Integer.parseInt(str[1]);
    String[] a = in.readLine().split(" ");
    int[] a_array = new int[n];
    for(int i = 0; i<n; i++){
      a_array[i] = Integer.parseInt(a[i]);
      h -= a_array[i];
    }
    System.out.println(h<=0?"Yes":"No");
  }
}
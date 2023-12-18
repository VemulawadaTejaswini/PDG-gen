import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] p = new int[n];
    int[] p_sort = new int[n];
    int count = 0;
    String[] str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      p[i] = Integer.parseInt(str[i]);
      p_sort[i] = Integer.parseInt(str[i]);
    }
    Arrays.sort(p_sort);
    for(int i=0; i<n; i++) {
       if(p_sort[i] != p[i])
        count += 1;
    }
    System.out.println(count<=2?"YES":"NO");
  }
}
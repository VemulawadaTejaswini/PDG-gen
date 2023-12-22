import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] a = new int[n];
    boolean flg = true;
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(str[i]);
    }
    Arrays.sort(a);
    for(int i=0; i<n-1; i++) {
      if(a[i] == a[i+1])
        flg = false;
    }
    System.out.println(flg==true?"YES":"NO");
  }
}
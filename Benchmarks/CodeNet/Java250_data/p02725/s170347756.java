import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int k = Integer.parseInt(str[0]);
    int n = Integer.parseInt(str[1]);
    int[] a = new int[n];
    int diff = 0;
    int sum = 0;
    int max = 0;
    str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(str[i]);
    }
    for(int i=0; i<n-1; i++) {
      diff = a[i+1] - a[i];
      max = Math.max(diff,max);
      sum += diff;
    }
    if(k-a[n-1]+a[0]<max)
      System.out.println(sum-max+(k-a[n-1]+a[0]));
    else
      System.out.println(sum);
  }
}
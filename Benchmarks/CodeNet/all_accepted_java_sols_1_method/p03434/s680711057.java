import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] a = new int[n];
    int aliceSum = 0;
    int bobSum = 0;
    for(int i=0 ; i<n; i++) {
      a[i] = Integer.parseInt(str[i]);
    }
    Arrays.sort(a);
    for(int i=n-1; i>=0; i=i-2) {
      aliceSum += a[i];
    }
    for(int i=n-2; i>=0; i=i-2) {
      bobSum += a[i];
      
    }
    System.out.println(aliceSum-bobSum);
  }
}
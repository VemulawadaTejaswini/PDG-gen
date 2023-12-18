/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    long[] arr = new long[n];
    for (int i=0; i<n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      if (arr[i]>i || (i>0 && arr[i]>arr[i-1]+1)) {
        System.out.println("-1");
        return;
      }
    }
    long sum = 0;
    int prevPos = -1;
    long prevVal = -1;
    for (int i=n-1; i>=0; i--) {
      if (prevPos>=0 && arr[i]==prevVal-(prevPos-i)) {
        sum += 0;
      } else {
        sum += arr[i];
        prevPos = i;
        prevVal = arr[i];
      }
    }
    System.out.println(sum);
  }
}

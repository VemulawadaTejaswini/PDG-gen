import java.io.*;
import java.util.*;

public class Main {
  public static void main(String... args) {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));

    try {
      String[] line0 = br.readLine().split(" ");
      int n = Integer.parseInt(line0[0]);
      int m = Integer.parseInt(line0[1]);
      String[] line1 = br.readLine().split(" ");
      long result = 0;
      if(n == 1) {
        result = Long.parseLong(line1[0]) / (long)Math.pow(2, m);
        System.out.println(result);
        return;
      }
      PriorityQueue<Long> price
       = new PriorityQueue<Long>(Comparator.reverseOrder());
      for(int i = 0; i < n; i++) {
        price.offer(Long.parseLong(line1[i]));
      } 
      long ele = 0;
      for(int i = 0; i < m; i++) {
        ele = price.poll() / 2;
        price.offer(ele);
      }
      while(price.peek() != null) {
        result += price.poll();
      }
      System.out.println(result);
      br.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
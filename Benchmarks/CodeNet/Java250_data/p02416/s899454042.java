import java.util.*;
import java.io.*;

class Main {
  public static void main(String args[]) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] n;
    int sum;
    try {
      while (true) {
        sum = 0;
        n = br.readLine().split("(?<=.)");
        if (Integer.parseInt(n[0]) == 0) break;
        for (int i = 0; i < n.length; i++) {
          sum += Integer.parseInt(n[i]);
        }
        System.out.println(sum);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String line = br.readLine();
    line = br.readLine();
    String[] strs = line.split(" ");
    java.util.Arrays.sort(strs);
    for (int ii = 0; ii < strs.length; ii++) {
      System.out.print(strs[ii]);
      if (ii != strs.length - 1) {
        System.out.print(" ");
      } else {
        System.out.print("\n");
      }
    }
  }
}
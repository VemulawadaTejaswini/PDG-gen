import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String line = br.readLine();
    line = br.readLine();
    String[] strs = line.split(" ");
    int[] ints = new int[strs.length];
    for (int ii = 0; ii < strs.length; ii++) {
      ints[ii] = Integer.parseInt(strs[ii]);
    }
    java.util.Arrays.sort(ints);
    for (int ii = 0; ii < ints.length; ii++) {
      System.out.print(ints[ii]);
      if (ii != ints.length - 1) {
        System.out.print(" ");
      } else {
        System.out.print("\n");
      }
    }
  }
}
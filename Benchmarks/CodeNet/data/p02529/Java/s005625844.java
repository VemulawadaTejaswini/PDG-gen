import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String line = br.readLine();
    line = br.readLine();
    String[] s = line.split(" ");
    int[] ss = new int[s.length];
    for (int ii = 0; ii < s.length; ii++) {
      ss[ii] = Integer.parseInt(s[ii]);
    }
    line = br.readLine();
    line = br.readLine();
    String[] t = line.split(" ");
    int[] tt = new int[t.length];
    for (int ii = 0; ii < t.length; ii++) {
      tt[ii] = Integer.parseInt(t[ii]);
    }
    int c = 0;
    for (int ii = 0; ii < t.length; ii++) {
      for (int jj = 0; jj < s.length; jj++) {
        if (t[ii].equals(s[jj])) {
          c++;
          break;
        }
      }
    }
    System.out.println(c);
  }
}
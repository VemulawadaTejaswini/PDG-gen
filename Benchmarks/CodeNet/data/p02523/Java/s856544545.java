import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String line = br.readLine();
    String[] strs = line.split(" ");
    double[] ps = new double[strs.length];
    for (int ii = 0; ii < strs.length; ii++) {
      ps[ii] = Double.parseDouble(strs[ii]);
    }
    double d = Math.sqrt(Math.pow((ps[2] - ps[0]), 2) + Math.pow((ps[3] - ps[1]), 2));
    System.out.println(d);
  }
}
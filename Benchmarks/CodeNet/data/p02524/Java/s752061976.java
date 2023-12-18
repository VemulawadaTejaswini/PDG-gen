import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String line = br.readLine();
    String[] strs = line.split(" ");
    double a = Double.parseDouble(strs[0]);
    double b = Double.parseDouble(strs[1]);
    double c = Double.parseDouble(strs[2]);
    double h = b * Math.sin((c / 360) * 2 * Math.PI);
    System.out.printf("%f\n%f\n%f\n", a * h / 2, a + b + h, h);
  }
}
import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    String[] ar = line.split("");
    int res = 700;
    if (ar[0].equals("o")) res = res + 100;
    if (ar[1].equals("o")) res = res + 100;
    if (ar[2].equals("o")) res = res + 100;
    System.out.println(res);
  }
}
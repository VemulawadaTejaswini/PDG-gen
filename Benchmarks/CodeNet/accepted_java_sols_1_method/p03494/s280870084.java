import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    int size = Integer.parseInt(line);
    line = br.readLine();
    String data[] = line.split(" ");
    long[] array = new long[size];
    for (int i = 0; i < size; i ++) {
      long num = Long.parseLong(data[i]);
      array[i] = num;
    }
    int count = 0;
    while (true) {
      boolean flag = false;
      for (int i = 0; i < size; i ++) {
        long val = array[i];
        long res = val%2;
        if (res != 0) {
          flag = true;
        }
        val = val/2;
        array[i] = val;
      }
      if (flag) break;
      count = count + 1;
    }
    System.out.println(count);
  }
}
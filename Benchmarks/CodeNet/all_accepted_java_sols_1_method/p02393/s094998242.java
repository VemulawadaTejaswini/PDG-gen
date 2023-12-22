import java.io.*;
import java.util.*;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    String[] a = line.split(" ");
    List<Integer> list = new ArrayList<Integer>();
    for (String f : a) {
      list.add(Integer.parseInt(f));
    }
    Collections.sort(list);
    System.out.println
      (list.get(0) + " " + list.get(1) + " " + list.get(2));
  }
}
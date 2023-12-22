import java.io.*;

public class Main {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      String s = reader.readLine();
      String p = reader.readLine();
      s = s + s;
      if (s.indexOf(p) == -1) {
        System.out.println("No");
      }
      else {
        System.out.println("Yes");
      }
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
}
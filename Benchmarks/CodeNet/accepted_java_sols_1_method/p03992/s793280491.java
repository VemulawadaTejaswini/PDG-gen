import java.io.*;
public class Main {
  public static void main(String args[]) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = null;
    try {
      s = reader.readLine();
    } catch(IOException e) {
    }
    System.out.println(s.substring(0, 4) + " " + s.substring(4));
  }
}
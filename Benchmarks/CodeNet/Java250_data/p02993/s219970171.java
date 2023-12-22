import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String line = in.readLine();
    if (line == null) {
      return;
    }
    char ch = 0;
    for (int i = 0; i < line.length(); i++) {
      char input = line.charAt(i);
      if (ch == input) {
        System.out.println("Bad");
        return;
      }
      ch = input;
    }
    System.out.println("Good");
    in.close();
  }
}

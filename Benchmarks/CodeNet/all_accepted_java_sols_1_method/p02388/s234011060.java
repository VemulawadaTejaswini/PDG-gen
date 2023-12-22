import java.io.*;

public class Main {
  public static void main(String[] args) {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      int num;
      String line;
      line = reader.readLine();
      num = Integer.parseInt(line);
      System.out.println(num*num*num);
    } catch (NumberFormatException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}

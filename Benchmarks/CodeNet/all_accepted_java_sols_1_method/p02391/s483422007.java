import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] abStr = reader.readLine().split(" ");
    int a = Integer.parseInt(abStr[0]);
    int b = Integer.parseInt(abStr[1]);

    if (a < b)
      System.out.println("a < b");
    else if (a > b)
      System.out.println("a > b");
    else
      System.out.println("a == b");

  }

}
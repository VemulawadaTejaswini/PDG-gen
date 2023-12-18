import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int h = Integer.parseInt(str[0]);
    int w = Integer.parseInt(str[1]);

    for(int i=0; i<w+2; i++) {
      System.out.print("#");
    }

    System.out.println();
    
    for(int i=0; i<h; i++) {
      String a = in.readLine();
      System.out.print("#");
      System.out.print(a);
      System.out.println("#");
    }

    for(int i=0; i<w+2; i++) {
      System.out.print("#");
    }
  }
}
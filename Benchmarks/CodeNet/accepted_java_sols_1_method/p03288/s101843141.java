import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int r = Integer.parseInt(in.readLine());
    if(r<1200)
      System.out.println("ABC");
    else if(r<2800)
      System.out.println("ARC");
    else
      System.out.println("AGC");
  }
}

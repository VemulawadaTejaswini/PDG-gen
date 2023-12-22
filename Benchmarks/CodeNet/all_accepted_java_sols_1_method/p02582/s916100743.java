import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    if(str.equals("RRR"))
      System.out.println(3);
    else if(str.equals("RRS") || str.equals("SRR"))
      System.out.println(2);
    else if(str.equals("SSS"))
      System.out.println(0);
    else
      System.out.println(1);
  }
}
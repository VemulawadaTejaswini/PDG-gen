import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    int c = Integer.parseInt(str[2]);
    int d = Integer.parseInt(str[3]);
    System.out.println((Math.abs(b-a)<=d && Math.abs(c-b)<=d)
                       || Math.abs(c-a)<=d?"Yes":"No");
  }
}
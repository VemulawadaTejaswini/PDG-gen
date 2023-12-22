import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String[] param = input.split(" ");
    int a = Integer.parseInt(param[0]);
    int b = Integer.parseInt(param[1]);
    int s = a * b;
    int l = (a + b) * 2;
    System.out.println(s + " " + l);
  }
}
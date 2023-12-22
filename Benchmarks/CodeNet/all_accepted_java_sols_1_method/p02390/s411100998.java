import java.io.*;
  
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int s = Integer.parseInt(input);
    int h = (int) s / 3600;
    s -= h * 3600;
    int m = (int) s / 60;
    s -= m * 60;
  
    System.out.println(h + ":" + m + ":" + s);
  }
}
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String s = br.readLine();

    br.close();

    StringBuilder t = new StringBuilder(s);

    System.out.println(s.length() == 2 ? s : t.reverse());
  }
}
import java.io.*;

public class Main {
  
  static String s;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    s = br.readLine();

    br.close();

    boolean ok = true;
    if(s.charAt(2) != s.charAt(3)) ok = false;
    if(s.charAt(4) != s.charAt(5)) ok = false;
    System.out.println(ok ? "Yes" : "No");
  }
}
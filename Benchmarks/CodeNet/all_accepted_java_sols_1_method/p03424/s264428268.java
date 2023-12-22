
import java.io.*;

public class Main {
  
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    s = r.readLine();
    String sl[] = s.split(" ");
    
    System.out.println(s.contains("Y") ? "Four" : "Three");
  }
}

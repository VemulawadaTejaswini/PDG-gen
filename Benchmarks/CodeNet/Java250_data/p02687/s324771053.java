import java.io.*;

public class Main {
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");

    br.close();
    
    PrintWriter out = new PrintWriter(System.out);
    out.println(in[0].equals("ABC") ? "ARC" : "ABC");
    out.flush();

  }
}
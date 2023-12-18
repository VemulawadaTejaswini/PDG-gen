import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String t = br.readLine();
      String p = br.readLine();

      StringBuilder buf = new StringBuilder();
      int max = t.length() - p.length();
      int pos = 0;
      for (int i = 0; i <= max; i=pos+1) {
        pos = t.indexOf(p, i);
        if(pos == -1) break;
        buf.append(pos).append("\n");
      }
      
      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

  Set<String> set = new HashSet<>();
  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());

      StringBuilder buf = new StringBuilder();
      for(int i=0; i<n; i++)
        buf.append( solve(in.readLine()) ).append('\n');

      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  private int solve(String line) {

    if(!set.isEmpty()) set.clear();
    set.add(line);

    int end = line.length();
    String sF,sB,rF,rB;
    StringBuilder buf = new StringBuilder();
    for(int i=1; i<end; i++) {
      sF = line.substring(0,i);
      sB = line.substring(i, end);
      rF = buf.append(sF).reverse().toString();
      buf.setLength(0);
      rB = buf.append(sB).reverse().toString();
      buf.setLength(0);
      set.add(buf.append(sF).append(rB).toString());
      buf.setLength(0);
      set.add(buf.append(rF).append(sB).toString());
      buf.setLength(0);
      set.add(buf.append(rF).append(rB).toString());
      buf.setLength(0);
      set.add(buf.append(sB).append(sF).toString());
      buf.setLength(0);
      set.add(buf.append(sB).append(rF).toString());
      buf.setLength(0);
      set.add(buf.append(rB).append(sF).toString());
      buf.setLength(0);
      set.add(buf.append(rB).append(rF).toString());
      buf.setLength(0);
    }

    return set.size();
  }
}

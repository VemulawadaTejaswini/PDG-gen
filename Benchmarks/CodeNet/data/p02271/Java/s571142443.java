import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
  int n;
  int[] arr;
  public static void main(String[] args) throws IOException {

    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      n = Integer.parseInt(in.readLine());
      arr = LineToIntArr(in.readLine(), n, ' ');
      int q = Integer.parseInt(in.readLine());
      int[] seqM = LineToIntArr(in.readLine(), q, ' ');

      StringBuilder buf = new StringBuilder();
      for (int m : seqM) {
        if(solve(0, m))
          buf.append("yes\n");
        else
          buf.append("no\n");
      }

      System.out.print(buf);
    } 
    catch(IOException e) {
      System.err.println(e);
    }
  }

  private boolean solve(int i, int m) {
    if(m == 0) return true;

    if(i >= n) return false;

    return solve(i + 1, m) || solve(i + 1, m - arr[i]);
  } 

  private int[] LineToIntArr(String line, int n, char regex) {
    int offset=0,next=0;
    int[] arr = new int[n];
    boolean isContinue = true;
    for(int i=0; isContinue; i++) {
      if((next = line.indexOf(regex,offset)) == -1) {
        next = line.length();
        isContinue = false;
      }
      arr[i] = Integer.parseInt(line.substring(offset, next));
      offset = ++next;
    }

    return arr;
  }
 
}

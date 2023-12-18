import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());
      int[] seqS = new int[n];
      LineToInt(seqS, in.readLine(), ' ');
      int q = Integer.parseInt(in.readLine());
      int[] seqT = new int[q];
      LineToInt(seqT, in.readLine(), ' ');

      int cnt=0;
      for (int key : seqT) {
        if(linerSerach(seqS, key))
          cnt++;
      }

      System.out.println(cnt);
      
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  private boolean linerSerach(int[] arr, int key) {

    for(int i: arr)
      if(i == key) return true;

    return false;
  }

  void LineToInt(int[] arr, String line, char regex) {
    int offset=0,next=0;
    boolean isEnd = false;
    for(int i=0; !isEnd; i++) {
      if((next = line.indexOf(regex,offset)) == -1) {
        next = line.length();
        isEnd = true;
      }
      arr[i] = Integer.parseInt(line.substring(offset, next));
      offset = ++next;
    }

  }
}

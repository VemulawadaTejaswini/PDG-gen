import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  int n, pPre,pPost;
  int[] pre,in,post;

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      n = Integer.parseInt(br.readLine());
      String[] linesPre =  br.readLine().split(" ");
      String[] linesIn  =  br.readLine().split(" ");

      pre  = new int[n];
      in   = new int[n];
      post = new int[n];
  
      for(int i=0; i<n; i++){
        pre[i] = Integer.parseInt(linesPre[i]);
        in[i]  = Integer.parseInt(linesIn[i] );
      }

      solve();

    } catch ( IOException e ) {
      System.out.println("IOException!");
    }
  }
  
  void solve() {
    pPre = pPost = 0;
    StringBuilder buf = new StringBuilder();

    rec(0,pre.length);

    for (int var : post) {
      buf.append(var).append(" ");
    }
    buf.setLength(buf.length()-1);
    System.out.println(buf);
  }

  void rec(int l, int r) {
    if( l < r ) {
      int root = pre[pPre++];
      int m = arrayDistance(0, in.length, root);

      rec(l,m);
      rec(m+1,r);
  
      post[pPost++] = root;
    }
  }

  int arrayDistance(int start, int end, int find) {
    int d=start;

    for( ; d<end; d++)
      if( in[d] == find ) break;

    return d;
  }
}

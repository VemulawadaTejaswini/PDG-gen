import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Main {

  final byte ROW       = 3;
  final byte MATRIX    = 9;
  final byte DIRECTION = 4;
  final byte[] dx = {-1, 0, 1, 0};
  final byte[] dy = { 0,-1, 0, 1};
  final String[] dir = {"u","l","d","r"};

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      Puzzule first;
      String[] line ;
      byte[] inPuzzle = new byte[MATRIX];
      int posSpace = 0;

      for(int i=0; i<MATRIX; ) {
        line = br.readLine().split(" ");
        for(int j=0; j<ROW; j++, i++) {
          inPuzzle[i] = (byte)Integer.parseInt(line[j]);
          if(inPuzzle[i] == 0) {
            inPuzzle[i] = (byte)MATRIX;
            posSpace = i;
          }
        }
      }

      first = new Puzzule(inPuzzle, (byte)posSpace);
      System.out.println( bfs(first).length() );
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  private String bfs(Puzzule s) {
    Queue<Puzzule> queue = new ArrayDeque<>();
    Set<Puzzule> set = new HashSet<>();
    Puzzule u, v;
    queue.offer(s);
    set.add(s);

    byte sx,sy,tx,ty;
    while(!queue.isEmpty()) {
      u = queue.poll();

      if(u.isTarget()) {
        // System.out.println(queue.size());
        // System.out.println(set.size());
        return u.path;
      }

      sx = (byte)(u.space / ROW);
      sy = (byte)(u.space % ROW);
      for(int i=0; i<DIRECTION; i++) {
        tx = (byte)(sx + dx[i]);
        ty = (byte)(sy + dy[i]);
        if(tx<0 || ty<0 || tx>=ROW || ty>=ROW)
          continue;
        
        v = u.clone();
        v.swap(u.space, tx*ROW+ty);
        if(set.add(v)) {
          v.path += dir[i];
          queue.offer(v);
        }
      }
    }

    return "unsolvable.";
  }

  class Puzzule implements Cloneable {

    byte[] mat;
    byte   space;
    String path;
    long   state;

    public Puzzule() {
      mat = null;
      space = 0;
      path = "";
      state = 0;
    }
    public Puzzule(byte[] mat, byte space) {
      this.mat = mat;
      this.space = space;
      path = "";
      updateState();
    }

    @Override
    public boolean equals(Object obj) {
      if(obj == this) return true;
      if(obj == null) return false;
      if(!(obj instanceof Puzzule)) return false;

      Puzzule ref = (Puzzule)obj;

      return this.state == ref.state ? true : false;
    }
    @Override
    public int hashCode() {
      int result = 31;

      return result * 17 + Long.valueOf(state).hashCode();
    }
    @Override
    public Puzzule clone() {
      Puzzule ret = new Puzzule();
      ret.mat   = this.mat.clone();
      ret.space = this.space;
      ret.path  = this.path;
      ret.state = this.state;

      return ret;
    }

    public boolean isTarget() {
      for(int i=0; i<MATRIX; i++)
        if(mat[i]!=(i+1)) return false;

      return true;
    }
    public void swap(int a, int b) {
      byte t = mat[a]; mat[a] = mat[b]; mat[b] = t;
      space = (byte)b;
      updateState();
    }
    public void updateState() {
      state = 0;
      for (byte var : mat) {
        state = state * 10 + var;
      }
    }
  }
}

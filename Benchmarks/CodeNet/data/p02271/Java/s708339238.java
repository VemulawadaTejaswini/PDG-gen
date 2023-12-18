import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      StrSplitToInt str;
      int n = Integer.parseInt(br.readLine());
      int[] seqA = new int[n];
      str = new StrSplitToInt(br.readLine(), " ");
      for(int i=0; i<n; i++) {
        seqA[i] = str.nextInt();
      }
      int q = Integer.parseInt(br.readLine());
      int[] seqQ = new int[q];
      str = new StrSplitToInt(br.readLine(), " ");
      for(int i=0; i<q; i++) {
        seqQ[i] = str.nextInt();
      }

      boolean result = false;
      int i=0;
      for (int m : seqQ) {
        if( solve(n, seqA, i, m) )
          System.out.println("yes");
        else
          System.out.println("no");
      }
    }
  }

  private static boolean solve(int n, int[] a, int i, int m) {
    if( m == 0 ) return true;
    if( i >= n ) return false;

    boolean res = solve(n, a, i+1, m) || solve(n, a, i+1, m-a[i]);

    return res;
  }
}
 
class StrSplitToInt {
  final String s;
  final String split;
  final int endPos;
  final int splitLen;
  int currentPos;
  int nextPos;
 
  public StrSplitToInt(String s,String split) {
    this.s = s;
    this.split = split;
    currentPos = 0;
    nextPos = s.indexOf(split, currentPos);
    endPos = s.length();
    splitLen = split.length();
  }
 
  public int nextInt() {
    if( currentPos < endPos ) {
      int ret = Integer.parseInt( s.substring(currentPos, nextPos) );
      currentPos = nextPos + splitLen;
      nextPos = s.indexOf(split, currentPos);
      if(nextPos == -1) nextPos = endPos;
 
      return ret;
    }
    else
      return -1;
  }
}

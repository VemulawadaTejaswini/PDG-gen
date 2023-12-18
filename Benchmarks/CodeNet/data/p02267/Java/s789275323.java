import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int[] seqS = new int[n];
      String[] line = br.readLine().split(" ");
      for (int i=0; i<n; i++)
        seqS[i] = Integer.parseInt(line[i]);

      int q = Integer.parseInt(br.readLine());
      int[] seqT = new int[q];
      line = br.readLine().split(" ");
      for(int i=0; i<q; i++)
        seqT[i] = Integer.parseInt(line[i]);
      
      int cnt=0;
      for (int ref : seqT) {
        if( linearSeach(seqS, ref) )
          cnt++;
      }

      System.out.println(cnt);
    }
  }

  static boolean linearSeach(int[] tar, int ref) {

    for (int i : tar) {
      if(i == ref) return true;
    }

    return false;
  }
}

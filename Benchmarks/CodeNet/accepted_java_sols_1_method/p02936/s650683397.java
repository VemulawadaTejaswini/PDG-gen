import java.util.*;
import java.io.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int Q = Integer.parseInt(sc.next());
    int[][] ab = new int[N][2];
    int[] p = new int[Q];
    int[] x = new int[Q];

    for (int i = 1; i < N; i++) {
      ab[i][0] = Integer.parseInt(sc.next());
      ab[i][1] = Integer.parseInt(sc.next());
    }

    for (int i = 0; i < Q; i++) {
      p[i] = Integer.parseInt(sc.next());
      x[i] = Integer.parseInt(sc.next());
    }

    sc.close();

    int[] v = new int[N+1];

    for (int i = 0; i < Q; i++) {
      v[p[i]] += x[i];
    }

    Arrays.sort(ab, (a,b) -> Integer.compare(a[0],b[0]));
    Arrays.sort(ab, (a,b) -> Integer.compare(a[1],b[1]));

    for (int i = 1; i < N; i++) {
      v[ab[i][1]] += v[ab[i][0]];
    }

    PrintWriter out = new PrintWriter(System.out);
    
    for (int i = 1; i < N+1; i++) {
      if (i != 1){
        out.print(" ");
      }
      out.print(v[i]);
    }
    
    out.println("");

    out.flush();
    
  }

}
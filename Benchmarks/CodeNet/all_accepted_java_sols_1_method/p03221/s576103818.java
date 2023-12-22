import java.util.*;
import java.io.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    // p[i][0]...市, p[i][1]...県, p[i][2]...誕生年, p[i][3]...県内の順番
    int[][] p = new int[M][4];

    for (int i = 0; i < M; i++) {
      p[i][0] = i; 
      p[i][1] = Integer.parseInt(sc.next());
      p[i][2] = Integer.parseInt(sc.next());
    }

    sc.close();

    Arrays.sort(p, (o1, o2) -> o1[1] == o2[1] ? o1[2] - o2[2] : o1[1] - o2[1]);

    int k = 1;

    p[0][3] = k;
    
    for (int i = 1; i <= M - 1; i++) {
      if (p[i-1][1] == p[i][1]) {
        k++;
        p[i][3] = k;
      } else {
        k = 1;
        p[i][3] = k;
      }
    }

    Arrays.sort(p, (o1, o2) -> o1[0] - o2[0]);

    PrintWriter out = new PrintWriter(System.out);

    for (int i = 0; i < M; i++) {
      out.println(String.format("%06d", p[i][1]) + String.format("%06d", p[i][3]));
    }

    out.flush();

  }

}
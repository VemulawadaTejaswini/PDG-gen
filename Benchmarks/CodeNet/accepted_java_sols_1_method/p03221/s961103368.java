import java.util.*;
import java.io.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());;
    int M = Integer.parseInt(sc.next());;
    int[][] P = new int[M][4];
    
    for (int i = 0; i < M; i++) {
      P[i][0] = i;
      P[i][1] = Integer.parseInt(sc.next());;
      P[i][2] = Integer.parseInt(sc.next());;
      P[i][3] = 0; 
    }

    sc.close();

    Arrays.sort(P, (o1, o2) -> o1[1] == o2[1] ? o1[2] - o2[2] : o1[1] - o2[1]);

    
    int now = P[0][1];
    int count = 0;

    for (int i = 0; i < M; i++) {
      if (now == P[i][1]) {
        count++;
      } else {
        count = 1;
        now = P[i][1];
      }
      P[i][3] = count;
    }

    Arrays.sort(P, (a, b) -> Integer.compare(a[0],b[0]));

    PrintWriter out = new PrintWriter(System.out);
    for (int i = 0; i < M; i++) {
      out.println(String.format("%06d", P[i][1]) + String.format("%06d", P[i][3]));
    }
    out.flush();

  }

}
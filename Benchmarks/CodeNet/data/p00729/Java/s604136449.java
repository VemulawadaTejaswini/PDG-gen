import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      if (N == 0) return;
      int r = sc.nextInt();
      int timetable[][] = new int[M+1][1260+1];

      for (int i = 0; i < r; i++) {
        int t = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        if (s == 1) timetable[m][t]++;
        else timetable[m][t]--;
      }

      for (int i = 540; i < 1260+1; i++)
        for (int j = 1; j <= M; j++)
          if (i > 540)
            timetable[j][i] += timetable[j][i-1];

      int q = sc.nextInt();
      for (int i = 0; i < q; i++) {
        int ts = sc.nextInt();
        int te = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for (int t = ts; t < te; t++)
          if (timetable[m][t] >= 1) count++;
        System.out.println(count);
      }
    }
  }
}


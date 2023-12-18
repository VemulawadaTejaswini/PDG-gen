import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int N = sc.nextInt();
      if (N == 0) return;

      int info[][] = new int[N+1][N];
      int index[] = new int[N+1];
      for (int i = 1; i < N+1; i++) {
        index[i] = sc.nextInt();
        for (int j = 0; j < index[i]; j++) {
          info[i][j] = sc.nextInt();
          //System.out.println("info["+(i)+"]["+j+"]:"+info[i][j]);
        }
      }

      int n = sc.nextInt();
      int a[] = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      int ansCount = N;
      boolean isHannin[] = new boolean[N+1];
      for (int i = 1; i <= N; i++) {
        if (index[i] == 0) {
          isHannin[i] = false;
          ansCount--;
        }
        else isHannin[i] = true;
      }

      for (int i = 0; i < n; i++) {
        for (int j = 1; j < N+1; j++) {
          if (isHannin[j] == false) continue;
          for (int k = 0; k < index[j]; k++) {
            if (info[j][k] == a[i]) break;
            if (k == index[j]-1) {
              //System.out.println("false:" + j);
              isHannin[j] = false;
              ansCount--;
            }
          }
        }
      }

      if (ansCount == 1) {
        for (int i = 1; i <= N; i++) {
          if (isHannin[i] == true)
            System.out.println(i);
        }
      }
      else System.out.println("-1");
    }
  }
}


import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String[] s = new String[h];
    int[][] sk = new int[h][w];
    for(int i = 0; i < h; i++) {
      s[i] = sc.next();
    }
    for(int i = 0; i < h; i++) {
      String str = s[i];
      for(int j = 0; j < w; j++) {
        if(str.charAt(j) == '#') sk[i][j] = 1;
      }
    }
    int[][] rightm = new int[h][w];
    int[][] leftm = new int[h][w];
    int[][] abovem = new int[h][w];
    int[][] belowm = new int[h][w];
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        if(i == 0) {
          if(sk[i][j] == 1) {
            abovem[i][j] = 0;
          } else {
            abovem[i][j] = -1;
          }
        } else {
          if(sk[i][j] == 1) {
            abovem[i][j] = i;
          } else {
            abovem[i][j] = abovem[i - 1][j];
          }
        }
        if(j == 0) {
          if(sk[i][j] == 1) {
            leftm[i][j] = 0;
          } else {
            leftm[i][j] = -1;
          }
        } else {
          if(sk[i][j] == 1) {
            leftm[i][j] = j;
          } else {
            leftm[i][j] = leftm[i][j - 1];
          }
        }
      }
    }

    for(int i = h - 1; i >= 0; i--) {
      for(int j = w - 1; j >= 0; j--) {
        if(i == h - 1) {
          if(sk[i][j] == 1) {
            belowm[i][j] = h - 1;
          } else {
            belowm[i][j] = h;
          }
        } else {
          if(sk[i][j] == 1) {
            belowm[i][j] = i;
          } else {
            belowm[i][j] = belowm[i + 1][j];
          }
        }
        if(j == w - 1) {
          if(sk[i][j] == 1) {
            rightm[i][j] = w - 1;
          } else {
            rightm[i][j] = w;
          }
        } else {
          if(sk[i][j] == 1) {
            rightm[i][j] = j;
          } else {
            rightm[i][j] = rightm[i][j + 1];
          }
        }
      }
    }
    int ans = 0;
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        if(sk[i][j] != 1) {
          int a = rightm[i][j] - leftm[i][j] - 1;
          int b = belowm[i][j] - abovem[i][j] - 1;
          ans = Math.max(ans, a + b - 1);
        }
      }
    }
    System.out.println(ans);
  }
}
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String[][] data = new String[h][w];
    int[] H = new int[h];
    int[] W = new int[w];

    for (int i = 0; i < h; i++) {
      String s = sc.next();
      for (int j = 0; j < w; j++) {
        data[i][j] = s.substring(j,j+1);
      }
    }

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (data[i][j].equals("#")) {
          H[i]++;
        }
      }
    }

    for (int j = 0; j < w; j++) {
      for (int i = 0; i < h; i++) {
        if (data[i][j].equals("#")) {
          W[j]++;
        }
      }
    }

    // for (int i = 0; i < w; i++) {
    //   System.out.println(H[i]+"   "+W[i]);
    // }

    for (int i = 0; i < h; i++) {
      if (H[i] == 0) continue;
      for (int j = 0; j < w; j++) {
        if (W[j] == 0) continue;
      System.out.print(data[i][j]);
      }
      System.out.println("");
    }
  }

}

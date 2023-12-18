import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdInt = new Scanner(System.in);

  int[][] ans = new int[300][2]; //int[][] の方にh,w代入
  int i = 0;
    while(true) {
      int h, w;
      h = stdInt.nextInt();
      w = stdInt.nextInt();
      if (h == 0 && w == 0) break;
      ans[i][0] = h;
      ans[i++][1] = w;
    }

    for (int j = 0; j < i; j++) {
      for (int k = 0; k < ans[j][0]; k++) {
        for (int l = 0; l < ans[j][1]; l++) {
          System.out.print("#");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}

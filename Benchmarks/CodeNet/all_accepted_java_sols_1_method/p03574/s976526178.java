import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int H = sc.nextInt();
    int W = sc.nextInt();

    String[][] S = new String[H][W];

    for (int i = 0; i < H; i++) {
      String s = sc.next();
      S[i] = s.split("");
    }

    sc.close();

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (S[i][j].equals(".")) {

          int count = 0;

          boolean checkU = true;
          boolean checkD = true;
          boolean checkR = true;
          boolean checkL = true;

          if (i == 0) {
            checkU = false;
          }
          if (i == H - 1){
            checkD = false;
          }
          if (j == 0) {
            checkL = false;
          }
          if (j == W - 1) {
            checkR = false;
          }

          if (checkU) {
            if (S[i-1][j].equals("#")){
              count++;
            }
          }

          if (checkD) {
            if (S[i+1][j].equals("#")){
              count++;
            }
          }

          if (checkL) {
            if (S[i][j-1].equals("#")){
              count++;
            }
          }

          if (checkR) {
            if (S[i][j+1].equals("#")){
              count++;
            }
          }

          if (checkU && checkL) {
            if (S[i-1][j-1].equals("#")){
              count++;
            }
          }

          if (checkU && checkR) {
            if (S[i-1][j+1].equals("#")){
              count++;
            }
          }

          if (checkD && checkL) {
            if (S[i+1][j-1].equals("#")){
              count++;
            }
          }

          if (checkD && checkR) {
            if (S[i+1][j+1].equals("#")){
              count++;
            }
          }

          S[i][j] = String.valueOf(count);

        }
      }
    }

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        System.out.print(S[i][j]);
      }
      System.out.println("");
    }

  }

}
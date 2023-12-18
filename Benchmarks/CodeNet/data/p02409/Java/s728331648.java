import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][][] h = new int[4][3][10];
    for(int i = 0; i < 4; i++){
      for(int j = 0; j < 3; j++){
        for(int k = 0; k < 10; k++){
          h[i][j][k] = 0;
        }
      }
    }

    int x = Integer.parseInt(sc.next());
    for(int i = 0; i < x; i++){
      int b = Integer.parseInt(sc.next());
      int f = Integer.parseInt(sc.next());
      int r = Integer.parseInt(sc.next());
      int v = Integer.parseInt(sc.next());
      h[b - 1][f - 1][r - 1] += v;
    }

    for(int i = 0; i < 4; i++){
      for(int j = 0; j < 3; j++){
        for(int k = 0; k < 10; k++){
          System.out.printf(" %d", h[i][j][k]);
        }
        System.out.printf("\n");
      }
      if(i != 3)System.out.printf("####################\n");
    }
  }
}

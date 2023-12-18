import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[][] k1 = new int[3][10];
    int[][] k2 = new int[3][10];
    int[][] k3 = new int[3][10];
    int[][] k4 = new int[3][10];

    int n = sc.nextInt();

    for(int i = 0; i < n; i++){
      int b = sc.nextInt();
      int f = sc.nextInt();
      int r = sc.nextInt();
      int v = sc.nextInt();

      if(b == 1){
        k1[f - 1][r - 1] += v;
      } else if(b == 2){
        k2[f - 1][r - 1] += v;
      } else if(b == 3){
        k3[f - 1][r - 1] += v;
      } else {
        k4[f - 1][r - 1] += v;
      }
    }

    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 10; j++){
        System.out.print(" " + k1[i][j]);
      }
      System.out.println();
    }

    for(int i = 0; i < 20; i++){
      System.out.print("#");
    }

    System.out.println();

    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 10; j++){
        System.out.print(" " + k2[i][j]);
      }
      System.out.println();
    }

    for(int i = 0; i < 20; i++){
      System.out.print("#");
    }

    System.out.println();

    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 10; j++){
        System.out.print(" " + k3[i][j]);
      }
      System.out.println();
    }

    for(int i = 0; i < 20; i++){
      System.out.print("#");
    }

    System.out.println();

    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 10; j++){
        System.out.print(" " + k4[i][j]);
      }
      System.out.println();
    }
  }
}


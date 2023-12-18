import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][][] result = new int[4][3][10];
    for(int i = 0; i < n; i++){
      int b = sc.nextInt();
      int f = sc.nextInt();
      int r = sc.nextInt();
      int v = sc.nextInt();
      result[b-1][f-1][r-1] += v;
      if(result[b-1][f-1][r-1] <= 0){
        result[b-1][f-1][r-1] = 0;
      }
      else if(result[b-1][f-1][r-1] >= 9){
        result[b-1][f-1][r-1] = 9;
      }
    }
    for(int i = 0; i < 4; i++){
      for(int j = 0; j < 3; j++){
        for(int k = 0; k < 10; k++){
          System.out.print(" " + result[i][j][k]);
        }
        System.out.println("");
      }
      if(i <3) {
      System.out.println("####################");
      }
    }
  }
}


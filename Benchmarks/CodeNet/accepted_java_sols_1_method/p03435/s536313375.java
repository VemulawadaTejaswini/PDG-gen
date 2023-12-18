import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[][] c = new int[3][3];
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        c[i][j] = scanner.nextInt();
      }
    }
    int[] total = new int[6];
    total[0] = c[0][0] + c[1][1] + c[2][2];
    total[1] = c[0][0] + c[1][2] + c[2][1];
    total[2] = c[0][1] + c[1][0] + c[2][2];
    total[3] = c[0][1] + c[2][0] + c[1][2];
    total[4] = c[0][2] + c[1][1] + c[2][0];
    total[5] = c[0][2] + c[1][0] + c[2][1];
    if (total[0] == total[1] && total[1] == total[2] && total[2] == total[3]
    && total[3] == total[4] && total[4] == total[5]){
      System.out.println("Yes");
    } else {System.out.println("No");}
    }
}

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int[][] coordinate = new int[number + 1][3];
    for (int i = 1; i < number + 1; i++) {
      for (int j = 0; j < 3; j++) {
        coordinate[i][j] = sc.nextInt();
      }
    }
    int[] deltaT = new int[number];
    int[] deltaX = new int[number];
    int[] deltaY = new int[number];
    int[] deltaXY = new int[number];
    for (int i = 0; i < number; i++) {
      deltaT[i] = Math.abs(coordinate[i + 1][0] - coordinate[i][0]);
      deltaX[i] = Math.abs(coordinate[i + 1][1] - coordinate[i][1]);
      deltaY[i] = Math.abs(coordinate[i + 1][2] - coordinate[i][2]);
      deltaXY[i] = deltaX[i] + deltaY[i];
    }
    int count = 0;
    for (int i = 0; i < number; i++) {
      if (deltaT[i] >= deltaXY[i]) {
        if ((deltaT[i] % 2 == 0 && deltaXY[i] % 2 == 0) || (deltaT[i] % 2 == 1 && deltaXY[i] % 2 == 1)) {
          count++;
        } else {
          System.out.println("No");
          break;
        }
      } else {
        System.out.println("No");
        break;
      }
    }
    if (count == number) {
      System.out.println("Yes");
    }
  }
}
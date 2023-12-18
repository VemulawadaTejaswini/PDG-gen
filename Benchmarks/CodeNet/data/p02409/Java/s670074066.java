import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int info = sc.nextInt();

    int[][][] floors = new int [4][3][10];

    for(int i = 0; i < info; i++) {
      int tou = sc.nextInt();
      int floor = sc.nextInt();
      int roonNum = sc.nextInt();
      int persons = sc.nextInt();
      floors[tou - 1][floor - 1][roonNum - 1] += persons;
    }
    sc.close();

    printArray(floors);
  }

  public static void printArray(int[][][] floorData) {
    for(int i = 0; i < floorData.length; i++) {
      for(int j = 0; j < floorData[i].length; j++) {
        for(int l = 0; l < 10; l++) {
          System.out.print(" " + floorData[i][j][l]);
        }
        System.out.println();
      }

      if(i != 3) {
        System.out.print("####################");
        System.out.println();
      }
    }
  }
}

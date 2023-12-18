import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

  public static class Building {

    int[][] floorRooms;

    public Building() {
      this.floorRooms = new int[3][10];
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 10; j++) {
          this.floorRooms[i][j] = 0;
        }
      }
    }

    public void update(int f, int r, int v) {
      this.floorRooms[f][r] += v;
    }

    public void display() {
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 10; j++) {
          System.out.print(" " + this.floorRooms[i][j]);
        }
        System.out.println();
      }
    }

  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    Building[] buildings = {
      new Building(),
      new Building(),
      new Building(),
      new Building()
    };
    for (int i = 0; i < n; i++) {
      int b = s.nextInt() - 1;
      int f = s.nextInt() - 1;
      int r = s.nextInt() - 1;
      int v = s.nextInt();
      buildings[b].update(f, r, v);
    }
    s.close();
    for (int i = 0; i < 4; i++) {
      buildings[i].display();
      if (i != 3)
        System.out.println("####################");
    }
  }
}


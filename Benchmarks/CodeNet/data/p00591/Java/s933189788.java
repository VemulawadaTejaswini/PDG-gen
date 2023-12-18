import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static void solve(int n, int[][] students) {
    int[][] hands = new int[n][n];
    for (int i = 0; i < n; i++) {
      int min = Integer.MAX_VALUE;
      List<Integer> indices = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        if (students[i][j] < min) {
          min = students[i][j];
          indices.clear();
          indices.add(j);
        } else if (students[i][j] == min) {
          indices.add(j);
        }
      }
      for (int index : indices) hands[i][index]++;
    }
    for (int j = 0; j < n; j++) {
      int max = 0;
      List<Integer> indices = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        if (students[i][j] > max) {
          max = students[i][j];
          indices.clear();
          indices.add(i);
        } else if (students[i][j] == max) {
          indices.add(i);
        }
      }
      for (int index : indices) hands[index][j]++;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (hands[i][j] == 2) {
          System.out.println(students[i][j]);
          return;
        }
      }
    }
    System.out.println(0);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int n = Integer.parseInt(sc.nextLine());
      if (n == 0) break;
      int[][] students = new int[n][n];
      for (int i = 0; i < n; i++) {
        String[] cols = sc.nextLine().split(" ");
        for (int j = 0; j < n; j++) {
          students[i][j] = Integer.parseInt(cols[j]);
        }
      }
      solve(n, students);
    }
    sc.close();
  }
}



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    int h = cin.nextInt();
    int w = cin.nextInt();
    char[][] matrix = new char[h][w];
    int count = 0;
    Queue<int[]> waiting = new LinkedList<>();
    for (int i = 0; i < h; i++) {
      char[] item = cin.next().toCharArray();
      matrix[i] = item;
      for (int j = 0; j < w; j++) {
        if (item[j] == '#')
          waiting.add(new int[]{i, j});
      }
    }

    int res = 0;
    while (!waiting.isEmpty()) {
      int size = waiting.size();
      for (int k = 0; k < size; k++) {
        int[] pos = waiting.poll();
        int i = pos[0];
        int j = pos[1];
        if (matrix[Math.max(0, i - 1)][j] == '.') {
          matrix[Math.max(0, i - 1)][j] = '#';
          waiting.add(new int[]{Math.max(0, i - 1), j});
        }
        if (matrix[Math.min(h - 1, i + 1)][j] == '.') {
          matrix[Math.min(h - 1, i + 1)][j] = '#';
          waiting.add(new int[]{Math.min(h - 1, i + 1), j});
        }
        if (matrix[i][Math.max(0, j - 1)] == '.') {
          matrix[i][Math.max(0, j - 1)] = '#';
          waiting.add(new int[]{i, Math.max(0, j - 1)});
        }
        if (matrix[i][Math.min(w - 1, j + 1)] == '.') {
          matrix[i][Math.min(w - 1, j + 1)] = '#';
          waiting.add(new int[]{i, Math.min(w - 1, j + 1)});
        }
      }
      res++;
//      for (char[] item : matrix)
//        System.out.println(Arrays.toString(item));
//      System.out.println(" ");

    }

    System.out.println(res-1);
  }

}
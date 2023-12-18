import java.util.Scanner;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[][] graph = new int[size+1][size+1];

    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {
        graph[i][j] = 0;
      }
    }

    int addr;
    int time;
    for (int i = 0; i < size; i++) {
      addr = sc.nextInt();
      time = sc.nextInt();
      for (int j = 0; j < time; j++) {
        graph[addr][sc.nextInt()] = 1;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {
        sb.append(graph[i][j]).append(' ');
      }
      System.out.println(sb.deleteCharAt(sb.length() - 1));
      sb.setLength(0);
    }
  }
}


import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[][] red = new int[N][2];
    int[][] blue = new int[N][2];

    for (int i = 0; i < N; i++){
      red[i][0] = scanner.nextInt();
      red[i][1] = scanner.nextInt();
    }
    for (int i = 0; i < N; i++){
      blue[i][0] = scanner.nextInt();
      blue[i][1] = scanner.nextInt();
    }
    int count = 0;
    boolean[] visited = new boolean[N];

    Arrays.sort(blue, Comparator.comparingInt(o1 -> o1[0]));
    Arrays.sort(red, Comparator.comparingInt(o1 -> -o1[1]));

    for (int i = 0; i < N; i++){
      for (int j = 0; j < N; j++){
        if (!visited[j] && blue[i][0] > red[j][0] && blue[i][1] > red[j][1]){
          count++;
          visited[j] = true;
          break;
        }
      }
    }
    System.out.println(count);
  }
}
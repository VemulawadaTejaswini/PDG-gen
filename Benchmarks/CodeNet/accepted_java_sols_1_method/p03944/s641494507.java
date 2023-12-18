import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int w = scanner.nextInt();
    int h = scanner.nextInt();
    int n = scanner.nextInt();
    
    int[] x = new int[n];
    int[] y = new int[n];
    int[] a = new int[n];
    
    for(int i = 0; i < n; i++) {
      x[i] = scanner.nextInt();
      y[i] = scanner.nextInt();
      a[i] = scanner.nextInt();
    }
    
    boolean[][] map = new boolean[w][h];
    for(int i = 0; i < n; i++) {
      if(a[i] == 1) {
        for(int j = 0; j < x[i]; j++) {
          for(int k = 0; k < h; k++) {
          	map[j][k] = true;
          }
        }
      } else if(a[i] == 2) {
        for(int j = w - 1; j >= x[i]; j--) {
          for(int k = 0; k < h; k++) {
          	map[j][k] = true;
          }
        }
      } else if(a[i] == 3) {
        for(int j = 0; j < w; j++) {
          for(int k = 0; k < y[i]; k++) {
          	map[j][k] = true;
          }
        }
      } else {
        for(int j = 0; j < w; j++) {
          for(int k = h - 1; k >= y[i]; k--) {
          	map[j][k] = true;
          }
        }
      }
    }
    
    int count = 0;
    for(int i = 0; i < w; i++) {
      for(int j = 0; j < h; j++) {
        if(!map[i][j]) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
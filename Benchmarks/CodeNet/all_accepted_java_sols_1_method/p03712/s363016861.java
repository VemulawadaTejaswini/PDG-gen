import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String[] a = new String[h];
    char[][] b = new char[h][w];
    for(int i = 0; i < h; i++) {
      a[i] = sc.next();
      for(int j = 0; j < w; j++) {
        b[i][j] = a[i].charAt(j);
      }
    }
    for(int i = 0; i < h + 2; i++) {
      for(int j = 0; j < w + 2; j++) {
        if(i == 0 || i == h + 1) {
          System.out.print("#");
        }else{
          if(j == 0 || j == w+1) {
            System.out.print("#");
          }else{
            System.out.print(b[i-1][j-1]);
          }
        }
      }
      System.out.println();
    }
  }
}

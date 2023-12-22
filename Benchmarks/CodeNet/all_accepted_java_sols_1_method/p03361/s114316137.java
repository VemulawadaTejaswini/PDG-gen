import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String[][] fig = new String[h][w];
    for(int i = 0; i < h; i++) {
      String s = sc.next();
      for(int j = 0; j < w; j++) {
        fig[i][j] = String.valueOf(s.charAt(j));
      }
    }
    int f = 0;
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        if(!(fig[i][j].equals("."))) {
          int t = 0;
          if((j - 1) >= 0) {
            if(!(fig[i][j - 1].equals("."))) t++;
          }
          if((i - 1) >= 0) {
            if(!(fig[i - 1][j].equals("."))) t++;
          }
          if((j + 1) < w) {
            if(!(fig[i][j + 1].equals("."))) t++;
          }
          if((i + 1) < h) {
            if(!(fig[i + 1][j].equals("."))) t++;
          }
          if(t == 0) f++;
        }
      }
    }
    String ans = "Yes";
    if(f > 0) ans = "No";
    System.out.println(ans);
  }
}
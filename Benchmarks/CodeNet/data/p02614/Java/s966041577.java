import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int H = sc.nextInt();
    int W = sc.nextInt();
    int K = sc.nextInt();
    int ans =0;
    String[] c = new String[H];
    for (int i =0; i<H; i++) {
      c[i] = sc.next();
    }
    boolean[][] cc = new boolean[H][W];
    boolean[][] cd = new boolean[H][W];
    for (int i =0; i<H; i++) {
      for (int j =0; j<W; j++) {
        if(c[i].charAt(j) == '.') cc[i][j] = false;
        if(c[i].charAt(j) == '#') cc[i][j] = true;
      }
    }
    for (int k =0; k<Math.pow(2,H+W); k++) {
      String bit = Integer.toBinaryString(k);//iをビットに変換
      int length = bit.length();
      for (int i =0; i<H+W-length; i++) {
        bit = "0" + bit;
      }
      int count =0;
      for (int i =0; i<H; i++) {
        for (int j =0; j<W; j++) {
          cd[i][j] = cc[i][j];
        }
      }
      for (int i =0; i<H; i++) {
        if (bit.charAt(i) == '1') {
          for (int j =0; j<W; j++) {
            cd[i][j] = false;
          }
        }
      }
      for (int i =H; i<W+H; i++) {
        if (bit.charAt(i) == '1') {
          for (int j =0; j<H; j++) {
            cd[j][i-H] = false;
          }
        }
      }
      for (int i =0; i<H; i++) {
        for (int j =0; j<W; j++) {
          if (cd[i][j] == true) count++;
        }
      }
      if (count == K) ans++;
    }
  System.out.println(ans);
  }
}
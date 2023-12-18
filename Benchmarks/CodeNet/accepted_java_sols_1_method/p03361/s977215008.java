import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    boolean check = true;
    char[][] s = new char[H][W];
    for (int i =0; i<H; i++) {
      String a = sc.next();
      for (int j =0; j<W; j++) {
        s[i][j] = a.charAt(j);
      }
    }
    for (int i =1; i<H-1; i++) {
      for (int j =1; j<W-1; j++) {
        if (s[i][j] == '#') {
          if (s[i+1][j] == '.' && s[i-1][j] == '.' && s[i][j-1] == '.' && s[i][j+1] == '.') {
            check = false;
            break;
          }
        }
      }
    }
    if (s[0][0] == '#') {
      if (s[0][1] == '.' && s[1][0] == '.' ) check = false; 
    }
    if (W >= 2) {
      if (s[0][W-1] == '#') {
        if (s[0][W-2] == '.' && s[1][W-1] == '.' ) check = false; 
      }
    }
    if (H >= 2) {
      if (s[H-1][0] == '#') {
        if (s[H-2][0] == '.' && s[H-1][1] == '.' ) check = false; 
      }
    }
    if (H >= 2 && W >= 2) {
      if (s[H-1][W-1] == '#') {
        if (s[H-2][W-1] == '.' && s[H-1][W-2] == '.' ) check = false; 
      }
    }
    for (int i =1; i<H-1; i++) {
      if (s[i][0] == '#') {
        if (s[i+1][0] == '.' && s[i-1][0] == '.' && s[i][1] == '.') check = false;
      }
    }

    for (int i =1; i<H-1; i++) {
      if (s[i][W-1] == '#') {
        if (s[i+1][W-1] == '.' && s[i-1][W-1] == '.' && s[i][W-2] == '.') check = false;
      }
    }

    for (int i =1; i<W-1; i++) {
      if (s[H-1][i] == '#') {
        if (s[H-1][i+1] == '.' && s[H-1][i-1] == '.' && s[H-2][i] == '.') check = false;
      }
    }
    for (int i =1; i<W-1; i++) {
      if (s[0][i] == '#') {
        if (s[0][i+1] == '.' && s[0][i-1] == '.' && s[1][i] == '.') check = false;
      }
    }
    if (check) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}    
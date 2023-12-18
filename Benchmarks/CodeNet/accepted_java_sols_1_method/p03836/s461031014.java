import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sx = sc.nextInt();
    int sy = sc.nextInt();
    int tx = sc.nextInt();
    int ty = sc.nextInt();
    
    StringBuilder ans = new StringBuilder();
    for (int y = sy; y < ty; y++) {
      ans.append('U');
    }
    for (int x = sx; x < tx; x++) {
      ans.append('R');
    }
    for (int y = ty; y > sy; y--) {
      ans.append('D');
    }
    for (int x = tx; x > sx; x--) {
      ans.append('L');
    }

    ans.append('L');
    for (int y = sy; y < ty+1; y++) {
      ans.append('U');
    }
    for (int x = sx-1; x < tx; x++) {
      ans.append('R');
    }
    ans.append('D');
    ans.append('R');
    for (int y = ty; y > sy-1; y--) {
      ans.append('D');
    }
    for (int x = tx+1; x > sx; x--) {
      ans.append('L');
    }
    ans.append('U');

    System.out.println(ans.toString());
  }
}
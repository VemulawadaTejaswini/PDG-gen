import java.util.*;
 
public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    int f = in.nextInt();
    for (int i = 0; i < 3; i++) {
      int dum = in.nextInt();
    }
    int l = in.nextInt();
    int w = in.nextInt();
    String ans = w < l - f ? ":(" : "Yay!";
    System.out.println(ans);
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = "";
    String t = "";
    for(int i = 0; i < w; i++) {
      if(i < a) {
        s += "0";
        t += "1";
      } else {
        s += "1";
        t += "0";
      }
    }
    for(int i = 0; i < h; i++) {
      if(i < b) {
        System.out.println(s);
      } else {
        System.out.println(t);
      }
    }
  }
}
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String[] a = new String[h];

    for (int i = 0; i < h; i++) {
      a[i] = sc.next();
    }

    for (int j = 0; j < w+2; j++) {
      System.out.print("#");
    }

    System.out.println();


    for (int j = 0; j < h; j++) {
      System.out.print("#"+a[j]);
      System.out.println("#");
    }

    for (int j = 0; j < w+2; j++) {
      System.out.print("#");
    }

    System.out.println();

  }

}

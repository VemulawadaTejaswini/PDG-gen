import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int h = s.nextInt();
    int w = s.nextInt();
    while (h != 0 && w != 0) {
      for (int i = 0; i < h; i++) {
        String st = "";
        for (int j = 0; j < w; j++) {
          if (i % 2 == 0 && j % 2 == 0)
            st += "#";
          else if (i % 2 == 0 && j % 2 != 0)
            st += ".";
          else if (i % 2 != 0 && j % 2 == 0)
            st += ".";
          else
            st += "#";
        }
        System.out.println(st);
      }
      System.out.println();
      h = s.nextInt();
      w = s.nextInt();
    }
    s.close();
  }
}


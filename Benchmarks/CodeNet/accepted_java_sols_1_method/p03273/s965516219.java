import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String[] yoko = new String[h];
    for (int i = 0; i < h; i++) {
      yoko[i] = sc.next();
    }
    String[] yoko_c = new String[h];
    int y_idx = 0;
    for (int i = 0; i < h; i++) {
      if (yoko[i].contains("#")) {
        yoko_c[y_idx] = yoko[i];
        y_idx++;
      }
    }
    ArrayList<Integer> ary = new ArrayList<>();
    for (int i = 0; i < w; i++) {
      boolean flag = false;
      for (int j = 0; j < y_idx; j++) {
        if (yoko_c[j].charAt(i) == '#') {
          flag = true;
        }
      }
      if (flag) {
        ary.add(i);
      }
    }
    for (int i = 0; i < y_idx; i++) {
      for (int j = 0; j < ary.size(); j++) {
        System.out.print(yoko_c[i].charAt(ary.get(j)));
      }
      System.out.println();
    }
  }
}
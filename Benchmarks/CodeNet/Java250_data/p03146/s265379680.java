import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    sc.close();
    List<Integer> ls = new ArrayList<>();
    ls.add(s);
    int c = s;
    for (int i = 1; i < 1000000; i++) {
      if (c % 2 == 0) {
        int f1 = c/2;
        if (ls.contains(f1)) {
          System.out.println(ls.size()+1);
          return;
        }
        ls.add(f1);
        c = f1;
      } else {
        int f2 = 3 * c + 1;
        if (ls.contains(f2)) {
          System.out.println(ls.size()+1);
          return;
        }
        ls.add(f2);
        c = f2;
      }
    }
  }
}

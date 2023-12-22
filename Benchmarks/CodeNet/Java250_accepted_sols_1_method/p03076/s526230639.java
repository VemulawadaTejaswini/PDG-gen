import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> menu = new ArrayList<Integer>();
    while (sc.hasNext()) {
      menu.add(sc.nextInt());
    }
    int min =10, total =0, last =0;
    for (int j=1; j<10; j++) {
      for (int i=0; i<menu.size(); i++) {
        if (menu.get(i) % 10 == 0) continue;
        if (menu.get(i) % 10 < min) {
          min = menu.get(i) % 10;
          last = i;
        }
      }
    }
    for (int i=0; i<menu.size(); i++) {
      if (i == last) continue;
      double ex = Math.ceil((double)menu.get(i)/10);
      total += ex * 10;
    }
    total += menu.get(last);
    System.out.println(total);
  }
}
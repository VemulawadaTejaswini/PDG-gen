import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    ArrayList[] list = new ArrayList[10];
    for(int i = 0; i < 10; i++) {
      list[i] = new ArrayList<Long>();
    }
    ArrayList<Long> l = new ArrayList<Long>();
    for(int j = 1; j < 10; j++) {
      list[0].add((long)j);
      l.add((long)j);
    }
    for(int i = 1; i < 10; i++) {
      for(int j = 0; j < list[i - 1].size(); j++) {
        long a = (long)list[i - 1].get(j);
        long d = a % 10;
        if(d == 0) {
          list[i].add(10 * a + d + 1);
          list[i].add(10 * a + d);
          l.add(10 * a + d + 1);
          l.add(10 * a + d);
        } else if(d == 9) {
          list[i].add(10 * a + d - 1);
          list[i].add(10 * a + d);
          l.add(10 * a + d - 1);
          l.add(10 * a + d);
        } else {
          list[i].add(10 * a + d - 1);
          list[i].add(10 * a + d);
          list[i].add(10 * a + d + 1);
          l.add(10 * a + d - 1);
          l.add(10 * a + d);
          l.add(10 * a + d + 1);
        }   
      }
    }
    Collections.sort(l);
    System.out.println(l.get(k - 1));
  }
}

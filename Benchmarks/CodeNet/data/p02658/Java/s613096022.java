
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    List<Long> l = new ArrayList<Long>();
    for(int i = 0;i < n;i++) {
      l.add(sc.nextLong());
    }

    if(l.contains(0L)) {
      System.out.println(0);
    }else {
      Long max = 1000000000L * 1000000000;

      Long sum = 1L;

      for(Long l2:l) {
        if(sum > max/l2) {
          System.out.println(-1);
          sum = 0L;
          return;
        }
        sum *= l2;
      }
      System.out.println(sum);
    }

    sc.close();
  }

}

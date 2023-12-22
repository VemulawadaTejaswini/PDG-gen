import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt();
    List<Integer> list = new ArrayList<>();
    while (scan.hasNextInt()) {
      list.add(scan.nextInt());
    }
    Collections.sort(list);
    double x = 0;
    for (int num : list) {
      x = x==0?num:(num+x)/2;
    }
    System.out.println(x);
  }
}